package info.lotharschulz.recursive

fun factorial(n: Long) : Long = when {
        n == 1L -> n
        else -> n * factorial(n - 1)
}

tailrec fun tailRecFactorial(n: Long, acc: Long = 1) : Long =  when {
        n == 1L -> n * acc
        else -> tailRecFactorial(n-1, n * acc)
}

// https://twitter.com/kotlin/status/1341749661175066624/photo/1
fun tailRecFactorialEquivalent(n: Int):Int{
        var acc = 1
        var m = n
        while (m!=1){
                acc *= m
                m -= 1
        }
        return acc
}
