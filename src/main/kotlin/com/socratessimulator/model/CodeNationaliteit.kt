package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = Onbekend, 1 = Nederlandse, 2 = BehandeldalsNederlander, 27 = Slowaakse, 28 = Tsjechische, 29 = BurgervanBosniëHerzegovina, 30 = Georgische, 31 = Turkmeense, 32 = Tadzjiekse, 33 = Oezbeekse, 34 = Oekraïense, 35 = Kirgizische, 36 = Moldavische, 37 = Kazachse, 38 = Belarussische, 39 = Azerbeidzjaanse, 40 = Armeense, 41 = Russische, 42 = Sloveense, 43 = Kroatische, 44 = Letse, 45 = Estische, 46 = Litouwse, 47 = Marshalleilandse, 48 = Myanmarese, 49 = Namibische, 50 = Albanese, 51 = Andorrese, 52 = Belgische, 53 = Bulgaarse, 54 = Deense, 55 = BurgervandeBondsrepubliekDuitsland, 56 = Finse, 57 = Franse, 58 = Jemenitische, 59 = Griekse, 60 = Britsburger, 61 = Hongaarse, 62 = Ierse, 63 = IJslandse, 64 = Italiaanse, 65 = Joegoslavische, 66 = Liechtensteinse, 67 = Luxemburgse, 68 = Maltese, 69 = Monegaskische, 70 = Noorse, 71 = Oostenrijkse, 72 = Poolse, 73 = Portugese, 74 = Roemeense, 75 = BurgervandeSovjetUnie, 76 = SanMarinese, 77 = Spaanse, 78 = TsjechoSlowaakse, 79 = Vaticaanse, 80 = Zweedse, 81 = Zwitserse, 82 = OostDuitse, 83 = Britsonderdaan, 84 = Eritrese, 85 = Britsoverzeesburger, 86 = Macedonische, 87 = Kosovaarse, 88 = BurgervandeRepubliekNoordMacedonië, 100 = Algerijnse, 101 = Angolese, 104 = Burundese, 105 = Botswaanse, 106 = Burkinese, 108 = CentraalAfrikaanse, 109 = Comorese, 110 = BurgervanCongo, 111 = Beninse, 112 = Egyptische, 113 = EquatoriaalGuinese, 114 = Ethiopische, 115 = Djiboutiaanse, 116 = Gabonese, 117 = Gambiaanse, 118 = Ghanese, 119 = Guinese, 120 = Ivoriaanse, 121 = Kaapverdische, 122 = Kameroense, 123 = Kenyaanse, 124 = Zaïrese, 125 = Lesothaanse, 126 = Liberiaanse, 127 = Libische, 128 = Malagassische, 129 = Malawische, 130 = Malinese, 131 = Marokkaanse, 132 = Mauritaanse, 133 = Mauritiaanse, 134 = Mozambikaanse, 135 = Swazische, 136 = Nigerese, 137 = Nigeriaanse, 138 = Ugandese, 139 = GuineeBissause, 140 = ZuidAfrikaanse, 142 = Zimbabwaanse, 143 = Rwandese, 144 = BurgervanSãoToméenPrincipe, 145 = Senegalese, 147 = SierraLeoonse, 148 = Soedanese, 149 = Somalische, 151 = Tanzaniaanse, 152 = Togolese, 154 = Tsjadische, 155 = Tunesische, 156 = Zambiaanse, 157 = ZuidSoedanese, 200 = Bahamaanse, 202 = Belizaanse, 204 = Canadese, 205 = CostaRicaanse, 206 = Cubaanse, 207 = Dominicaanse, 208 = Salvadoraanse, 211 = Guatemalaanse, 212 = Haïtiaanse, 213 = Hondurese, 214 = Jamaicaanse, 216 = Mexicaanse, 218 = Nicaraguaanse, 219 = Panamese, 222 = BurgervanTrinidadenTobago, 223 = Amerikaansburger, 250 = Argentijnse, 251 = Barbadaanse, 252 = Boliviaanse, 253 = Braziliaanse, 254 = Chileense, 255 = Colombiaanse, 256 = Ecuadoraanse, 259 = Guyaanse, 261 = Paraguayaanse, 262 = Peruaanse, 263 = Surinaamse, 264 = Uruguayaanse, 265 = Venezolaanse, 267 = Grenadaanse, 268 = BurgervanSaintKittsenNevis, 300 = Afghaanse, 301 = Bahreinse, 302 = Bhutaanse, 303 = Burmaanse, 304 = Bruneise, 305 = Cambodjaanse, 306 = SriLankaanse, 307 = Chinese, 308 = Cyprische, 309 = Filipijnse, 310 = Taiwanese, 312 = Indiase, 313 = Indonesische, 314 = Iraakse, 315 = Iraanse, 316 = Israëlische, 317 = Japanse, 318 = NoordJemenitische, 319 = Jordaanse, 320 = Koeweitse, 321 = Laotiaanse, 322 = Libanese, 324 = Maldivische, 325 = Maleisische, 326 = Mongolische, 327 = Omaanse, 328 = Nepalese, 329 = NoordKoreaanse, 331 = Pakistaanse, 333 = Qatarese, 334 = SaoediArabische, 335 = Singaporese, 336 = Syrische, 337 = Thaise, 338 = BurgervandeVerenigdeArabischeEmiraten, 339 = Turkse, 340 = ZuidJemenitische, 341 = ZuidKoreaanse, 342 = Vietnamese, 345 = Bengalese, 400 = Australische, 401 = PapoeaNieuwGuinese, 402 = NieuwZeelandse, 404 = WestSamoaanse, 405 = Samoaanse, 421 = BurgervanAntiguaenBarbuda, 424 = Vanuatuaanse, 425 = Fijische, 429 = BurgervanBritseafhankelijkegebieden, 430 = Tongaanse, 431 = Nauruaanse, 432 = Palause, 437 = Amerikaansonderdaan, 442 = Salomonseilandse, 443 = Micronesische, 444 = Seychelse, 445 = Kiribatische, 446 = Tuvaluaanse, 447 = SaintLuciaanse, 448 = BurgervanDominica, 449 = BurgervanSaintVincentendeGrenadines, 450 = BritishNationalOverseas, 451 = BurgervanDemocratischeRepubliekCongo, 452 = BurgervanTimorLeste, 453 = BurgervanServiëenMontenegro, 454 = Servische, 455 = Montenegrijnse, 499 = Staatloos, 500 = VastgesteldnietNederlander
 * Values: _0,_1,_2,_27,_28,_29,_30,_31,_32,_33,_34,_35,_36,_37,_38,_39,_40,_41,_42,_43,_44,_45,_46,_47,_48,_49,_50,_51,_52,_53,_54,_55,_56,_57,_58,_59,_60,_61,_62,_63,_64,_65,_66,_67,_68,_69,_70,_71,_72,_73,_74,_75,_76,_77,_78,_79,_80,_81,_82,_83,_84,_85,_86,_87,_88,_100,_101,_104,_105,_106,_108,_109,_110,_111,_112,_113,_114,_115,_116,_117,_118,_119,_120,_121,_122,_123,_124,_125,_126,_127,_128,_129,_130,_131,_132,_133,_134,_135,_136,_137,_138,_139,_140,_142,_143,_144,_145,_147,_148,_149,_151,_152,_154,_155,_156,_157,_200,_202,_204,_205,_206,_207,_208,_211,_212,_213,_214,_216,_218,_219,_222,_223,_250,_251,_252,_253,_254,_255,_256,_259,_261,_262,_263,_264,_265,_267,_268,_300,_301,_302,_303,_304,_305,_306,_307,_308,_309,_310,_312,_313,_314,_315,_316,_317,_318,_319,_320,_321,_322,_324,_325,_326,_327,_328,_329,_331,_333,_334,_335,_336,_337,_338,_339,_340,_341,_342,_345,_400,_401,_402,_404,_405,_421,_424,_425,_429,_430,_431,_432,_437,_442,_443,_444,_445,_446,_447,_448,_449,_450,_451,_452,_453,_454,_455,_499,_500
 */
