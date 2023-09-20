// Enunciado: Crie uma função que verifique se um número é primo.
fun isPrimo(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}
