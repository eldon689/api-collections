package br.com.eyeservicosemti

fun main() {
    val tamanho = 4
    val values = IntArray(tamanho)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    for (valor in values) {
        println("O valor é: $valor")
    }
values.forEach {
    println(it)
}
    println("------------------")
    for (index in values.indices){
        println(values[index])
    }

}