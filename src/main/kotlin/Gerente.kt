open class Gerente(
    nomeG: String,
    salarioG: Double,
    cpfG: String,
    var senha: Int
    )
    :Funcionario(nome = nomeG, salario = salarioG, cpf = cpfG){

    var percGerente: Double = 0.5
    var totalBoniGerente = 0.0

    override val boni: Double
        get() {
            println("Boni Gerente!")
            return (this.salario * percGerente) + this.salario

        }

     fun autentica(chave: Int): Boolean{
        if (this.senha == chave){
            return true
        }
            return false
    }

    }

