package info.lotharschulz.recursive

import kotlin.test.Test
import kotlin.test.assertEquals


class Fibonacci {
    @Test fun testFibonacciListFromSequence() = assertEquals(listOf(0,1,1,2,3,5,8), fibonacciListFromSequence(7))
    @Test fun testTailRecFibonacciList() = assertEquals(listOf(0,1,1,2,3,5,8), tailRecFibonacciList(7))
    @Test fun testTailRecFibonacciResult() = assertEquals(13, tailRecFibonacciResult(7))
    @Test fun testFibonacci() = assertEquals(13, fibonacci(7))
}
