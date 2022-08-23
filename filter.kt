/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
  // FILTER
  val numeros = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(numeros)
  
  var numerosPares = numeros.filter { it % 2 == 0 }
  var numerosImpares = numeros.filter { it % 2 != 0 }
  
  println("Numeros pares: " + numerosPares)
  println("Numeros impares: " + numerosImpares)

}
