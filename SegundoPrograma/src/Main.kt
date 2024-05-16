fun main() {
    // Bucle while
    println("")
    var cont = 10

    while (cont > 0){ // Entra al bloque cuando la conidicón sea verdadera
        println("Al contador le falta/n ${cont} iteracion/es para cumplir el bucle while");
        cont--
    }

    // Bucle do while
    do{ // Primero hace lo que está contenido en el bloque independientemente de cualquier condición
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random() // Crea un número random entre 0 y 100
        println("El número generado es $numeroAleatorio")
    }while(numeroAleatorio < 50) // Si la condición es verdadera entonces se vuelve a hacer una iteración del bloque do while

    //Ciclos

    //For
    println("")
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno") //Los elementos dentro del paréntesis se asignaran en una lista, la cual es una estructura de datos no modificable
    for(fruta in listaDeFrutas){ //Es un foreach de cualquier otro lenguaje
        //fruta ahora es una variable que hace referencia a un elemento de la lista
        //la cual irá cambiando mediante va pasando por la lista
        println("Hoy voy a comer $fruta")
    }

    //For each
    println("")
    listaDeFrutas.forEach{ fruta -> println("Hoy voy a comer $fruta desde un foreach")} //Eso es una función anónima, es decir que se declara en un bloque y no haciendo una referencia por nombre

    println("")
    val caracteresDeFruta: List<Int> = listaDeFrutas.map{ fruta -> fruta.length } //Al igual que el foreach es una función anónima
    //Sirve para convertir lo que tenías en tu lista a otro tipo de datos
    println(caracteresDeFruta)

    //Filter
    println("")
    val listaFiltrada = caracteresDeFruta.filter{ largoDeFruta -> largoDeFruta > 5 } //Ahce una lista con solo los caacteres de fruta que sean de más de 5
    println(listaFiltrada)

    //Try Catch y manejo de null reference
    println("")
    var nombre : String? = null
    //nombre!!.length Mal
    println(nombre?.length) //Saca el lenght si nombre no es null

    try{ //Intentamos esto
        nombre!!.length

        //throw NullPointerException("Referencia nula") //Esto lo lanza al catch
    }
    catch(e: NullPointerException){ //Si el try da error, entonces se ejecuta el catch
        println("Ha ocurrido un error")
    }
    finally{ //Se ejecuta al terminar el try o el catch
        println("Finalmente ha terminado la aplicación... Cerrando aplicación")
    }

    //El try catch también es de asignación
    val primerValor = 10
    val segundoValor = 0
    val resultado: Int =
        try{
            primerValor / segundoValor
        }
        catch (e: Exception){
            0
        }
    println(resultado)

    //Elvis operator
    //Nos ayuda a devolver un valor cuando un elemento es nulo
    println("")
    val nombreDos: String? = null
    val caracteresDeNombre: Int = nombreDos?.length ?: 0 //El operador elvis es el ?: Lo que hace es que si nombre_dos es nulo, entonces le asignara lo que está después del operador, es decir 0
    println(caracteresDeNombre)
}