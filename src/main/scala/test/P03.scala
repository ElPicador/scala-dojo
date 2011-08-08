package test

object P03 {
  def nth [E](n: Int, list: List[E]): E = {
    list.each.with_index do |e, i|
      return e if i == n
    end
  }
  
  def nth2[E](n: Int, list: List[E]): E = {
    list.zipWithIndex.find(_._2 == n).map(_._1)
  }

}