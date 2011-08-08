package test

object P03 {
  def nth [E](n: Int, list: List[E]): E = {
    var elementToReturn = list.head
    list.foldLeft(0) { (acc: Int, element: E) =>
      if(acc == n) 
        elementToReturn = element
      acc + 1
    }
    elementToReturn
  }
  
  def nth2[E](n: Int, list: List[E]) = {
    list.zipWithIndex.find(_._2 == n).map(_._1)
  }

}