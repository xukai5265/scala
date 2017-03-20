package cn.lingban.demo1

/**
  * Created by xukai on 2017/3/20.
  * unapply的使用
  */
object UnapplyStudent extends App{
  // 提取固定数量的对象
  def unapply(arg: String): Option[(String,String,String)] = {
    val parts = arg.split(",")
    if(parts.length==3)
      Some(parts(0),parts(1),parts(2))
    else
      None
  }

  var UnapplyStudent(id,name,age) = "1,xukai,28"
  println(id)
  println(name)
  println(age)
}