enum class CodeNationaliteit(val value: String) {

    @JsonProperty("0")
    _0("0"),

    @JsonProperty("1")
    _1("1"),

    @JsonProperty("2")
    _2("2"),

    @JsonProperty("27")
    _27("27"),

    @JsonProperty("28")
    _28("28"),

    @JsonProperty("29")
    _29("29"),

    @JsonProperty("30")
    _30("30"),

    @JsonProperty("31")
    _31("31"),

    @JsonProperty("32")
    _32("32"),

    @JsonProperty("33")
    _33("33"),

    @JsonProperty("34")
    _34("34"),

    @JsonProperty("35")
    _35("35"),

    @JsonProperty("36")
    _36("36"),

    @JsonProperty("37")
    _37("37"),

    @JsonProperty("38")
    _38("38"),

    @JsonProperty("39")
    _39("39"),

    @JsonProperty("40")
    _40("40"),

    @JsonProperty("41")
    _41("41"),

    @JsonProperty("42")
    _42("42"),

    @JsonProperty("43")
    _43("43"),

    @JsonProperty("44")
    _44("44"),

    @JsonProperty("45")
    _45("45"),

    @JsonProperty("46")
    _46("46"),

    @JsonProperty("47")
    _47("47"),

    @JsonProperty("48")
    _48("48"),

    @JsonProperty("49")
    _49("49"),

