def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}


val x = toInt("0").getOrElse(9)

toInt("1").foreach { i =>
  println(s"Got an int: $i")
}

val bag = List("1", "2", "foo", "3", "bar")
bag.map(toInt)

bag.map(toInt).flatten