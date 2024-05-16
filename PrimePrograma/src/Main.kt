const val PI = 3.1416 // Se generan antes de darle al botón verde. Declarada en tiempo de compilación

fun main() { // Forma de declarar nuestra función nombreFunción(parámetros){ cuerpo de la función }
    println("Hello World!")

    var dinero: Int = 10 // Forma de declarar variables var nombre_variable : tipo_de_dato = valor

    // Kotlin es suficientemente inteligente para saber a qué tipo de dato pertenece lo asignado a una vairbale
    // Por lo tanto no siempre es impresciendible declarar el tipo de dato, simplemente puedes poner directamente el valor

    var dinero2 = 15

    dinero = 72

    var sum_dinero = dinero2 + dinero

    println(sum_dinero)

    val nombre = "Leon"

    println(PI)
    println(nombre)

    val apellido = "Rivera"
    val segundo_nombre = "Carlo"

    val edad = 21

    val nombre_completo = "$apellido, $nombre $segundo_nombre. Edad: $edad" // Inyección de variablñes en una cadena de texto. Interpolación

    println(nombre_completo)

    // Estructura de control if
    println("");
    var bandera = 1;

    if (nombre.isNotEmpty()){ // Verifica que no es nulo
        // Bloque de cuando se cumple el if
        println("El largo de nuestra variable es: ${nombre.length}")
    }
    else if(nombre_completo.isNotEmpty()){ // Si no se cumplió el caso anterior
        // Bloque de cuando se cumple el if
        println("El largo de nuestra variable es: ${nombre_completo.length}")
    }
    else{ // Si no se cumplió ningún caso
        // Bloque cuando no se cumple el if
        println("Error, la variable está vacía")
    }

    // El if puede o no cumplirse, pero el else siempre se ejecutara si no se cumple el if
    // Así que si quieres que el código no haga nada si no se cumple el if o else if, no pongas un else

    // Los else if solo se jecutan después de un caso de verificación an6terior

    // Asignación de valor a una variable con if
    val mensaje : String = if(nombre.length > 4){
        "Tu nombre es largo"
    }
    else{
        "Tu nombre es corto"
    }

    println("")
    println(mensaje)

    // Estructura de control when. Similar a un switch
    println("");
    println("ingresa un número del 1 - 10: ")
    val numero_seleccionado = readLine().toString().toInt()

    when(numero_seleccionado) { // Agarra a numero_seleccionado como parámetro para los distintos casos
        1 -> { // Cuando sea igual a uno
            println("Fallaste por uno menos")
        }

        2 -> { // Cuando sea igual a dos
            println("Ganaste")
        }

        3 -> { // Cuando sea igual a tres
            println("Fallaste por uno más")
        }
        4, 5 -> { // Cuando sea igual a cuatro o cinco
            println("Te fuiste muy lejos")
        }
        in 6..10 -> { // Cuando sea igual a un número en el rango de 6 a 10
            println("Demasiado lejos")
        }
        else -> { // Se va a este caso cuando ningún caso fue cumplido
            println("Escribiste un valor inválido")
        }
    }

    // Asignacion de variables con when
    println("");
    println("ingresa un número del 1 - 10: ")
    val numero_seleccionado2 = readLine().toString().toInt()

    val mensaje2 : String = when(numero_seleccionado2) { // Agarra a numero_seleccionado como parámetro para los distintos casos
        1 -> { // Cuando sea igual a uno
            "Fallaste por uno menos"
        }

        2 -> { // Cuando sea igual a dos
            "Ganaste"
        }

        3 -> { // Cuando sea igual a tres
            "Fallaste por uno más"
        }
        4, 5 -> { // Cuando sea igual a cuatro o cinco
            "Te fuiste muy lejos"
        }
        in 6..10 -> { // Cuando sea igual a un número en el rango de 6 a 10
            "Demasiado lejos"
        }
        else -> { // Se va a este caso cuando ningún caso fue cumplido. Esta es forzosa al asignar un valor a una variable
            "Escribiste un valor inválido"
        }
    }

    println(mensaje2)
}