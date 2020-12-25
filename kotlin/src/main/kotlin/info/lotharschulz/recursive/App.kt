/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package info.lotharschulz.recursive

fun main() {
    val y = 5L
    println("factorial($y): ${factorial(y)}")
    println("tailrecFactorial($y): ${tailRecFactorial(y)}")

    val x = 9
    println("fibonacciListFromSequence(${x}): ${fibonacciListFromSequence(x)}")
    println("fibonacciListFromSequence(${x}).fold(0) { element, sum ->  element + sum}: " +
            "${fibonacciListFromSequence(x).fold(0) { element, sum ->  element + sum}}")
    println("fibonacciListFromSequence(${x}).reduce  { element, sum ->  element + sum}: " +
            "${fibonacciListFromSequence(x).reduce() { element, sum ->  element + sum}}")
    println("fibonacciListFromSequence(${x}): ${fibonacciListFromSequence(x).sum()}")

    println("tailRecFibonacciList(${x}): ${tailRecFibonacciList(x)}")
    println("tailRecFibonacciList(${x}).fold(0) { element, sum ->  element + sum}: " +
            "${tailRecFibonacciList(x).fold(0) { element, sum ->  element + sum}}")
    println("tailRecFibonacciList(${x}).reduce  { element, sum ->  element + sum}: " +
            "${tailRecFibonacciList(x).reduce() { element, sum ->  element + sum}}")
    println("tailRecFibonacciList(${x}).sum(): ${tailRecFibonacciList(x).sum()}")

    println("tailRecFibonacciResult(${x-1}): ${tailRecFibonacciResult(x-1)}")
    println("fibonacci(${x-1}): ${fibonacci(x-1)}")

}
