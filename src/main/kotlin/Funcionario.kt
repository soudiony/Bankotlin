open class Funcionario(
    val nome: String,
    var salario: Double,
    val cpf: String,
    )

{
    open val boni: Double
        get() {
            return this.salario * 0.1 }

    var totalBoni = 0.0;

    open fun ttBoniFuncao():Double{
        totalBoni += boni
        return totalBoni
    }

}


