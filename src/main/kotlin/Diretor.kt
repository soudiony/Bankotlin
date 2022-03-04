open class Diretor(
    nomeG: String,
    salarioG: Double,
    cpfG: String,
    var senha: Int)

    :Funcionario(nome = nomeG, salario = salarioG, cpf = cpfG){

    override val boni: Double
        get() {
            println("Boni Diretor!")
            return this.salario * 2
        }



    override fun ttBoniFuncao(): Double {
        return super.ttBoniFuncao()
    }
    }



