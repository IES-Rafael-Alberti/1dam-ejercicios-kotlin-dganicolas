fun ejercicio1(){
    print("dame una temperatura en celcius: ")
    val cel = readln().toFloat() * 9 / 5 + 32
    println("tu temperatura en grados fahrenheit: $cel")
}
fun ejercicio2(){
    val iva = 1.10
    val precio = readln().toDouble()
    val noiva = precio / iva
    val soloiva = precio - noiva
    println("El precio sin iva es ${String.format("%.2f", noiva)} y el iva es ${String.format("%.2f", soloiva)}")
}
fun ejercicio3(){
    print("´dame su peso Kg: ")
    val peso = readln().toFloat()
    print("dame su estatura (en metros): ")
    val altura = readln().toFloat()
    val IMC = peso / (altura * altura)
    print("Tu IMC es ${String.format("%.2f", IMC)}")
}
fun ejercicio4(){

}
