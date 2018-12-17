object FunctionProduct extends App {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else
      f(a) * product(f)(a + 1, b)
  }

  def factorial(x: Int): Int = {
    product((x) => x)(1, x)
  }

  println(factorial(3))
}