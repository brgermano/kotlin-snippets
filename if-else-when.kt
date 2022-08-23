/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

	// IF ELSE
	//var idade = 17
	var idade = 18
    
    if (idade < 18) {
        println("menor")
    }
    else if (idade == 18) {
        println("tem 18")
    }
    else {
        println("maior")
    }
    
    // WHEN
    var numero = 7
    
    when (numero % 2) {
        1 -> {
            println("IMPAR")
        }
        
        0 -> {
            println("PAR")
        }
    }
    
    // ?:
    var nume: Int? = null
    var numero2: Int = numero ?:0
    println(numero2)
}

