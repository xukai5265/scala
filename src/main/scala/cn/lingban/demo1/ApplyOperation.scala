package cn.lingban.demo1

/**
  * Created by xukai on 2017/3/16.
  * Scala 的apply 有2 张形式，一种是 伴生对象的apply ，一种是 伴生类中的apply，下面展示这2中的apply的使用。
  */
class ApplyOperation {

}
class ApplyTest{
  def apply() = println("I am into spark so much!!!")
  def haveATry: Unit ={
    println("have a try on apply")
  }
}
object ApplyTest{
  def apply() = {
    println("I  am into Scala so much")
    new ApplyTest
  }
}
object ApplyOperation{
  def main (args: Array[String]) {
    val a = ApplyTest() //这里就是使用object 的使用
    a.haveATry
    a() // 这里就是 class 中 apply使用
  }
}
