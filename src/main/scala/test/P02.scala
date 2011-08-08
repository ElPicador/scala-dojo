package test

object P02 {

  def penultimate[E](list: List[E]): Option[E] = list match {
    case List() => None
    case head :: List() => Some(head)
    case head :: _ :: List() => Some(head)
    case _ :: tail => penultimate(tail)
  }
 
}