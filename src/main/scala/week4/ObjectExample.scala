package week4

object ObjectExample extends App {


  abstract class Nat {
    def isZero: Boolean

    def predecessor: Nat

    def successor: Nat

    def +(that: Nat): Nat

    def -(that: Nat): Nat
  }

  class Succ(n: Nat) extends Nat {
    override def isZero: Boolean = ???

    override def predecessor: Nat = ???

    override def successor: Nat = ???

    override def +(that: Nat): Nat = ???

    override def -(that: Nat): Nat = ???
  }

  object Zero extends Nat {
    override def isZero: Boolean = true

    override def predecessor: Nat = Zero

    override def successor: Nat = ???

    override def +(that: Nat): Nat = ???

    override def -(that: Nat): Nat = ???
  }

}
