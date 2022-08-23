/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

  // REDUCE
  var movi = arrayOf<Double>(200.0, -30.0, 40.0, -50.0, -30.0, 30.0)
  
  var saldo = movi.reduce { primeiroValor, proximoValor -> primeiroValor + proximoValor }
  println("Reduce: " + saldo)
  
  
}
