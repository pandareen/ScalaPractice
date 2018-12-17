package week5

object MergeSort extends App {

  def merge(list1: List[Int], list2: List[Int]): List[Int] = {
    if (list1 == List()) return list2
    if (list2 == List()) return list1
    if (list1.head > list2.head) return list2.head :: merge(list1, list2.tail)
    else return list1.head :: merge(list1.tail, list2)
  }

  def mergesort(inputList: List[Int]): List[Int] = {
    if (inputList.length == 1) return inputList
    val splitList = inputList.splitAt(inputList.length / 2)
    println(splitList)
    return merge(mergesort(splitList._1), mergesort(splitList._2))
  }

  println(mergesort(List(2, 3, 52, 26, 11)))
}
