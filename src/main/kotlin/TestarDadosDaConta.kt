import java.util.*

fun TestarDadosDaConta() {
    var conta1 = Conta(nomeTitular = "Dione", numConta = 121)      //Conta() -> instancia a classe Conta
    var conta2 = Conta(nomeTitular = "Lara", numConta = 241)
    var conta3 = Conta(nomeTitular = "Getory", numConta = 32)

    println("Nome: ${conta1.qualTitular()} " + " - Num. da Conta: ${conta1.qualNumero()}" + " - Saldo Atual: R$ ${conta1.mostraSaldo()}")
    println("Nome: ${conta2.qualTitular()} " + " - Num. da Conta: ${conta2.qualNumero()}" + " - Saldo Atual: R$ ${conta2.mostraSaldo()}")

    print("Qual o valor deseja Depositar? R$ ")
    var valorDeposito: Double = Scanner(System.`in`).nextDouble()
    conta1.deposita(valorDeposito)

    println("Nome: ${conta1.qualTitular()}" + " - Saldo: R$ ${conta1.mostraSaldo()}")
    println()

    conta1.transfere(destino = conta2, valor = 500.0)
    println("Nome: ${conta1.qualTitular()}" + " - Saldo: R$ ${conta1.mostraSaldo()}")
    println("Nome: ${conta2.qualTitular()}" + " - Saldo: R$ ${conta2.mostraSaldo()}")

    conta1.saca(4985.0)
}