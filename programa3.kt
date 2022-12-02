/*
Ejercicio 3
A partir de una que se introduzca por el teclado, invertir la misma y mostrarla en pantalla

Ejemplo:
Introduzca la cadena: "Programacion Orientada a Objetos"
Salida: sotejbO a adatneirO nóicamargorP
*/

var texto: String = ""
var invertido: String = ""

fun main(){
    print("Introduzca la cadena: ")
    texto = readLine()!!.toString()
    invertido = texto.reversed()
    println(invertido)
}