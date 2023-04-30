 fun main() {
    val contaAlex = Conta("Alex", 1000)
    contaAlex.depositar(100.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.depositar(50.0)

    println("Adicionando R$50 na conta do Alex")
    contaAlex.depositar(50.00)
    println("Adicionando R$20 na conta da Fran")
    contaFran.depositar(20.0)
    println("Sacando R$100 na conta do Alex")
    contaAlex.sacar(100.0)
    println("Sacando R$1000 na conta da Fran")
    contaFran.sacar(1000.0)
    println("Relizando transferencia da conta da Fran para a conta do Alex")
    if(contaFran.transferir(1.0, contaAlex)){
        println("Transferencia realizada com sucesso.")
    } else {
        println("Erro na transferencia.")
    }
}

class Conta(var titular: String, var numeroDaConta: Int) {
    private var saldo = 0.0
        set(value){
            if(value >= 0){
                field = value
            }
        }

    fun depositar(valorDeposito: Double) {
        this.saldo += valorDeposito
        println("Deposito efetuado com sucesso. O saldo atual é: ${this.saldo}")
    }

    fun sacar(valorSaque: Double) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque
            println("Saque efetuado com sucesso. O saldo atual é: ${this.saldo}")
        } else {
            println("O valor de saque é maior que o valor de saldo! Valor de saldo ${this.saldo} | valor de saque: ${valorSaque}")
        }
    }

    fun transferir(valorTransferencia: Double, contaDestinatario: Conta): Boolean{
        if(valorTransferencia <= this.saldo){
            this.saldo -= valorTransferencia
            contaDestinatario.saldo += valorTransferencia
            println("Saldo conta de origem ${this.saldo} | Saldo conta do destinatario ${contaDestinatario.saldo}")
            return true
        }
        return false
    }
}


fun verificarSaldo(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Sem saldo")
        else -> println("Saldo negativo")
    }
}
