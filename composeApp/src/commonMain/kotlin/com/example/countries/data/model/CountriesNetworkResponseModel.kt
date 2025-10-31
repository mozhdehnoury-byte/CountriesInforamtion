package com.example.countries.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountriesNetworkResponseModel(
    val countries: List<CountriesInfoNetworkResponseModel>
)

@Serializable
data class CountriesInfoNetworkResponseModel(
    val name: CountriesNameNetworkResponseModel
)

@Serializable
data class CountriesNameNetworkResponseModel(
    @SerialName("common")
    val common: String,
    @SerialName("nativeName")
    val nativeName: NativeName,
    @SerialName("official")
    val official: String
)


@Serializable
data class NativeName(
    @SerialName("afr")
    val afr: MoreInfo,
    @SerialName("amh")
    val amh: MoreInfo,
    @SerialName("ara")
    val ara: MoreInfo,
    @SerialName("arc")
    val arc: MoreInfo,
    @SerialName("aym")
    val aym: MoreInfo,
    @SerialName("aze")
    val aze: MoreInfo,
    @SerialName("bar")
    val bar: MoreInfo,
    @SerialName("bel")
    val bel: MoreInfo,
    @SerialName("ben")
    val ben:MoreInfo,
    @SerialName("ber")
    val ber: MoreInfo,
    @SerialName("bis")
    val bis: MoreInfo,
    @SerialName("bjz")
    val bjz: MoreInfo,
    @SerialName("bos")
    val bos: MoreInfo,
    @SerialName("bul")
    val bul: MoreInfo,
    @SerialName("bwg")
    val bwg: MoreInfo,
    @SerialName("cal")
    val cal: MoreInfo,
    @SerialName("cat")
    val cat: MoreInfo,
    @SerialName("ces")
    val ces: MoreInfo,
    @SerialName("cha")
    val cha: MoreInfo,
    @SerialName("ckb")
    val ckb: MoreInfo,
    @SerialName("cnr")
    val cnr: MoreInfo,
    @SerialName("crs")
    val crs: MoreInfo,
    @SerialName("dan")
    val dan: MoreInfo,
    @SerialName("deu")
    val deu: MoreInfo,
    @SerialName("div")
    val div: MoreInfo,
    @SerialName("dzo")
    val dzo: MoreInfo,
    @SerialName("ell")
    val ell: MoreInfo,
    @SerialName("eng")
    val eng: MoreInfo,
    @SerialName("est")
    val est: MoreInfo,
    @SerialName("fao")
    val fao: MoreInfo,
    @SerialName("fas")
    val fas: MoreInfo,
    @SerialName("fij")
    val fij: MoreInfo,
    @SerialName("fil")
    val fil: MoreInfo,
    @SerialName("fin")
    val fin: MoreInfo,
    @SerialName("fra")
    val fra: MoreInfo,
    @SerialName("gil")
    val gil: MoreInfo,
    @SerialName("gle")
    val gle: MoreInfo,
    @SerialName("glv")
    val glv: MoreInfo,
    @SerialName("grn")
    val grn: MoreInfo,
    @SerialName("gsw")
    val gsw: MoreInfo,
    @SerialName("hat")
    val hat: MoreInfo,
    @SerialName("heb")
    val heb: MoreInfo,
    @SerialName("her")
    val her: MoreInfo,
    @SerialName("hgm")
    val hgm: MoreInfo,
    @SerialName("hif")
    val hif: MoreInfo,
    @SerialName("hin")
    val hin: MoreInfo,
    @SerialName("hmo")
    val hmo: MoreInfo,
    @SerialName("hrv")
    val hrv: MoreInfo,
    @SerialName("hun")
    val hun: MoreInfo,
    @SerialName("hye")
    val hye: MoreInfo,
    @SerialName("ind")
    val ind: MoreInfo,
    @SerialName("isl")
    val isl: MoreInfo,
    @SerialName("ita")
    val ita: MoreInfo,
    @SerialName("jam")
    val jam: MoreInfo,
    @SerialName("jpn")
    val jpn: MoreInfo,
    @SerialName("kal")
    val kal: MoreInfo,
    @SerialName("kat")
    val kat: MoreInfo,
    @SerialName("kaz")
    val kaz: MoreInfo,
    @SerialName("kck")
    val kck: MoreInfo,
    @SerialName("khi")
    val khi: MoreInfo,
    @SerialName("khm")
    val khm: MoreInfo,
    @SerialName("kin")
    val kin: MoreInfo,
    @SerialName("kir")
    val kir: MoreInfo,
    @SerialName("kon")
    val kon: MoreInfo,
    @SerialName("kor")
    val kor: MoreInfo,
    @SerialName("kwn")
    val kwn: MoreInfo,
    @SerialName("lao")
    val lao: MoreInfo,
    @SerialName("lat")
    val lat: MoreInfo,
    @SerialName("lav")
    val lav: MoreInfo,
    @SerialName("lin")
    val lin: MoreInfo,
    @SerialName("lit")
    val lit: MoreInfo,
    @SerialName("loz")
    val loz: MoreInfo,
    @SerialName("ltz")
    val ltz: MoreInfo,
    @SerialName("lua")
    val lua: MoreInfo,
    @SerialName("mah")
    val mah: MoreInfo,
    @SerialName("mey")
    val mey: MoreInfo,
    @SerialName("mfe")
    val mfe: MoreInfo,
    @SerialName("mkd")
    val mkd: MoreInfo,
    @SerialName("mlg")
    val mlg: MoreInfo,
    @SerialName("mlt")
    val mlt: MoreInfo,
    @SerialName("mon")
    val mon: MoreInfo,
    @SerialName("mri")
    val mri: MoreInfo,
    @SerialName("msa")
    val msa: MoreInfo,
    @SerialName("mya")
    val mya: MoreInfo,
    @SerialName("nau")
    val nau: MoreInfo,
    @SerialName("nbl")
    val nbl: MoreInfo,
    @SerialName("ndc")
    val ndc: MoreInfo,
    @SerialName("nde")
    val nde: MoreInfo,
    @SerialName("ndo")
    val ndo: MoreInfo,
    @SerialName("nep")
    val nep: MoreInfo,
    @SerialName("nfr")
    val nfr: MoreInfo,
    @SerialName("niu")
    val niu: MoreInfo,
    @SerialName("nld")
    val nld: MoreInfo,
    @SerialName("nno")
    val nno: MoreInfo,
    @SerialName("nob")
    val nob: MoreInfo,
    @SerialName("nor")
    val nor: MoreInfo,
    @SerialName("nrf")
    val nrf: MoreInfo,
    @SerialName("nso")
    val nso: MoreInfo,
    @SerialName("nya")
    val nya: MoreInfo,
    @SerialName("nzs")
    val nzs: MoreInfo,
    @SerialName("pap")
    val pap: MoreInfo,
    @SerialName("pau")
    val pau: MoreInfo,
    @SerialName("pih")
    val pih: MoreInfo,
    @SerialName("pol")
    val pol: MoreInfo,
    @SerialName("por")
    val por: MoreInfo,
    @SerialName("pov")
    val pov: MoreInfo,
    @SerialName("prs")
    val prs: MoreInfo,
    @SerialName("pus")
    val pus: MoreInfo,
    @SerialName("que")
    val que: MoreInfo,
    @SerialName("rar")
    val rar: MoreInfo,
    @SerialName("roh")
    val roh: MoreInfo,
    @SerialName("ron")
    val ron: MoreInfo,
    @SerialName("run")
    val run: MoreInfo,
    @SerialName("rus")
    val rus: MoreInfo,
    @SerialName("sag")
    val sag: MoreInfo,
    @SerialName("sin")
    val sin: MoreInfo,
    @SerialName("slk")
    val slk: MoreInfo,
    @SerialName("slv")
    val slv: MoreInfo,
    @SerialName("smi")
    val smi: MoreInfo,
    @SerialName("smo")
    val smo: MoreInfo,
    @SerialName("sna")
    val sna: MoreInfo,
    @SerialName("som")
    val som: MoreInfo,
    @SerialName("sot")
    val sot: MoreInfo,
    @SerialName("spa")
    val spa: MoreInfo,
    @SerialName("sqi")
    val sqi: MoreInfo,
    @SerialName("srp")
    val srp: MoreInfo,
    @SerialName("ssw")
    val ssw: MoreInfo,
    @SerialName("swa")
    val swa: MoreInfo,
    @SerialName("swe")
    val swe: MoreInfo,
    @SerialName("tam")
    val tam: MoreInfo,
    @SerialName("tet")
    val tet: MoreInfo,
    @SerialName("tgk")
    val tgk: MoreInfo,
    @SerialName("tha")
    val tha: MoreInfo,
    @SerialName("tir")
    val tir: MoreInfo,
    @SerialName("tkl")
    val tkl: MoreInfo,
    @SerialName("toi")
    val toi: MoreInfo,
    @SerialName("ton")
    val ton: MoreInfo,
    @SerialName("tpi")
    val tpi: MoreInfo,
    @SerialName("tsn")
    val tsn: MoreInfo,
    @SerialName("tso")
    val tso: MoreInfo,
    @SerialName("tuk")
    val tuk: MoreInfo,
    @SerialName("tur")
    val tur: MoreInfo,
    @SerialName("tvl")
    val tvl: MoreInfo,
    @SerialName("ukr")
    val ukr: MoreInfo,
    @SerialName("urd")
    val urd: MoreInfo,
    @SerialName("uzb")
    val uzb: MoreInfo,
    @SerialName("ven")
    val ven: MoreInfo,
    @SerialName("vie")
    val vie: MoreInfo,
    @SerialName("xho")
    val xho: MoreInfo,
    @SerialName("zdj")
    val zdj: MoreInfo,
    @SerialName("zho")
    val zho: MoreInfo,
    @SerialName("zib")
    val zib: MoreInfo,
    @SerialName("zul")
    val zul: MoreInfo
)


@Serializable
data class MoreInfo(
    @SerialName("common")
    val common: String,
    @SerialName("official")
    val official: String
)
