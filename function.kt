//Exemplo de função para calcular os 10
//primeiros números da sequência de 
//Fibonacci
fun main(args: Array<String>) {

    //Função
    fun sequenciaFibonacci() {

        //Declaração de variáveis
        var number1 = 0
        var number2 = 1

        //Loop controlado de 1 até 10
        for (sequence in 1..10) {

            //Impressão do conteúdo da variável number1
            println("$sequence -> $number1")

            //Soma dos 2 valores das variáveis
            var sum = number1 + number2

            //Troca os valores entre as variáveis
            number1 = number2
            number2 = sum
        }
    }

    //Executar a função
    sequenciaFibonacci()
}
