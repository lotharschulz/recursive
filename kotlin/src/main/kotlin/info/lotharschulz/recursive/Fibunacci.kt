package info.lotharschulz.recursive

private fun generateFibonacciSequence(): Sequence<Int> =
    generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
fun fibonacciListFromSequence(x:Int): List<Int> = generateFibonacciSequence().take(x).toList()

tailrec fun tailRecFibonacciList(n: Int, a: Int=0, b: Int=1, result: MutableList<Int> = mutableListOf()): List<Int> =
    when(n){
        0->result
        else -> {
            result.add(a)
            tailRecFibonacciList(n-1, b, a + b, result)
        }
    }

tailrec fun tailRecFibonacciResult(n: Int, a: Int=0, b: Int=1): Int =
    when(n){
        0->a
        1->b
        else -> tailRecFibonacciResult(n-1, b, a + b)
    }

fun fibonacci(n: Int): Int =
    when(n){
        0 -> 0
        1 -> 1
        else -> fibonacci(n-1) + fibonacci(n-2)
    }
