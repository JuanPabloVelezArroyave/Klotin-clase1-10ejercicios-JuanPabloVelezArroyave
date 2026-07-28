
fun saludar() {  // se deja la función por fuera del main para mantener un código más organizado y poder reciclarlo
    print("¿Cómo te llamas? ")
    val nombre = readln()

    print("¿Qué edad tienes? ")
    val edad = readln()

    // Aquí usamos  (String Templates) con el símbolo $
    println("¡Hola, $nombre! Qué increíble tener $edad años.")
}
fun calculadora() {
    print("Ingrese el primer número: ")
    val num1 = readln().toDouble()

    print("Ingrese el segundo número: ")
    val num2 = readln().toDouble()

    println("Elija la operación: 1. Suma | 2. Resta | 3. Multiplicación | 4. División")
    val opcion = readln() // Aquí esperamos que el usuario elija

    // 'when' revisa qué eligió el usuario y solo ejecuta esa parte
    when (opcion) {
        "1" -> println("Suma: ${num1 + num2}")
        "2" -> println("Resta: ${num1 - num2}")
        "3" -> println("Multiplicación: ${num1 * num2}")
        "4" -> {
            if (num2 == 0.0) {
                println("¡Error! No se puede dividir entre cero.")
            } else {
                println("División: ${num1 / num2}")
            }
        }
        else -> println("Opción no válida. Intente de nuevo.")
    }
}
fun clasificadorEdad() {
    print("Ingrese su edad: ")
    val edad = readln().toInt()

    when{
        edad <=12 -> println("Eres un niño")
        edad <=17 -> println("Eres un adolescente")
        edad <=59 -> println("Eres un adulto")
        else -> println("Eres un adulto mayor")
    }
    /* esta es otra forma de rangos que el lenguaje permite para realizar el mismo procedimiento */
    /*when (edad) {
        in 0..12 -> println("eres un niño ")
        in 13..17 -> println("eres un adolescente ")
        in 18..59 -> println("eres un adulto ")
        else -> println("eres un adulto mayor ")

    }*/

}
fun contadorRegresivo(){
    println("Contador regresivo")
    println("")
    print("Ingresa un número para iniciar: ")

    // Se guarda el número ingresado . Si se escriben letras, usamos el 5.
    var numero = readln().toIntOrNull() ?: 5

    while (numero > 0) {
        println(numero)
        numero-- // Esto le quita 1 al número en cada vuelta
    }
}
fun promedio(){

        var suma = 0.0 // Aquí guardaremos el total acumulado

        // Repetimos esta acción exactamente 5 veces
        for (i in 1..5) {
            print("Dime la nota del examen $i: ")
            // Leemos lo que escribes. Si te equivocas de tecla, asumimos un 0.0
            val nota = readln().toDoubleOrNull() ?: 0.0
            suma += nota // Sumamos la nueva nota al total
        }

        val promedio = suma / 5
        println("¡Listo! Tu promedio final es: $promedio")

}
fun validador(){
    print("Dime tu nombre: ")
    // Si no escribe nada, usamos "Invitado Anónimo"
    val nombre = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Invitado Anónimo"

    print("Dime tu edad: ")
    // Si no escribe un número, asignamos 0
    val edad = readlnOrNull()?.toIntOrNull() ?: 0

    print("Dime tu altura (ej. 1.75): ")
    // Si lo deja en blanco o escribe texto, asignamos 0.0
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("--- PERFIL REGISTRADO ---")
    println("Nombre: $nombre")
    println("Edad: $edad años")
    println("Altura: $altura metros")
}
fun String.imprimirDatosPersonales(
    edad: Int = 30,
    ciudad: String = "Medellín" // ¡Un saludo desde aquí!){}
) {
    println("Perfil: ${this} | $edad años | Vive en $ciudad")
}
fun convertirTemperatura(valor: Double, opcion: Int): Double {
    return when (opcion) {
        1 -> (valor * 1.8) + 32  // Celsius a Fahrenheit
        2 -> (valor - 32) / 1.8  // Fahrenheit a Celsius
        else -> valor            // Opción inválida: devuelve el mismo valor
    }
}

// Función 1: Clasifica a la persona según su edad usando 'when'
fun determinarCategoria(edad: Int): String {
    return when {
        edad < 18 -> "Menor de edad"
        edad in 18..64 -> "Adulto"
        else -> "Adulto Mayor"
    }
}

// Función 2: Crea el mensaje personalizado
fun crearMensaje(nombre: String, categoria: String): String {
    return "¡Hola $nombre! Tu cuenta ha sido activada con éxito bajo la categoría: $categoria."
}



fun main () {
    println()
    
    println ("==================== EJERCICIO 1 ====================")
    saludar() // se realiza el llamado a la función saludar
    println()
    println ("==================== EJERCICIO 2 ====================")
    calculadora() // se realiza llamado desde la función calculadora
    println()
    println ("==================== EJERCICIO 3 ====================")
    clasificadorEdad() // se realiza llamado desde la función clasificadorEdad
    println()
    println ("==================== EJERCICIO 4 ====================")
    contadorRegresivo()
    println()
    println ("==================== EJERCICIO 5 ====================")
    promedio()
    println()
    println ("==================== EJERCICIO 6 ====================")
    validador()
    println()
    println ("==================== EJERCICIO 7 ====================")
    println("--- Cliente 1 (No dice nada) ---")
    "Juan Pérez".imprimirDatosPersonales()
    println("\n--- Cliente 2 (Da su nombre, edad y ciudad) ---")
    "Ana".imprimirDatosPersonales(ciudad = "Bogotá")
    println()
    println ("==================== EJERCICIO 8 ====================")

        print("¿De qué número quieres la tabla de multiplicar?: ")
        // Leemos el número. Si el usuario se equivoca o lo deja en blanco, usamos el 1 por defecto.
        val numero = readlnOrNull()?.toIntOrNull() ?: 1

        println("--- TABLA DEL $numero ---")

        // El bucle for recorre los números del 1 al 10 uno por uno
        for (i in 1..10) {
            println("$numero x $i = ${numero * i}")
        }
        println()
          println("==================== EJERCICIO 9 ====================")
        println("--- CONVERSOR DE TEMPERATURA ---")
        println("1. Convertir de Celsius a Fahrenheit")
        println("2. Convertir de Fahrenheit a Celsius")
        print("Elige una opción (1 o 2): ")
        val opcion = readlnOrNull()?.toIntOrNull() ?: 1

        print("Ingresa el valor numérico de la temperatura: ")
        val temp = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        val resultado = convertirTemperatura(temp, opcion)
        println("El resultado final es: $resultado")
        println()
        println("==================== EJERCICIO 10 ====================")
        println("--- REGISTRO DE USUARIO ---")

        // 1. Lectura segura de datos (Null Safety)
        print("Ingresa tu nombre: ")
        val nombre = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Invitado"

        print("Ingresa tu edad: ")
        val edad = readlnOrNull()?.toIntOrNull() ?: 18

        // 2. Procesamiento de información usando nuestras funciones
        val categoria = determinarCategoria(edad)
        val mensaje = crearMensaje(nombre, categoria)

        // 3. Resumen final impreso en pantalla
        println("\n==================================")
        println("      RESUMEN DEL PERFIL          ")
        println("==================================")
        println("Nombre:    $nombre")
        println("Edad:      $edad años")
        println("Categoría: $categoria")
        println("Mensaje:   $mensaje")
        println("==================================")
        println()
}