    @JsonProperty("50")
    _50("50"),

    @JsonProperty("51")
    _51("51"),

    @JsonProperty("52")
    _52("52"),

    @JsonProperty("53")
    _53("53"),

    @JsonProperty("54")
    _54("54"),

    @JsonProperty("55")
    _55("55"),

    @JsonProperty("56")
    _56("56"),

    @JsonProperty("57")
    _57("57"),

    @JsonProperty("58")
    _58("58"),

    @JsonProperty("59")
    _59("59"),

    @JsonProperty("60")
    _60("60"),

    @JsonProperty("61")
    _61("61"),

    @JsonProperty("62")
    _62("62"),

    @JsonProperty("63")
    _63("63"),

    @JsonProperty("64")
    _64("64"),

    @JsonProperty("65")
    _65("65"),

    @JsonProperty("66")
    _66("66"),

    @JsonProperty("67")
    _67("67"),

    @JsonProperty("68")
    _68("68"),

    @JsonProperty("69")
    _69("69"),

    @JsonProperty("70")
    _70("70"),

    @JsonProperty("71")
    _71("71"),

    @JsonProperty("72")
    _72("72"),

    @JsonProperty("73")
    _73("73"),

    @JsonProperty("74")
    _74("74"),

    @JsonProperty("75")
    _75("75"),

    @JsonProperty("76")
    _76("76"),

    @JsonProperty("77")
    _77("77"),

    @JsonProperty("78")
    _78("78"),

    @JsonProperty("79")
    _79("79"),

    @JsonProperty("80")
    _80("80"),

    @JsonProperty("81")
    _81("81"),

    @JsonProperty("82")
    _82("82"),

    @JsonProperty("83")
    _83("83"),

    @JsonProperty("84")
    _84("84"),

    @JsonProperty("85")
    _85("85"),

    @JsonProperty("86")
    _86("86"),

    @JsonProperty("87")
    _87("87"),

    @JsonProperty("88")
    _88("88"),

    @JsonProperty("100")
    _100("100"),

    @JsonProperty("101")
    _101("101"),

    @JsonProperty("104")
    _104("104"),

    @JsonProperty("105")
    _105("105"),

    @JsonProperty("106")
    _106("106"),

    @JsonProperty("108")
    _108("108"),

    @JsonProperty("109")
    _109("109"),

    @JsonProperty("110")
    _110("110"),

    @JsonProperty("111")
    _111("111"),

    @JsonProperty("112")
    _112("112"),

    @JsonProperty("113")
    _113("113"),

    @JsonProperty("114")
    _114("114"),

    @JsonProperty("115")
    _115("115"),

    @JsonProperty("116")
    _116("116"),

    @JsonProperty("117")
    _117("117"),

    @JsonProperty("118")
    _118("118"),

    @JsonProperty("119")
    _119("119"),

    @JsonProperty("120")
    _120("120"),

    @JsonProperty("121")
    _121("121"),

    @JsonProperty("122")
    _122("122"),

    @JsonProperty("123")
    _123("123"),

    @JsonProperty("124")
    _124("124"),

    @JsonProperty("125")
    _125("125"),

    @JsonProperty("126")
    _126("126"),

    @JsonProperty("127")
    _127("127"),

    @JsonProperty("128")
    _128("128"),

    @JsonProperty("129")
    _129("129"),

    @JsonProperty("130")
    _130("130"),

    @JsonProperty("131")
    _131("131"),

    @JsonProperty("132")
    _132("132"),

    @JsonProperty("133")
    _133("133"),

    @JsonProperty("134")
    _134("134"),

    @JsonProperty("135")
    _135("135"),

    @JsonProperty("136")
    _136("136"),

    @JsonProperty("137")
    _137("137"),

    @JsonProperty("138")
    _138("138"),

    @JsonProperty("139")
    _139("139"),

    @JsonProperty("140")
    _140("140"),

    @JsonProperty("142")
    _142("142"),

    @JsonProperty("143")
    _143("143"),

    @JsonProperty("144")
    _144("144"),

    @JsonProperty("145")
    _145("145"),

    @JsonProperty("147")
    _147("147"),

    @JsonProperty("148")
    _148("148"),

    @JsonProperty("149")
    _149("149"),

    @JsonProperty("151")
    _151("151"),

    @JsonProperty("152")
    _152("152"),

    @JsonProperty("154")
    _154("154"),

    @JsonProperty("155")
    _155("155"),

    @JsonProperty("156")
    _156("156"),

    @JsonProperty("157")
    _157("157"),

    @JsonProperty("200")
    _200("200"),

    @JsonProperty("202")
    _202("202"),

    @JsonProperty("204")
    _204("204"),

    @JsonProperty("205")
    _205("205"),

    @JsonProperty("206")
    _206("206"),

