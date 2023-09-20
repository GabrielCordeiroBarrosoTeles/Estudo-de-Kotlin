// Enunciado: Crie uma função que calcule o fatorial de um número não negativo.
fun calcularFatorial(numero: Int): Int {
    if (numero <= 1) {
        return 1
    }
    return numero * calcularFatorial(numero - 1)
}
