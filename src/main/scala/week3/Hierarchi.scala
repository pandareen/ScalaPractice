package week3

object Hierarchi extends App {

  abstract class IntSet {
    def incl(x: Int): IntSet

    def contains(x: Int): Boolean

    def union(other: IntSet): IntSet
  }

  class Empty extends IntSet {
    override def incl(x: Int): IntSet = {
      new NonEmpty(x, new Empty, new Empty)
    }

    override def contains(x: Int): Boolean = {
      false
    }

    override def union(other: IntSet): IntSet = {
      other
    }
  }

  case class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    override def incl(x: Int): IntSet = null

    override def contains(x: Int): Boolean = {
      if (elem == x) return true
      else if (x > elem) return right.contains(x)
      else return left.contains(x)
    }

    override def union(other: IntSet): IntSet = ???
  }

}
