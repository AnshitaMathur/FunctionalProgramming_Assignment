package openclosed

class Openclosed {

}
trait ValueComparator {
  /**
   * @return +ve if v1>v2, -ve if v1<v2, and zero if v1=v2;
   */
  def compare(v1: Int, v2: Int): Int
}


object ArrayUtil { // this is closed for modification but open for extension.
  def sort(a: Array[Int], comparator: ValueComparator): Unit = {
    for (i <- 0 until a.length) {
      for (j <- i + 1 until a.length) {
        if (comparator.compare(a(i), a(j)) > 0) {
          val t = a(i)
          a(i) = a(j)
          a(j) = t
        }
      }
    }
  }
}


object OpenClosed {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 9, 3, 0, 2, 6, 4, 5, 7, 8)
    ArrayUtil.sort(arr, new DesComparator)
    println("Values in the array are: ")
    for (i <- arr) {
      println(i)
    }
  }
}


class AscComparator extends ValueComparator {
  override def compare(v1: Int, v2: Int): Int = v1 - v2
}

class DesComparator extends ValueComparator {
  override def compare(v1: Int, v2: Int): Int = v2 - v1
}


