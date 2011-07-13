package test

object P01 {
  
  // Find the last element of a list.
  // public E last<E>(List<E> ls) {
  //   switch(ls) {
  //     case: toot; break;
  //   }
  // }
  // 
  def last[E](ls: List[E]): E = ls match {
    case Nil | List() => throw new NoSuchElementException
    case head :: Nil => head
    case _ :: tail => P01.last(tail)
  }
}