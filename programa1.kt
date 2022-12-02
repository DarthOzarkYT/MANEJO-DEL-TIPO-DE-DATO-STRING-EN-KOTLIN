/*
Ejercicio 1
A partir de una cadena que se introduzca por el teclado indicar las veces que se puede obtener la misma cadena
Ejemplo:
Escribir la cadena: "Hola compañeros de Programación"
Salida:
ola compañeros de ProgramaciónH
la compañeros de ProgramaciónHo
a compañeros de ProgramaciónHol
 compañeros de ProgramaciónHola
compañeros de ProgramaciónHola
ompañeros de ProgramacionHola c
mpañeros de ProgramaciónHola co
pañeros de ProgramaciónHola com
añeros de ProgramaciónHola comp
ñeros de ProgramaciónHola compa
eros de ProgramaciónHola compañ
ros de ProgramaciónHola compañe
os de ProgramaciónHola compañer
s de ProgramaciónHola compañero
 de ProgramaciónHola compañeros
de ProgramaciónHola compañeros
e ProgramaciónHola compañeros d
 ProgramaciónHola compañeros de
ProgramaciónHola compañeros de
rogramaciónHola compañeros de P
ogramaciónHola compañeros de Pr
gramaciónHola compañeros de Pro
ramaciónHola compañeros de Prog
amaciónHola compañeros de Progr
maciónHola compañeros de Progra
aciónHola compañeros de Program
ciónHola compañeros de Programa
iónHola compañeros de Programac
ónHola compañeros de Programaci
nHola compañeros de Programació
Hola compañeros de Programación
*/

var cad1: String = ""
var aux: Int = 0

fun main(){
    print("Ingresa la cadena: ")
    cad1 = readLine()!!.toString()
    for(i in 0..cad1.length -1){
        aux = i+1
        println(cad1.slice(i+1..cad1.length - 1)+cad1.slice(0..i))
    }
}