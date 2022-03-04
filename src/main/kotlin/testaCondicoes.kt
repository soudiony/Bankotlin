import java.util.*

    fun testaCondicoes() {

        var PodeMudar = "Diony6";   //var: Muda, val: constante
        val NaoPodeMudar = "Diony";


        System.out.print("entre com o Nome do Titulat: ")
        val nome: String = Scanner(System.`in`).next()

        var num: Int = 0; num = num + 10;

        var saldo: Double = 0.0;
        saldo += .0;

        testaCondicao(saldo);

        println("Nome: $nome" + " Num: da Conta: $num" + " Saldo: $saldo");


        val max = if (3 < 8) {
            println("Menor é o")
            3
        } else {
            println("Maior b")
            8
        }
        println("-----> $max");


        for (i in 1..3) {  //de 1 a 3
            println(i)
        }
        for (i in 6 downTo 0 step 3) {  //de 6 a 1 pulando de 3 em e
            println(i)
            if (i == 5) {
                break;// se = 5 -> Pare
                //continue; se = 6 -> pula 5 e contuna
            }

        }

        var x = 8;

        while (x > 0) {
            x--
        }

        do {
            val y = x + x
        } while (y != null) // y is visible here!

        loop@ for (i in 1..100) {
            println("i $i")
            for (j in 1..100) {
                println("j $j")
                if (j == 5) break@loop
            }
        }

    }
