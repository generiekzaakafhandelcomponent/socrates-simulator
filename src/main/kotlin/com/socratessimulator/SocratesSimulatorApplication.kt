package com.socratessimulator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SocratesSimulatorApplication

fun main(args: Array<String>) {
	runApplication<SocratesSimulatorApplication>(*args)
}
