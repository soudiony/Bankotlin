      fun testaCondicao(saldo: Double) {
        when {
            saldo > 0 -> {
                println("Seu saldo é Positivo no valor de: $saldo")
            }
            saldo == 0.0 -> {
                println("Não Há saldo Suficiente, seu saldo é: $saldo")
            }
            else -> {
                println("Saldo Negativo Procure a Gerencia: ")
            }
        }
    }
