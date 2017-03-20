package cn.lingban.demo1

/**
  * Created by xukai on 2017/3/20.
  * 选取一个队列
  */
object UnapplyStudent1 extends App{
  def unapply(input: String): Option[Seq[String]] =
    if (input =="")
      None
    else
      Some(input.trim.split("\\s+"))

  var UnapplyStudent1(seq1:Seq[String]) = "aaa  bbb ccc dddd"
  for (elem <- seq1) {
    println(elem)}
}
