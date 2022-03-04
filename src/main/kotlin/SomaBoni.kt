class SomaBoni {

    private var ttBoni: Double = 0.0

    fun somaBoni(funcionario: Funcionario) {
        this.ttBoni += funcionario.boni
    }



    fun totalBonificacaoPaga():Double{
        return this.ttBoni
    }

}