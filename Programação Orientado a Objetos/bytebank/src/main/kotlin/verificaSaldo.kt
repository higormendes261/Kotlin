fun verificarSaldo(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Sem saldo")
        else -> println("Saldo negativo")
    }
}