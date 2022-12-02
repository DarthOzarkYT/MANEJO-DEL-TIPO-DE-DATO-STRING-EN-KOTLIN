/*
Ejercicio 4
A partir de una cadena que se introduzca por el teclado mostrar en la pantalla la cantidad de vocales que tiene la misma.

Ejemplo:
Introduzca la cadena: "El Murciélago es un animal mamífero"
Resultado: La cantidad de vocales es: 15 vocales
*/

var cadena: String = ""
var vocales: Int = 0

fun main(){
    print("Introduzca la cadena: ")
    cadena = readLine()!!.toString()
    for(i in 0..cadena.length - 1){
        val ch = cadena[i]
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'á'||ch == 'é'||ch == 'í'||ch == 'ó'||ch == 'ú'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            ++vocales
        }
    }
    println("La cantidad de vocales es: $vocales vocales")
}