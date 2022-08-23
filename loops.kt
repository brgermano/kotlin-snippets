/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    
    // vai do 1 até o 3
	for (n in 1..3) {
        println("$n PRIMEIRO_FOR")
    }
    
    // vai do 1 até o 2
	for (n in 1 until 3) {
        println("$n SEGUNDO_FOR")
    }
    
    var nmrs = ArrayList<Int>()
    nmrs.add(23)
    nmrs.add(29)
    nmrs.add(22)
    nmrs.add(25)
    nmrs.add(27)
    
    for (n in nmrs) {
        println("$n TERCEIRO_FOR")
    }
    
    var cont = 0
    while (cont < 3) {
        
        print("WHILE")
        cont = cont + 1
    }
    cont = 0
    do {
        println("DO WHILE")
        cont = cont + 1
    } while (cont < 3)

}










