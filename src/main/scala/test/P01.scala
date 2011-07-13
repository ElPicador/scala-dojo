package test

object P01 {
  
  // Find the last element of a list.
  // public E last<E>(List<E> ls) {
  //   switch(ls) {
  //     case: toot; break;
  //   }
  // }
  // 
  def last[E](ls: List[E]): Option[E] = ls match {
    case List() => None
    case head :: List() => Some(head)
    case _ :: tail => P01.last(tail)
  }
}