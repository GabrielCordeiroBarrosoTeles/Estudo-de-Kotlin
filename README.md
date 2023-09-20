# Estudo-de-Kotlin
Kotlin é uma linguagem de programação moderna e concisa que é compatível com a JVM (Java Virtual Machine) e pode ser usada para desenvolver aplicativos Android, aplicativos para desktop e muito mais. Aqui estão alguns conceitos e exemplos básicos para você começar:

1. **Variáveis e Tipos de Dados:**
   Em Kotlin, você pode declarar variáveis usando as palavras-chave `var` (mutável) e `val` (imutável). Os tipos de dados são inferidos automaticamente, mas você também pode especificá-los explicitamente.

   Exemplo:
   ```kotlin
   val nome: String = "João"
   var idade: Int = 25
   ```

2. **Funções:**
   Funções são definidas usando a palavra-chave `fun`. O tipo de retorno é especificado após os parâmetros da função.

   Exemplo:
   ```kotlin
   fun somar(a: Int, b: Int): Int {
       return a + b
   }
   ```

3. **Estruturas Condicionais:**
   Kotlin possui estruturas condicionais comuns, como `if`, `else if` e `else`.

   Exemplo:
   ```kotlin
   val nota = 85
   if (nota >= 90) {
       println("A")
   } else if (nota >= 80) {
       println("B")
   } else {
       println("C")
   }
   ```

4. **Estruturas de Repetição:**
   Você pode usar os loops `for` e `while` em Kotlin para iterar sobre coleções ou executar código repetidamente.

   Exemplo:
   ```kotlin
   for (i in 1..5) {
       println(i)
   }

   var x = 0
   while (x < 5) {
       println(x)
       x++
   }
   ```

5. **Coleções:**
   Kotlin fornece uma variedade de coleções, como listas, conjuntos e mapas.

   Exemplo:
   ```kotlin
   val listaNomes = listOf("Maria", "José", "Ana")
   val mapaIdades = mapOf("João" to 25, "Pedro" to 30)
   ```

6. **Classes e Objetos:**
   Kotlin é uma linguagem orientada a objetos. Você pode criar classes e objetos para modelar suas abstrações.

   Exemplo:
   ```kotlin
   class Pessoa(val nome: String, val idade: Int)

   val pessoa1 = Pessoa("Alice", 28)
   ```

7. **Null Safety:**
   Kotlin enfatiza a segurança em relação a valores nulos. Você pode usar o operador `?` para indicar que uma variável pode ser nula e o operador `!!` para afirmar que uma variável não é nula.

   Exemplo:
   ```kotlin
   val nome: String? = null
   val tamanho = nome?.length // tamanho será nulo se nome for nulo
   ```

Esses são apenas alguns conceitos básicos de Kotlin. A linguagem tem muitos recursos poderosos e uma sintaxe limpa que a torna atraente para desenvolvedores. Para aprender mais, você pode explorar tutoriais online, documentação oficial ou cursos online dedicados a Kotlin.

**Exercício 0: Hello World**
Enunciado: Imprima Hello World na tela.

```kotlin
fun main() {
  println("Hello World")
}
```

**Exercício 1: Soma de Dois Números**
Enunciado: Crie uma função que recebe dois números como argumentos e retorna a soma deles.

```kotlin
fun soma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val resultado = soma(5, 3)
    println("A soma é $resultado")
}
```

**Exercício 2: Média de Três Números**
Enunciado: Crie uma função que calcula a média de três números.

```kotlin
fun media(a: Double, b: Double, c: Double): Double {
    return (a + b + c) / 3.0
}

fun main() {
    val resultado = media(5.0, 8.0, 12.0)
    println("A média é $resultado")
}
```

**Exercício 3: Verificar Número Par ou Ímpar**
Enunciado: Crie uma função que verifica se um número é par ou ímpar e retorna uma mensagem correspondente.

```kotlin
fun verificarParOuImpar(numero: Int): String {
    return if (numero % 2 == 0) "Par" else "Ímpar"
}

fun main() {
    val numero = 7
    val resultado = verificarParOuImpar(numero)
    println("$numero é $resultado")
}
```

**Exercício 4: Fatorial de um Número**
Enunciado: Crie uma função que calcula o fatorial de um número.

```kotlin
fun calcularFatorial(numero: Int): Long {
    if (numero == 0) {
        return 1
    }
    var fatorial: Long = 1
    for (i in 1..numero) {
        fatorial *= i
    }
    return fatorial
}

fun main() {
    val numero = 5
    val resultado = calcularFatorial(numero)
    println("O fatorial de $numero é $resultado")
}
```

**Exercício 5: Verificar Primo**
Enunciado: Crie uma função que verifica se um número é primo.

```kotlin
fun isPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

fun main() {
    val numero = 13
    val resultado = if (isPrimo(numero)) "é primo" else "não é primo"
    println("$numero $resultado")
}
```

**Exercício 6: Calcular Potência**
Enunciado: Crie uma função que calcula a potência de um número.

```kotlin
fun calcularPotencia(base: Double, expoente: Int): Double {
    return Math.pow(base, expoente.toDouble())
}

fun main() {
    val base = 2.0
    val expoente = 3
    val resultado = calcularPotencia(base, expoente)
    println("$base elevado a $expoente é igual a $resultado")
}
```

**Exercício 7: Contar Números Pares em uma Lista**
Enunciado: Crie uma função que conta quantos números pares existem em uma lista de inteiros.

```kotlin
fun contarPares(lista: List<Int>): Int {
    return lista.count { it % 2 == 0 }
}

fun main() {
    val numeros = listOf(2, 3, 6, 8, 9, 10)
    val quantidadePares = contarPares(numeros)
    println("Existem $quantidadePares números pares na lista.")
}
```

**Exercício 8: Inverter uma String**
Enunciado: Crie uma função que recebe uma string como entrada e retorna a string invertida.

```kotlin
fun inverterString(texto: String): String {
    return texto.reversed()
}

fun main() {
    val texto = "Kotlin"
    val textoInvertido = inverterString(texto)
    println("Texto invertido: $textoInvertido")
}
```

**Exercício 9: Encontrar o Maior Número em uma Lista**
Enunciado: Crie uma função que encontra o maior número em uma lista de inteiros.

```kotlin
fun encontrarMaiorNumero(lista: List<Int>): Int? {
    return lista.maxOrNull()
}

fun main() {
    val numeros = listOf(10, 5, 8, 20, 3)
    val maiorNumero = encontrarMaiorNumero(numeros)
    println("O maior número na lista é: $maiorNumero")
}
```

**Exercício 10: Calcular o Número de Palavras em uma Frase**
Enunciado: Crie uma função que conta o número de palavras em uma frase.

```kotlin
fun contarPalavras(frase: String): Int {
    val palavras = frase.split(" ")
    return palavras.size
}

fun main() {
    val texto = "Kotlin é uma linguagem de programação moderna."
    val numeroPalavras = contarPalavras(texto)
    println("O número de palavras na frase é: $numeroPalavras")
}
```

Espero que esses exercícios ajudem você a praticar Kotlin. Eles abrangem uma variedade de conceitos e desafios comuns encontrados na programação.
