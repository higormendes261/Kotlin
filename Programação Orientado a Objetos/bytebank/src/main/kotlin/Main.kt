fun main() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 1000)
    sistema.entrar(diretora, 2000)
    testaFuncionarios()

}







