package cn.lingban.demo2

import scala.collection.mutable.ArrayBuffer

/**
  * Created by xukai on 2017/4/21.
  *
  * 给定一个整数的数组缓冲，我们想要移除除第一个负数外的所有的负数。
  */
object Demo {
  def main(args: Array[String]) {
    var first = true
    val a = ArrayBuffer[Int](1,2,-1,3,-3,-4,5,-6)
    val indexes = for(i <- 0 until a.length if first || a(i)>=0) yield {
      if(a(i)<0) first=false;i
    }
    // Vector(0, 1, 2, 3, 6)
    println(indexes)
    //然后将元素移动到该去的位置，并截断尾端：
    for(j <- 0 until indexes.length){
      a(j) = a(indexes(j))
    }
    a.trimEnd(a.length-indexes.length)
    println(a)


  }
}
