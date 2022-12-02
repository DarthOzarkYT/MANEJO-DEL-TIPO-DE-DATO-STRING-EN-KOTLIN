/*
Ejercicio 2
A partir de una cadena cad y un caracter car, que se introduzca a través del teclado, ¿Determinar cuantas veces se repite el
"caracter" en una cadena "cad"?

Ejemplo:
cad = "Hola alumnos de cualquiera de las carreras de Upiicsa"
car = 'a'
Salida: El caracter 'a' se repite 8 veces
*/

var cad: String = ""
var car: String = ""
var repetir: Int = 0

fun main(){
    print("Introduzca la cadena: ")
    cad = readLine()!!.toString()
    print("Introduzca un caracter: ")
    car = readLine()!!.toString()
    for (i in 0..cad.length - 1) {
        val ch = cad[i]
        val c: Char = car.single()
        if (ch == c) {
            ++repetir
        }
    }
    println("El caracter *$car* se repite $repetir veces")
}