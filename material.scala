package object Demo {

  val xs = Seq(1, 2, 3, 4, 5, 6)
  
  sealed trait Term

  case class Number(value: Int) extends Term
  case class Var(name: String) extends Term
  case class Sum(a: Term, b: Term) extends Term
  case class Prod(a: Term, b: Term) extends Term
  case class Power(a: Term, b: Term) extends Term

}