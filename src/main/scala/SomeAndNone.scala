
object SomeAndNone extends App {

  val example = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val example2 = scala.collection.mutable.Map("x" -> 10, "y" -> 11, "z" -> 12)

  def readInt(str: String): Option[Int] =
    if (str matches "-?\\d+") Some(str.toInt) else None

  println(addOptions2(readInt("abe"), readInt("21")))


  for ((a, b) <- Seq(1, 2, 3).zip(Seq(4, 5, 6))) yield a + b

  def addOptions(opt1: Option[Int], opt2: Option[Int]) =
    for {
      a <- opt1
      b <- opt2
    } yield a + b

  println(example.get("x"))

  def addOptions2(opt1: Option[Int], opt2: Option[Int]) =
    opt1 flatMap { a =>
      opt2 map { b =>
        a + b
      }
    }

}
