// Enunciado: Crie uma função que conte o número de vogais em uma palavra.
fun contarVogais(palavra: String): Int {
    val vogais = "aeiouAEIOU"
    var contador = 0
    for (letra in palavra) {
        if (letra in vogais) {
            contador++
        }
    }
    return contador
}
