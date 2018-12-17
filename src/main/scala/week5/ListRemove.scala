package week5

object ListRemove extends App {
  def removeAt[T](n: Int, xs: List[T]): List[T] = {
    n match {
      case 0 => xs.tail
      case _ => xs.head :: removeAt(n - 1, xs.tail)
    }
  }


  def flatten(xs: List[Any]): List[Any] = {
    if (xs == List()) {
      println("int nil"); return Nil
    }
    println(xs.head + " " + xs.tail)
    xs.head match {
      case x :: xt => println("2nd case"); println("head: " + x + " tail: " + xt); x :: flatten(xt) ++ flatten(xs.tail)
      case x => println("3rd case"); println("result of 3rd case is " + x :: flatten(Nil)); x :: flatten(xs.tail)
    }

  }

  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))


}
