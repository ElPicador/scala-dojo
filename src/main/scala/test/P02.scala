package test

class P02 {
  
  //Find the last but one element of a list.
  def penultimate[E](ls: List[E]): E = ls match {
    case x::_::Nil => x
    case _::xs => penultimate(xs)
  }
}