    @JsonProperty("207")
    _207("207"),

    @JsonProperty("208")
    _208("208"),

    @JsonProperty("211")
    _211("211"),

    @JsonProperty("212")
    _212("212"),

    @JsonProperty("213")
    _213("213"),

    @JsonProperty("214")
    _214("214"),

    @JsonProperty("216")
    _216("216"),

    @JsonProperty("218")
    _218("218"),

    @JsonProperty("219")
    _219("219"),

    @JsonProperty("222")
    _222("222"),

    @JsonProperty("223")
    _223("223"),

    @JsonProperty("250")
    _250("250"),

    @JsonProperty("251")
    _251("251"),

    @JsonProperty("252")
    _252("252"),

    @JsonProperty("253")
    _253("253"),

    @JsonProperty("254")
    _254("254"),

    @JsonProperty("255")
    _255("255"),

    @JsonProperty("256")
    _256("256"),

    @JsonProperty("259")
    _259("259"),

    @JsonProperty("261")
    _261("261"),

    @JsonProperty("262")
    _262("262"),

    @JsonProperty("263")
    _263("263"),

    @JsonProperty("264")
    _264("264"),

    @JsonProperty("265")
    _265("265"),

    @JsonProperty("267")
    _267("267"),

    @JsonProperty("268")
    _268("268"),

    @JsonProperty("300")
    _300("300"),

    @JsonProperty("301")
    _301("301"),

    @JsonProperty("302")
    _302("302"),

    @JsonProperty("303")
    _303("303"),

    @JsonProperty("304")
    _304("304"),

    @JsonProperty("305")
    _305("305"),

    @JsonProperty("306")
    _306("306"),

    @JsonProperty("307")
    _307("307"),

    @JsonProperty("308")
    _308("308"),

    @JsonProperty("309")
    _309("309"),

    @JsonProperty("310")
    _310("310"),

    @JsonProperty("312")
    _312("312"),

    @JsonProperty("313")
    _313("313"),

    @JsonProperty("314")
    _314("314"),

    @JsonProperty("315")
    _315("315"),

    @JsonProperty("316")
    _316("316"),

    @JsonProperty("317")
    _317("317"),

    @JsonProperty("318")
    _318("318"),

    @JsonProperty("319")
    _319("319"),

    @JsonProperty("320")
    _320("320"),

    @JsonProperty("321")
    _321("321"),

    @JsonProperty("322")
    _322("322"),

    @JsonProperty("324")
    _324("324"),

    @JsonProperty("325")
    _325("325"),

    @JsonProperty("326")
    _326("326"),

    @JsonProperty("327")
    _327("327"),

    @JsonProperty("328")
    _328("328"),

    @JsonProperty("329")
    _329("329"),

    @JsonProperty("331")
    _331("331"),

    @JsonProperty("333")
    _333("333"),

    @JsonProperty("334")
    _334("334"),

    @JsonProperty("335")
    _335("335"),

    @JsonProperty("336")
    _336("336"),

    @JsonProperty("337")
    _337("337"),

    @JsonProperty("338")
    _338("338"),

    @JsonProperty("339")
    _339("339"),

    @JsonProperty("340")
    _340("340"),

    @JsonProperty("341")
    _341("341"),

    @JsonProperty("342")
    _342("342"),

    @JsonProperty("345")
    _345("345"),

    @JsonProperty("400")
    _400("400"),

    @JsonProperty("401")
    _401("401"),

    @JsonProperty("402")
    _402("402"),

    @JsonProperty("404")
    _404("404"),

    @JsonProperty("405")
    _405("405"),

    @JsonProperty("421")
    _421("421"),

    @JsonProperty("424")
    _424("424"),

    @JsonProperty("425")
    _425("425"),

    @JsonProperty("429")
    _429("429"),

    @JsonProperty("430")
    _430("430"),

    @JsonProperty("431")
    _431("431"),

    @JsonProperty("432")
    _432("432"),

    @JsonProperty("437")
    _437("437"),

    @JsonProperty("442")
    _442("442"),

    @JsonProperty("443")
    _443("443"),

    @JsonProperty("444")
    _444("444"),

    @JsonProperty("445")
    _445("445"),

    @JsonProperty("446")
    _446("446"),

    @JsonProperty("447")
    _447("447"),

    @JsonProperty("448")
    _448("448"),

    @JsonProperty("449")
    _449("449"),

    @JsonProperty("450")
    _450("450"),

    @JsonProperty("451")
    _451("451"),

    @JsonProperty("452")
    _452("452"),

    @JsonProperty("453")
    _453("453"),

    @JsonProperty("454")
    _454("454"),

    @JsonProperty("455")
    _455("455"),

    @JsonProperty("499")
    _499("499"),

    @JsonProperty("500")
    _500("500")
}

