package cn.lingban.demo2

/**
  * Created by xukai on 2017/4/21.
  * Array 定长数组
  * scala 的 Array 以 java 数组方式实现。
  */
object ArrayDemo {
  def main(args: Array[String]) {
    //定长数组，10个整数的数组，所有元素初始化都为0
    val nums = new Array[Int](10)
    //长度为2的Array[String] 类型是推断出来的。
    //已提供初始值，就不需要new 关键字
    val s = Array("abc","bcd")
    //Array("徐凯","bcd")
    //使用() 而不是[] 来访问元素
    s(0)="徐凯"
  }
}
