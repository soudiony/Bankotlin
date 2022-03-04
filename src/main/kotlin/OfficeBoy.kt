open class OfficeBoy(
    nome: String,
    salario: Double,
    cpf: String,

    )

    :Funcionario(nome = nome, salario = salario, cpf = cpf){

    override val boni: Double
        get() {
            println("Boni Office")
            return 100.00
        }

    override fun ttBoniFuncao(): Double {
        return super.ttBoniFuncao()
    }

   // override val boni: Double get() = this.salario * 0.5    (faz a mesma coisa acima)


    }

