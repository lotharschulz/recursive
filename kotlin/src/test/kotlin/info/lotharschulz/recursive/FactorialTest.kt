package info.lotharschulz.recursive

import kotlin.test.Test
import kotlin.test.assertEquals

class FactorialTest {
    @Test fun testFactorial() = assertEquals(24, factorial(4))
    @Test fun testTailRecFactorial() = assertEquals(24, tailRecFactorial(4))
    @Test fun testTailRecFactorialEquivalent() = assertEquals(24, tailRecFactorialEquivalent(4))
}
