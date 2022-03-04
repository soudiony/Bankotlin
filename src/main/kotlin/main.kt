fun main() {
    println("BanKotlin - Bem Vindo");

    val conta1 = Funcionario(nome = "Lara Alves", salario = 1000.0, cpf = "013")
    val conta2 = Funcionario(nome = "Diony Ribeiro", salario = 6200.0, cpf = "044")

    var gerente1 = Gerente(nomeG = "Kiko", salarioG = 2000.00, cpfG = "010", 4556)
    var diretor = Diretor("Rizzati", 2000.00, "099", 4546)
    var boy1 = OfficeBoy(nome = "Hellen", salario = 2000.00, "022")

     println("----->  ${gerente1.totalBoniPagaGerente()}")
    // println(diretor.boni)

    var bonificacao = SomaBoni()
    bonificacao.somaBoni(gerente1);
    bonificacao.somaBoni(diretor)
    bonificacao.somaBoni(boy1)


    print("")
    println(bonificacao.totalBonificacaoPaga())



}









