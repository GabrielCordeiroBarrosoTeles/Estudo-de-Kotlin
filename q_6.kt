// Enunciado: Crie uma função que verifique se uma palavra é um palíndromo (lê-se igual de trás para frente).
fun isPalindromo(palavra: String): Boolean {
    return palavra == palavra.reversed()
}
