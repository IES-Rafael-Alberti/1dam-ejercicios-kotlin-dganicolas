import java.util.*

fun ejercicio1(){
    print("dame una temperatura en celcius: ")
    try{
    val cel = readln().toFloat() * 9 / 5 + 32

    println("tu temperatura en grados fahrenheit: $cel")
    }catch (e: Exception){
        println("ERROR")
    }
}
fun ejercicio2(){
    val iva = 1.10
    try{
    val precio = readln().toDouble()

    val noiva = precio / iva
    val soloiva = precio - noiva
    println("El precio sin iva es ${String.format("%.2f", noiva)} y el iva es ${String.format("%.2f", soloiva)}")
    }catch (e: Exception){
        println("ERROR")
    }
}
fun ejercicio3(){
    print("´dame su peso Kg: ")
    try{
    val peso = readln().toFloat()

    print("dame su estatura (en metros): ")
    val altura = readln().toFloat()
    val IMC = peso / (altura * altura)
    print("tu IMC es ${String.format("%.2f", IMC)}")
    }catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio4(){
    val interes = 0.04
    print("dame el dinero depositado: ")
    try{
    val año1 = readln().toFloat() * (1 + interes)

    val año2 = año1 * (1 + interes)
    val año3 = año2 * (1 + interes)
    println("el ahorro del primer año es de: ${String.format("%.2f", año1)}€")
    println("del segundo año es de: ${String.format("%.2f", año2)}€")
    println("del tercer año es de: ${String.format("%.2f", año3)}€")
    }catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio5(){
    try {
        print("dame tu nombre completo: ")
        val nom = readln()
        println(nom.lowercase())
        println(nom.uppercase())
        val nombre = nom.split(" ")
        val nom1 = nombre[0]
        val nom2 = nombre[1]
        val nom3 = nombre[2]

    println("${nom1.lowercase().capitalize()} ${nom2.lowercase().capitalize()} ${nom3.lowercase().capitalize()}")
    }catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio6(){
    try {
        print("dime el teléfono (ejemplo +34-123123123-56): ")
        val tlfn = readln().split("-")

        println("El número es: ${tlfn[1]}")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio7(){
    print("dame una frase: ")
    val frase = readln()
    println("la frase invertida: ${frase.reversed()}")
}
fun ejercicio8(){
    try {
        print("Introduce el precio del producto en €: ")
        val precio = readln().split(",")

    println("los euros son ${precio[0]} y los céntimos son ${precio[1]}")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio9(){
    try {
        print("dame la fecha dd/mm/aaaa: ")
        val fecha = readln().split("/")
        val dia = fecha[0].toInt()
        val mes = fecha[1].toInt()
        val ano = fecha[2].toInt()

        println("Día $dia del mes $mes del año $ano")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio10(){
    print("dame todos los productos de la cesta por comas: ")
    val compra = readln().split(",")
    print(compra.joinToString(separator = "\n" ))
}
fun ejercicio11(){
    try {
        print("dame el nombre del producto, su precio y el número de unidades separado por ,: ")
        val producto = readln().split(",")
        val nombreprod = producto[0]
        val precioprod = producto[1].toDouble()
        val cantidadpro = producto[2].toInt()
        val cuenta = precioprod * cantidadpro

    print("el  producto es: $nombreprod, ")
    print("su precio: ")
    print("${"%.2f".format(precioprod).take(6)}€ ")
    print(",vendio un total de ${String.format("%3d", cantidadpro)} unidades ")
    print(" el coste total es: ")
    println("${"%.2f.".format(cuenta).take(8)}€")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio12() {
    val admin = "1234"
    print("teclea la contraseña: ")
    val contraseña = readln().lowercase()
    if (admin == contraseña) {
        println("acesso permitido.")
    } else {
        println("ERROORRR MAL ")
    }
}
fun ejercicio13() {
    try {
        print("dame el numero: ")
        val num1 = readln().toInt()
        print("dame el segundo numero: ")
        val num2 = readln().toInt()

        if (num2 == 0) {
            println("ERROR")
        }else {
            val resultado = num1.toFloat() / num2
            println("resultado de la división de $num1 y $num2 es $resultado")
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio14() {
    print("dame tu nombe: ")
    val nombre = readln().lowercase()
    print("dame tu sexo hombre o mujer: ")
    val sexo = readln().lowercase()

    if (sexo == "mujer" && nombre < "m" || sexo == "hombre" && nombre > "n") {
        println("eres grupo A")
    } else {
        println("eres grupo B")
    }
}

fun ejercicio15() {
    try {
        print("dame los puntos del empleado: ")
        val puntos = readln().toFloat()

        if (puntos >= 0.0 && puntos < 0.1){
            println("eres malo.")
        }
        else if (puntos >= 0.4 && puntos < 0.5){
            println("has trabajado la cantidad recibida será de ${puntos * 2400}€.")
        }
        else if (puntos >= 0.6) {
            println("tas explotao la cantidad recibida será de ${puntos * 2400}€")
        }
        else {
            println("tas gracioso, cantidad equivocada")
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio16() {
    try {
        print("quieres la pizza vegetariana (1) o no vegetariana (2): ")
        val pizza = readln().toInt()
        println(funcion_pizzas(pizza))
        if (pizza == 1) {
            print("que quieres ingrediente para su pizza: Pimiento (1) o Tofu (2): ")
            val ingrediente = readln().toInt()
            when (ingrediente) {
                1 -> println("pizza es la vegetariana con pimiento como ingrediente.")
                2 -> println("pizza es la vegetariana con tofu como ingrediente.")
                else -> println("ERROR")
            }
        }
        if (pizza == 2) {
            print("Eliga un ingrediente para su pizza: Peperoni (1), Jamón (2) o Salmón(3) : ")
            val ingredienteNoVegano = readln().toInt()
            when (ingredienteNoVegano) {
                1 -> println("pizza es la no vegetariana con peperoni como ingrediente.")
                2 -> println("pizza es la no vegetariana con jamón como ingrediente.")
                3 -> println("Su pizza es la no vegetariana con salmón como ingrediente.")
                else -> println("ERROR")
            }
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}

fun funcion_pizzas(pizza: Int):String {
    when (pizza) {
        1 -> return "los ingredientes son vegetarianos:\n- Pimiento\n- Tofu"
        2 -> return "los ingredientes son no vegetarianos: \n- Peperoni\n- Jamón\n- Salmón"
        else -> return "ERROR"
    }
}
fun ejercicio17() {
    try {
        print("dame tu edad: ")
        val edad = readln().toInt()

        for (i in 1..edad) {
            if (i < edad) {
                print("$i, ")
            } else {
                println(i)
            }
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio18() {
    try {
        print("dame un numero positivo: ")
        val num = readln().toInt()
        if (num < 0) {
            println("ERROR")
        }
        else {
            for (i in num downTo 0) {
                if (i > 0) {
                    print("$i, ")
                } else {
                    println(i)
                }
            }
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio19() {
    try {
        print("dame la altura del triángulo: ")
        val altura = readln().toInt()
        var piramide = ""
        if (altura <= 0) {
            println("El número introducido debe ser mayor a 0")
        } else {
            for (i in 1..altura) {
                piramide += "*"
                println(piramide)
            }
        }

    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio20() {
    var num = 1
    var multiplo = 0
    var cont = 1
    for (i in 1..10) {
        num = 1
        multiplo++
        println("")
        println("tabla del ${cont++}")
        for (j in 1..10) {
            var resultado = num * multiplo
            println("$num x $multiplo = $resultado")
            num++
        }
    }
}
fun ejercicio21() {
    try {
        print("dame un número entero: ")
        val num = readln().toInt()
        var cont = 1
        var cont2 = 1
        var piramide = ""
        if (num < 0) {
            println("ERROR el numero debe ser positivo.")
        }
        else {
            do {
                piramide = "$cont2 $piramide"
                println(piramide)
                cont++
                cont2 += 2
            }while (cont <= num)
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio22() {
    print("escribe algo ('*' para terminar): ")
    var eco = readln()
    while (eco != "*") {
        println(eco)
        println("")
        print("sigue o '*' para terminar: ")
        eco = readln()
    }
}
fun ejercicio23() {
    try {
        print("dame un número entero (0 para salir): ")
        var num = readln().toInt()
        var suma = 0
        do {
            if (num > 0) {
                suma += num
            }
            print("dame otro numero o 0 para salirr: ")
            num = readln().toInt()
        } while (num !=0)
        println("el total de los numeros es: $suma")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio24() {
    try {
        var pares = 0
        do {
            print("dame un número positivo (-1 para salir): ")
            val num = readln().toInt()
            var suma = 0
            if (num < -1) {
                print("El número debe ser positivo")
            } else if (num != -1){
                for (i in num.toString()) {
                    suma += i.toString().toInt()
                }
                println("$num = $suma")
                if (comprobarpares(num) && num != 0) {
                    pares++
                }
            }
        } while (num != -1)
        println("\nLa cantidad de pares es $pares")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun comprobarpares(num:Int):Boolean = num % 2 == 0
fun ejercicio25() {
    println("1- Comenzar programa\n2- Imprimir listado\n3- Finalizar programa\n")
    try {
        do {
            print("\n>> Elige una opción: ")
            var opcion = readln().toInt()
            when (opcion) {
                1 -> println("Esta es la opción 1\n>> Está comenzando el programa...")
                2 -> println("Esta es la opción 2\n>> Se está imprimiendo el listado...")
                else -> println("ERROR")
            }
        } while (opcion != 3)
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio26() {
    print("Introduce una frase: ")
    val frase = readln()
    if (frase == "" || frase == " "){
        println("ERROR")
    } else {
        val palabras = frase.split(" ")
        var palabraLarga = ""
        for (i in palabras) {
            if (palabraLarga.length < i.length) {
                palabraLarga = i
            }
        }
        println("La palabra más larga es $palabraLarga un total de ${palabras.count()}")
    }

}
fun ejercicio27() {
    try {
        print("dame un numero positivo: ")
        val numero = readln().toInt()
        if (numero <= 0) {
            println("ERROR")
        } else {
            for (i in 1..numero step 2) {
                if (i < numero - 1){
                    print("$i, ")
                } else {
                    println(i)
                }
            }
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio28() {
    try {
        print("dame un numero positivo: ")
        var numero = readln().toInt()
        while (numero <= 0) {
            println("ERROR")
            print("Introduce un numero positivo: ")
            numero = readln().toInt()
        }
        for (i in numero downTo 0){
            if (i > 0){
                print("$i, ")
            }else {
                println(i)
            }
        }
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio29(){
    try {
    print("dame un numero entero: ")
    val num = readln()

        num.toInt()
        println("numero introducido es válido.")
    } catch (e: Exception){
        println("ERROR")
    }
}
fun ejercicio30() {
    val numeros = mutableListOf<Int>()
    try {
        for (i in 1..6){
            print("dame los numeros de la loteria: ")
            var num = readln().toInt()
            while(num <= 0 || num > 49){
                print("dame un numero entre 1 y 49: ")
                num = readln().toInt()
            }
            while (num in numeros){
                print("numero ya introducido, introduce uno nuevo: ")
                num = readln().toInt()
            }
            numeros.add(num)
        }
        numeros.sort()
        pedirReintegro(numeros)
        mostrarLoteria(numeros)
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun pedirReintegro(numeros: MutableList<Int>) {
    try {
        print("reintegro => ")
        var reintegro = readln().toInt()
        while (reintegro < 0 || reintegro > 9){
            print("reintegro debe estar entre el 0 y el 9\nReintegro -> ")
            reintegro = readln().toInt()
        }
        numeros.add(reintegro)
    } catch (e: Exception){
        println("ERROR")
    }

}
fun mostrarLoteria(numeros: MutableList<Int>) {
    val num1 = numeros.subList(0,6)
    val reintegro1 = numeros.last()
    println("\ntus numeros son: ${num1.joinToString(" ")}")
    println("tu reintegro es: $reintegro1")
    println("\nlista con los numeros es $numeros")
}
fun ejercicio31() {
    val asignaturas = mutableListOf<MutableList<Any>>(mutableListOf("Matemáticas",0),mutableListOf("Física",0),mutableListOf("Química",0),mutableListOf("Historia ",0),mutableListOf("Lengua",0))
    try {
        for (i in 0..<asignaturas.count()) {
            print("dame la nota de ${asignaturas[i][0]}: ")
            var nota = readln().toInt()
            while (nota < 0 || nota > 10) {
                print("La nota debe ser entre 0 y 10.\ndame la nota de ${asignaturas[i][0]}: ")
                nota = readln().toInt()
            }
            asignaturas[i][1] = nota
        }
        borrar(asignaturas)
        mostrar(asignaturas)
    } catch (e:Exception) {
        println("ERROR")
    }
}
fun borrar(asignaturas: MutableList<MutableList<Any>>){
    try {
        for (i in asignaturas.size-1 downTo 0){
            if (asignaturas[i][1] in 5..10) {
                asignaturas.remove(asignaturas[i])
            }
        }
    } catch (e:Exception) {
        println("ERROR")
    }
}

private operator fun Any.compareTo(i: Int): Int {
    return i
}
fun mostrar(asignaturas: MutableList<MutableList<Any>>) {
    print("Las asignaturas que debes repetir son: ")
    for (i in 0..<asignaturas.size) {
        if (i < asignaturas.size-1){
            print("${asignaturas[i][0]}, ")
        } else if (i == asignaturas.size -1){
            println(asignaturas[i][0])
        }
    }
}
fun ejercicio32() {
    print("dame una palabra: ")
    val palabra = readln()
    val reversa = palabra.reversed()
    if (palabra == reversa) {
        println("Esta palabra es palíndromo.")
    } else{
        println("la palabra no es palíndromo.")
    }
}
fun ejercicio33() {
    print("dame una palabra: ")
    val palabra = readln().lowercase().replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u")
    val vocale = listOf(mutableListOf('a', 0),mutableListOf('e', 0),mutableListOf('i', 0),mutableListOf('o', 0),mutableListOf('u', 0))
    for (i in vocale) {
        i[1] = palabra.count{it == i[0] }
    }
    for (i in vocale.indices){
        println("${vocale[i][0]} = ${vocale[i][1]}")

    }
}
fun ejercicio34() {
    var precio = listOf(50, 75, 46, 22, 80, 65, 8)
    precio = precio.sorted()
    println("precio menor es de ${precio.first()}€ y el mayor es de ${precio.last()}€")
}
fun ejercicio35() {
    print("dame numeros separados por comas: ")
    val numero = readln()
    val lista = numero.split(",")
    val media = media(lista)
    val desviacion = desviacion(lista)
    println("La media es: ${String.format("%.2f", media)}")
    println("desviación típica es: ${String.format("%.2f", desviacion)}")

}
fun media(lista: List<String>):Double {
    var suma = 0.0
    val division = lista.size
    for (i in lista) {
        suma += i.toInt()
    }
    val media = suma/division
    return media
}
fun desviacion(lista: List<String>) {
    val listaInt = mutableListOf<Int>()
    for (i in lista) {
        listaInt.add(i.toInt())
    }
    val desviacion = "FALTA ESTO NO TENGO NI IDEA DE COMO SE HACE AYUDA"
}
fun ejercicio37() {
    val frutas = mapOf("platano" to 1.35, "manzana" to 0.80, "pera" to 0.85, "naranja" to 0.70)
    print("dame el nombre la fruta: ")
    val fruta = readln().lowercase().replace("á", "a")
    print("dime los kilos: ")
    val kilos = readln().toInt()
    if (fruta in frutas) {
        println("el total es ${String.format("%.2f", frutas[fruta]?.times(kilos))}€")
    } else {
        println("ERROR")
    }
}
fun ejercicio38() {
    val asignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var total = 0
    for ((key, value) in asignaturas) {
        println("$key tiene $value")
        total += value
    }
    println("El total es de $total")
}
fun ejercicio39() {
    val Clientes = mutableMapOf<String, String>()
    do {
        println("'*' para salir")
        print("dame los datos del cliente: ")
        val dato = readln().replace(" ", "")
        if (dato != "*") {
            try {
                val datos = dato.split(",")
                if (datos[0] !in Clientes) {
                    Clientes[datos[0]] = datos[1]
                    for ((key, value) in Clientes){
                        println("${key.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}: ${value.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
                    }
                } else {
                    println("Este dato ya se metio")
                }
            } catch (e: Exception) {
                println("ERROR")
            }
        }
    } while (dato != "*")
}
fun ejercicio40() {
    val listaCompra = mutableMapOf<String, Float>()
    var Total = 0.0
    do {
        println("'*' para salir")
        print("dame el producto a añadir: ")
        val articulo = readln()
        if (articulo != "*") {
            try {
                if (articulo !in listaCompra) {
                    print("dame el precio: ")
                    val precio = readln().toFloat()
                    listaCompra[articulo] = precio
                } else {
                    println("el dato ya existe")
                }
            } catch (e: Exception) {
                println("ERROR")
            }
        }
    } while (articulo != "*")
    println("\nlista de la compra")
    for ((key, value) in listaCompra) {
        println("$key      $value€")
        Total += value
    }
    println("\nTotal      ${String.format("%.2f", Total)}€")
}
fun ejercicio41() {
    val diccionario = mutableMapOf<String, String>()
    try {
        print("dame las palabras en español y en inglés (palabra:traducción): ")
        val traducciones = readln()
        val lista = traducciones.split(",")
        for (i in lista) {
            val listaPalabras = i.split(":")
            diccionario[listaPalabras[0]] = listaPalabras[1]
        }
        print("dame una frase para traducir: ")
        val frase = readln()
        val Lista = frase.split(" ", ",").toMutableList()
        var cont = 0
        for (i in Lista) {
            for ((key, value) in diccionario) {
                if (Lista[cont] == key) {
                    Lista[cont] = value
                }
            }
            cont++
        }
        println("La frase traducida: ${Lista.joinToString(" ")}")
    } catch (e: Exception) {
        println("ERROR")
    }
}
fun ejercicio42() {
    var opcion = 0
    val clientes = mutableMapOf<String,MutableMap<String,String>>()
    do {
        println("\nElige una opcion:\n(1) Añadir cliente\n(2) Eliminar cliente\n(3) Mostrar cliente\n(4) Listar todos los clientes\n(5) Listar clientes preferentes\n(6) Terminar")
        print(">> ")
        try {
            opcion = readln().toInt()
            when (opcion){
                1 -> agregarCliente(clientes)
                2 -> eliminarCliente(clientes)
                3 -> mostrarCliente(clientes)
                4 -> listarCliente(clientes)
                5 -> listaPreferentes(clientes)
                6 -> println("Finalizando programa...")
                else -> println("ERROR")
            }
        } catch (e: Exception) {
            println("**ERROR** opción errónea.")
        }
    } while (opcion != 6)
}
fun agregarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente a añadir: ")
    val nif = readln()
    val datosClientes = mutableMapOf<String, String>()
    print("dame el nombre del cliente: ")
    datosClientes["nombre"] = readln()
    print("dame la dirección del cliente: ")
    datosClientes["direccion"] = readln()
    print("dame el teléfono del cliente: ")
    datosClientes["telefono"] = readln()
    print("dame el correo del cliente: ")
    datosClientes["correo"] = readln()
    print("dame si el cliente es preferente (true/false): ")
    datosClientes["preferente"] = readln()
    clientes[nif] = datosClientes
    println("Cliente agregado.")
}
fun eliminarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente a eliminar: ")
    val nif = readln()
    if (nif in clientes) {
        clientes.remove(key = nif)
        println("Cliente eliminado.")
    } else {
        println("No se ha encontrado ningún cliente")
    }
}
fun mostrarCliente(clientes:MutableMap<String, MutableMap<String, String>>) {
    print("Introduce el NIF del cliente: ")
    val nif = readln()
    if (nif in clientes) {
        for ((key, value) in clientes) {
            if (key == nif) {
                for ((k, v) in value) {
                    println("$k: $v")
                }
            }
        }
    } else {
        println("No se ha encontrado ningún cliente")
    }

}
fun listarCliente (clientes:MutableMap<String, MutableMap<String, String>>) {
    for ((key, value) in clientes) {
        println("$key: ${value["nombre"]}")
    }
}
fun listaPreferentes (clientes:MutableMap<String, MutableMap<String, String>>) {
    for ((key, value) in clientes) {
        if (value["preferente"] == "true") {
            println("$key: ${value["nombre"]}")
        }
    }
}
fun ejercicio43() {
    val directorio = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    val lista = directorio.split("\n")
    val directorio2 = mutableMapOf<String, MutableMap<String, String>>()
    for (i in 1..<lista.count()){
        val Campos = lista[0].split(";")
        val valores = lista[i].split(";")
        directorio2[valores[0]] = mutableMapOf(Campos[1] to valores [1], Campos[2] to valores [2], Campos[3] to valores [3], Campos[4] to valores [4])
    }
    println(directorio2)
}
fun ejercicio44() {
    val lista = mutableListOf(
        setOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        setOf("Jorge Russo", 7, 699, "Mirasol 218"),
        setOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        setOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        setOf("Jorge Russo", 15, 958, "Mirasol 218"))
    val domicilio = mutableSetOf<Any>()
    for (i in lista) {
        domicilio.add(i.elementAt(3))
    }
    println(domicilio)
}
fun ejercicio45() {
    val Primarial = mutableSetOf<String>()
    val Secundarial = mutableSetOf<String>()
    do {
        println("Escribe x para salir.")
        print("Introduce el nombre de pila del alumno de primaria: ")
        val Primaria = readln()
        if (Primaria != "x") {
            Primarial.add(Primaria)
        }
    }while (Primaria != "x")
    do {
        println("Escribe x para salir.")
        print("Introduce el nombre de pila del alumno de secundaria: ")
        val Secundaria = readln()
        if (Secundaria != "x") {
            Secundarial.add(Secundaria)
        }
    }while (Secundaria != "x")
    mostrarSinRepeticiones(Primarial, Secundarial)
    mostrarRepetidos(Primarial, Secundarial)
    mostrarNoRepetidosPrimaria(Primarial, Secundarial)
}
fun mostrarSinRepeticiones(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    println("Todos los nombres de primaria y secundaria sin repeticiones son: ${alumnosPrimaria union alumnosSecundaria}")
}
fun mostrarRepetidos(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    println("Los nombres que se repiten son ${alumnosPrimaria intersect alumnosSecundaria}")
}
fun mostrarNoRepetidosPrimaria(alumnosPrimaria:MutableSet<String>, alumnosSecundaria: MutableSet<String>) {
    val mostrar = alumnosPrimaria subtract alumnosSecundaria
    println("Los nombres que no se repiten en primaria son $mostrar")
    if (mostrar == emptySet<String>()) {
        println("Todoes los nombres de primaria están incluidos en secundaria.")
    } else
        println("No todos los nombres de primaria están incluidos en secundaria.")
}

fun u3p3ej3() {

}
fun u3p3ej4() {

}
fun u3p3ej5() {

}
fun u3p3ej6() {

}