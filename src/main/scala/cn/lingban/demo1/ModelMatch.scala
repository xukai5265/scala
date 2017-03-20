package cn.lingban.demo1

/**
  * Created by xukai on 2017/3/20.
  * scala 模式匹配
  * 一个模式匹配包含了一系列备选项，每个都开始于关键字 case。每个备选项都包含了一个模式及一到多个表达式。箭头符号 => 隔开了模式和表达式。
  */
object ModelMatch {
  def matchTest(x : Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def main(args: Array[String]) {
    println(matchTest(4))
  }
}
