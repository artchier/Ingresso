package br.digital.com

class CamaroteSuperior(valorAd: Double, valor: Double, var valorCamarote: Double) : Vip(valorAd, valor) {

    fun valorCamaroteSuperior(): Double{
        return valor+valorAd+valorCamarote
    }
}