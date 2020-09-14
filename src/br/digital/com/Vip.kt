package br.digital.com

open class Vip(var valorAd: Double, valor: Double) : Ingresso(valor) {

//    override fun imprimeValor(){
//        println("Ingresso Vip: ${valor+valorAd}")
//    }

    fun retornaValorVip(): Double{
        return valor+valorAd
    }
}