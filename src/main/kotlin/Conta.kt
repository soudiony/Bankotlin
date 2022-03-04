class Conta(

    var nomeTitular: String, var numConta: Int) {

    private var saldo = 0.0
    private val taxa = 1.5

    fun verificaSaldo(valor: Double): Boolean {
        return if (this.saldo >= (valor + taxa)) {
            true
        } else {
            println("Saldo Insuficente")
            false
        }
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Deposito Efetuado com Sucesso!")
        }

    }

    fun transfere(destino: Conta, valor: Double) {
        if (verificaSaldo(valor)) {
            this.saldo -= valor
            destino.deposita(valor)
            println("Transferencia Realizada com Sucesso!")

        }
    }

    fun saca(valor: Double) {
        if (verificaSaldo(valor)) {
            this.saldo -= (valor + taxa)
            println("Saque Efetuado com sucesso!")
        }
    }

    fun mostraSaldo(): Double {
        return this.saldo
    }

    fun qualTitular(): String {
        return this.nomeTitular
    }

    fun cadTitular(nome: String) {
        this.nomeTitular = nome

    }

    fun cadNumConta(i: Int) {
        this.numConta = i
    }

    fun qualNumero(): Int {
        return this.numConta

    }

}