package test

object P03 {
  
  //Find the Kth element of a list.
  //By convention, the first element in the list is element 0.
  def nth[E](n: Int, ls: List[E]): E = (n, ls) match {
    case (0, x::xs) => x
    case (n, x::xs) => P03.nth(n-1, xs)
  }
}