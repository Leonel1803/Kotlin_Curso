fun main() {
    //Listas
    val listaNombres = listOf<String>("Juan", "Enrique", "Camila") //Le puedes quitar el String ya que Kotlin detecta que tipo de dato hay en la lista
    //Esta lista es inmutable
    println(listaNombres)
    //listaNombres.remove No permitido por ser inmutable

    val listaVacia = mutableListOf<String>() //Aquí si es mejor especificar el tipo de dato por ser una lista modificable
    //Esta lista es mutable
    println(listaVacia)
    listaVacia.add("Jose")
    listaVacia.add("Edgar")
    listaVacia.add("Maria")
    println(listaVacia)

    //Obtenemos valor del indice
    val valorUsandoGet = listaVacia.get(0) //GET Forma 1
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0] //GET Forma 2
    println(valorUsandoOperador)

    //Obtenemos el primer valor de la lista
    val primerValor = listaNombres.first()
    println(primerValor)

    val primerValorOrNull = listaNombres.firstOrNull() //También puede devolver null si no hay un primer elemento
    println(primerValorOrNull)

    //Eliminar posición
    listaVacia.removeAt(1) //Eliminamos la posición 2 de la lista
    println(listaVacia)

    //Eliminar posición con condición
    listaVacia.removeIf { caracteres -> caracteres.length > 4}
    println(listaVacia)

    //Declarar array (procura usar más los Collections si no importa tanto el performannce)
    val myArray = arrayOf(1,2,3,4)
    println(myArray)
    println(myArray.toList())

    //Ordenar listas
    val numerosLoteria = listOf(11,22,43,56,78,66)
    val numerosSorted = numerosLoteria.sorted() //Ordenamos los números del más pequeño al más grande (ascendente)
    println(numerosSorted)

    val numeroSortedDescendiente = numerosLoteria.sortedDescending() //Ordenamos los números del más grande al más pequeño (desendiente)
    println(numeroSortedDescendiente)

    val ordenarMultiplos = numerosLoteria.sortedBy { numero -> numero < 50 } //Es un ordenamiento customizado. En este caso los número mayores a 50 van primero y los demás después
    println(ordenarMultiplos)

    val ordenarRandom = numerosLoteria.shuffled() //Ordena aleatoriamente la lista
    println(ordenarRandom)

    val numeroReversa = numerosLoteria.reversed() //Ordena al revez a como estaban declarados los valores del array
    println(numeroReversa)

    //Map - nos permite convertir un elemento de un tipo a otro tipo
    val mensajesNumeros = numerosLoteria.map{ numero -> "Tu numero de lotería es $numero" } //Recorre la lista loteria y da un valor a la nueva lista de acuerdo a lo puesto en el map
    println(mensajesNumeros)

    val numerosFiltrados = numerosLoteria.filter { numero -> numero > 50 } //Solo filtrara los números mayores a 50
    println(numerosFiltrados)



    //Maps - clave/valor
    val edadSuperheroes = mapOf( //Inmutable
        "Iron-Man" to 35,
        "Spiderman" to 23,
        "Capitan America" to 49
    )
    println(edadSuperheroes)
    //Los valores de maps se acceden por su key

    val edadSuperheroesMutable = mutableMapOf( //Mutable
        "Iron-Man" to 35,
        "Spiderman" to 23,
        "Capitan America" to 49
    )
    println(edadSuperheroesMutable)

    //Agregar al maps
    edadSuperheroesMutable.put("Wolverine", 45) //Agregamos al map, primero el key y luego el valor
    println(edadSuperheroesMutable)

    edadSuperheroesMutable["Storm"] = 30 //Tambien sirve para agregar al map
    println(edadSuperheroesMutable)

    //Obtener valores
    val edadIronman = edadSuperheroesMutable["Iron-Man"]
    println(edadIronman)

    //Eliminar elementos del maps
    edadSuperheroesMutable.remove("Wolverine")
    println(edadSuperheroesMutable)

    println(edadSuperheroesMutable.keys) //Devuelve una lista de claves
    println(edadSuperheroesMutable.values) //Devuelve una lista de valores


    //Sets - no tienen elementos repetidos. Como tal no tienen indice (orden)
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u") //Inmutable
    println(vocalesRepetidas) //Imprime las primeras 5 debido a que no se pueden repetir valores

    val numerosFavoritos = mutableSetOf(1,2,3,4) //Mutable
    numerosFavoritos.add(5) //Agregamos el 5
    println(numerosFavoritos)
    numerosFavoritos.add(5) //Ya existe, así que en realidad no se agrega
    println(numerosFavoritos)

    //Eliminar elementos de set
    numerosFavoritos.remove(5) //Eliminamos el valor 5 del set
    println(numerosFavoritos)

    //Obtener valores
    val valorSet = numerosFavoritos.first() //Obtenemos el primer elemento
    println(valorSet)

    val valorSetOrNull = numerosFavoritos.firstOrNull() //Obtenemos el primer elemento
    println(valorSetOrNull) //Si es null, imprime null

    val valvalorSetCondicion = numerosFavoritos.first { numero -> numero > 2 } //Devuelve el primer número que cumpla la condición
    println(valvalorSetCondicion)
}