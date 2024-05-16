fun main() {
    println(randomCase("HolA aMigooo"))

    val fraseUpperOLower = randomCase("Que rollO")
    imprimirFrase(fraseUpperOLower)

    val frase = "Hola compa"
    println(frase.ordenarAlfabeticamente())
}

fun randomCase(frase: String): String{ //Devuelve String
    val numeroRandom = 0..99 //Numero aleatorio de 0 a 99
    val resultadoRandom = numeroRandom.random() //Elegimos el random

    //"rem" es como usar "%" (modulo) en otros lenguajes
    if(resultadoRandom.rem(2) == 0){
        return frase.uppercase()
    }
    else{
        return frase.lowercase()
    }
}

//El string antes del nombre de la función significa que ahora esta función esta disponible para cualquier String. Es como un tipo extensión de la clase
fun String.ordenarAlfabeticamente(): String{
    return toCharArray().sorted().joinToString("")
} //Función de extensión

fun imprimirFrase (frase: String): Unit { //No devuelve nada
    println("Tu frase es: $frase")
}