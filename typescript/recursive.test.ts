import { tailRecFactorial, factorial } from './recursive'

describe('fact', () => {
  it('tailRecFactorial(4) == 24', () => {
    const expected = 24
    expect(tailRecFactorial(4)).toEqual(expected)
  })
  it('factorial(4) == 24', () => {
    const expected = 24
    expect(factorial(4)).toEqual(expected)
  })
})
