package br.digital.com

fun main(){

    val ingresso = Ingresso(20.00)
    val vip = Vip(10.00, ingresso.valor)

    println("Digite o valor do tipo de ingresso")
    println("1 - Ingresso normal\t2 - Ingresso Vip")

    when(readLine()){
        "1" -> {
            Normal(ingresso.valor).imprimeNormal()
            ingresso.imprimeValor()
        }
        "2" -> {
            println("Digite o camarote")
            println("1 - Camarote Superior\t2 - Caramote Inferior")
            when(readLine()){
                "1" -> {
                    println("Camarote Superior")
                    println(CamaroteSuperior(vip.valorAd, vip.valor, 50.00).valorCamaroteSuperior())
                }
                "2" -> {
                    println("Camarote Inferior")
                    CamaroteInferior(vip.valorAd, vip.valor, "B2").imprimeLocal()
                    println(vip.retornaValorVip())
                }
            }
        }
    }
}