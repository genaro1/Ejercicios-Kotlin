fun main() {
    // val: la variable no se puede reasignar después.
    val nombre: String = "Andrea"

    // var: permite cambiar el valor durante el programa.
    var edad: Int = 20

    val correo: String = "andrea@email.com"
    var cuentaActiva: Boolean = true
    val satisfaccion: Double = 9.5

    println("INFORMACION DEL USUARIO")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

    // Como edad y cuentaActiva son var, podemos modificar sus valores.
    edad = 21
    cuentaActiva = false

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Cuenta activa: $cuentaActiva")
}
