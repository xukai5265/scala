package cn.lingban.demo2

import scala.util.Random

/**
  * Created by xukai on 2017/4/21.
  * 编写一段代码，将a 设置为一个n个随机整数的数组。
  */
object Demo1 {
  def main(args: Array[String]) {
    val random = new Random()
    val a = new Array[Int](10);
    for(i <- 0 until a.length){
      a(i) = random.nextInt(10)
    }
    println(a.mkString(","))
  }
}
