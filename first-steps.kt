/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
  var idade = 18
    
  println(idade)
  
  idade = 21
    
  println(idade)
  
  /* val é uma constante */
  val valorProduto = 2.89
  println(valorProduto)
  
  var idade2: Int = 10
    
  var valorProduto2: Double = 2.10
    
  var produtoAtivo = true
  var produtoAtivo2: Boolean
    
  var cidades = arrayOf("São Paulo", "Recife", "Rio de Janeiro")
  println(cidades[1])
  
  println(cidades.isEmpty())
  println(cidades.count())
  
  var estados = ArrayList<String>()
  estados.add("SP")
  estados.add("RJ")
  
  println(estados[0])
  estados[0] = "São Paulo"
  println(estados[0])
  
  println(estados.isEmpty())
  println(estados.count())
  
  /* set nao pode ter itens repetidos */
  var filmes = HashSet<String>()
  filmes.add("Homem Aranha")
  filmes.add("Vingadores")
  println(filmes)
  // nao vai funcionar pois vingadores ja existe em filmes
  filmes.add("Vingadores")
  
  println(filmes)
  
  // vai funcionar pois o kotlin diferencia maiscula de minuscula 
  filmes.add("vingadores")
  println(filmes)
  println(filmes.count())
  
  var filmes2 = HashSet<String>()
    
  println(filmes2.count())
  println(filmes.contains("Vingadores"))
  println(filmes.contains("Vingadores2"))
  
  
  // aceita dois tipos
  var alunos = HashMap<Int, String>()
  var listaAlunos = mapOf(Pair(1, "Pedro"), Pair(2, "Ana"))
  alunos.putAll(listaAlunos)
  
  println(alunos)
  alunos.put(4, "Fabiana")
  println(alunos)
  println(alunos.count())
  alunos.remove(2)
  println(alunos)
  
 
}
