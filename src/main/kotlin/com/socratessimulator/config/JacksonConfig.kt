package com.socratessimulator.config

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.BeanDescription
import com.fasterxml.jackson.databind.DeserializationConfig
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier
import com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.node.TextNode
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JacksonConfig {

    /**
     * Existing clients send enum codes as JSON numbers (e.g. `"PartnerRelatietype": 1`), which the real
     * Wigo4it LO API accepts. Jackson would read a number as the enum's ordinal (1 -> "2"), so read it
     * as the code value instead.
     */
    @Bean
    fun numericEnumCodeModule(): Module = SimpleModule("NumericEnumCodeModule")
        .setDeserializerModifier(object : BeanDeserializerModifier() {
            override fun modifyEnumDeserializer(
                config: DeserializationConfig,
                type: JavaType,
                beanDesc: BeanDescription,
                deserializer: JsonDeserializer<*>
            ): JsonDeserializer<*> = NumericEnumCodeDeserializer(deserializer)
        })
}

class NumericEnumCodeDeserializer(delegatee: JsonDeserializer<*>) : DelegatingDeserializer(delegatee) {

    override fun newDelegatingInstance(newDelegatee: JsonDeserializer<*>): JsonDeserializer<*> =
        NumericEnumCodeDeserializer(newDelegatee)

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Any? {
        if (!p.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return _delegatee.deserialize(p, ctxt)
        }
        p.codec.treeAsTokens(TextNode(p.text)).use { codeParser ->
            codeParser.nextToken()
            return _delegatee.deserialize(codeParser, ctxt)
        }
    }
}
