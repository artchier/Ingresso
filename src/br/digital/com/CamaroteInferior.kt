package br.digital.com

class CamaroteInferior(valorAd: Double, valor: Double, var poltrona: String) : Vip(valorAd, valor) {

    fun imprimeLocal(){
        println("Localização da poltrona: $poltrona")
    }
}