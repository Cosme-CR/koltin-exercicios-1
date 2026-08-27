import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    Menu()


}

fun Menu (){
    var sair = true

    val vetornumeros = intArrayOf(1, 2, 3, 4, 5, 50, 60)

    while (sair) {
        println("MENU PRINCIPAL ESCOLA O EXENCICIO QUE DESEJA CORRIGIR")
        println(" O ARRAY USADO SERA ${vetornumeros.joinToString()}")

        println("0 )  PARA SAIR ")
        println("1 )  EXECICIO 1  PAR OU IMPAR")
        println("2 )  EXECICIO 2  POSITIVO OU NEGATIVO")
        println("3 )  EXECICIO 3  CRIANCA ADULTO OU IDOSO")
        println("4 )  EXECICIO 4  TABUADA")
        println("5 )  EXECICIO 5  SOMA ARRAY COMPLETO")
        println("6 )  EXECICIO 6  MAIOR DO ARRAY")
        println("7 )  EXECICIO 7  CONTAGEM REGRESSIVA ATE 0")
        println("8 )  EXECICIO 8  SOMA DOS PARES DO ARRAY")
        println("9 )  EXECICIO 9  RETORNA O DOBRO DO NUMERO")
        println("10 ) EXECICIO 10 MEDIA DE 3 NOTAS")
        println("11 ) EXECICIO 11 CELCIUS PARA FAHRENHEIT")


        // Lê a opção digitada pelo usuário
        val opcao = readln().toInt()


        when (opcao) {
            0 -> {
                println("-> Saindo do sistema...")
                sair = false
            }

            1 -> {ImparPar()}
            2 -> {PositivoNegativo()}
            3 -> {ValidaCrianca()}
            4 -> {Tabuada()}
            5 -> println("soma e : "+somarArray(vetornumeros ))
            6 -> println("MAIOR e : "+encontrarMaior(vetornumeros ))
            7 -> println("Contagem regressivaa e : "+regresso())
            8 -> println("SOMA DOS PARES e : "+somarPares(vetornumeros ))
            9 -> {dobranumero()}
            10 ->{MEdia()}
            11 ->{calcularCelcius()}


            else -> println("-> Opção inválida! Tente novamente.") // Substitui o 'default'

        }
    }
}

// funcao pra ver se e impar ou par
fun ImparPar (){
    println("Digite o numero")
    //entrada de dados
    var numero =  readln().toInt()
    //calculo
    var resto = (numero%2)
    if (resto == 0){
        println("o numero $numero e par ")
    }else{
        println("o numero $numero e impar ")
    }
}

// funcao pra ver se e positivo negativo ou zero
fun PositivoNegativo (){
    println("Digite o numero")
    //entrada de dados
    var numero =  readln().toInt()

    when {
        numero > 0 -> println("O numero $numero E Positivo")
        numero < 0 -> println("O numero $numero E Negativo")
        else -> println("O numero $numero EZero")
    }
}

// funcao pra ver se e positivo negativo ou zero
fun ValidaCrianca (){
    println("Digite a idade da Crianca")
    //entrada de dados
    var numero =  readln().toInt()

    when (numero) {
        in 0..11 -> println("crianca")
        in 12..17 -> println("adolecente")
        in 18..59 -> println("adulto")
        else -> println("idoso")
    }
}

fun Tabuada (){
    println("Digite o numero da tabuada")
    var numero =  readln().toInt()

    for (i in 0..10){
        println("$numero X $i = ${numero*i}")
    }
}

fun somarArray(numeros: IntArray): Int {
    return numeros.sum()
}

fun encontrarMaior(numeros: IntArray): Int? {
    return numeros.maxOrNull()
}

fun regresso(){
    println("Digite o numero")
    //entrada de dados
    var numero =  readln().toInt()
    contagemRegressiva(numero)

}

fun contagemRegressiva(inicio: Int) {
    for (i in inicio downTo 0) {
        println(i)
    }
}

fun somarPares(numeros: IntArray): Int {
    var soma = 0
    for (numero in numeros) {
        if (numero % 2 == 0) {
            soma += numero
        }
    }
    return soma
}


fun FuncaoDobra (numero : Float ): Float{
    return (numero*2)
}
fun dobranumero(){
    println("digite um numero")
    val n1 = readln().toFloat()
    val dobro = FuncaoDobra(n1)
    println(dobro)
}


fun calcularMedia(nota1: Double, nota2: Double, nota3: Double): Double {
    return ((nota1 + nota2 + nota3) / 3)
}
fun MEdia(){
    println("digite a nota 1")
    val n1 = readln().toDouble()

    println("digite a nota 2")
    val n2 = readln().toDouble()

    println("digite a nota 3")
    val n3 = readln().toDouble()

    val media = calcularMedia(n1, n2, n3   )

    println("media : $media")
}


fun celsiusFahrenheit(celsius: Double): Double {
    return (celsius * 1.8 + 32)
}
fun calcularCelcius(){
    println("digite a temperatura")

    val temp = readln().toDouble()
    val temF= celsiusFahrenheit(temp)

    println(temF)
}

/*
dizer se o numero e par ouimpar

        criar umavarial ver se o numero positivo negativo ou zero



        menor 12 crianca
        18 59 adulto
        acima de 60 idoso

        tabuada de d1 a a 10



        6 achar o maior numero dentro de um array

        7 variavel numerica contagem regressiva ate 0


        8 array somar so numero pares

        funcao q receba um numero e retorne o dobro

        9 recebe 3 nota e faz media

        receba a temperatura em celcio e retorne farenheit



         val name = "Kotlin"
    var idade = 23
    idade = 30

    var altura : Double = 1.80


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }



    val texto = "bom dia , pessoa sua idade e $idade e logo vc fara ${idade+1}"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoa"))


    var caracteres = 'c'
    println(caracteres)

    var bloqueado : Boolean = false
    println(bloqueado)

    var numero = (3_000_000_000L*1000)*10*20*8000

    println(numero)

    var carros = mutableListOf("corsa","kwid", "celta")


    /*
    * estruturas
    *
    * setof   nao permite repeticao
    *
    *map trabalha com chave e valor n permite alteracao apos criada
    *
    */

    val idadee =15

    when (idadee) {

        in 5..15 -> println("crianca")
        in 16..25 -> println("crianca")
        in 26..30 -> println("crianca")
    }



         */
