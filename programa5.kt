/*
Ejercicio 5
Crea una función que reciba dos cadenas de caracteres y que devuelva la primera cadena, pero transformando en mayúsculas la parte que
coincide con la segunda cadena introducida.
Desde la función principal se pedirán las dos cadenas y se mostrará el resultado devuelva la funcion de arriba.

Ejemplo:
Introduzca la primera cadena: "Este es mi amigo Carlos"
Introduzca la segunda cadena: "amigo"
Resultado: "Este es mi AMIGO Carlos"
*/

var cadena1: String = ""
var cadena2: String = ""
var posicion: Int = 0
var subcadena: String = ""

fun pasaMayusculas(cadenas: String, parte: String): String {
    posicion = cadenas.indexOf(parte)
    return if(posicion != 1){
        subcadena = cadenas.substring(posicion,posicion+parte.length)
        cadenas.substring(0,posicion)+subcadena.uppercase()+cadenas.substring(posicion+parte.length)
    }else{
        cadenas
    }
}

fun main(){
    print("Introduzca la primera cadena: ")
    cadena1 = readLine()!!.toString()
    print("Introduzca la segunda cadena: ")
    cadena2 = readLine()!!.toString()
    println("Resultado: "+ pasaMayusculas(cadena1, cadena2))
}