function tailRecFactorial(n: number, accumulator: number = 1): number {
	if(n === 1) return accumulator
	return tailRecFactorial(n - 1, n * accumulator)
}

function factorial(n: number):number{
  let acc = 1
  let m = n
  while (m!=1){
    acc *= m
    m -= 1
  }
  return acc
}

const result = factorial(4)
console.log("result", result)
const tailRecResult = tailRecFactorial(4)
console.log("tailRecResult", tailRecResult)

export { tailRecFactorial, factorial }
