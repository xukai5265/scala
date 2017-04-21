package cn.lingban.demo2

import scala.collection.mutable.ArrayBuffer

/**
  * Created by xukai on 2017/4/21.
  * ArrayBuffer 变长数组：数组缓冲
  * 对于那种长度需要变化的数组，java 有 ArrayList
  */
object ArrayBufferDemo {
  val b = ArrayBuffer[Int]()
  //或者
  val a = new ArrayBuffer[Int]()
  b+=1
  //ArrayBuffer(1) 用+=在微端添加元素
  b += (1,2,3,5)
  //ArrayBuffer(1,1,2,3,5)
  //在尾端添加多个元素，以括号包起来

  b ++= Array(8,13,22)
  //用++= 操作符追加任何集合 ArrayBuffer(1,1,2,3,5,8,13,22)

  b.trimEnd(5)
  //移除最后5个元素  Array(1,1,2)

  b.trimStart(1)
  //移除前1个元素   Array(1,2)

  //在数组缓冲的尾端添加或移除元素是一个高效的操作。
  //可以在任意位置插入或者移除元素，但这样的操作不那么高校。


  //定长数组与缓冲数组的转换。
  //注意： 有些时候需要构建一个Array，但不知道最终需要装多少元素，在这种情况先构建一个数组缓冲，然后调用
//  b.toArray

  //同理 b.toBuffer可以将一个数组转换为一个数组缓冲


  def main(args: Array[String]) {

    //遍历数组/缓冲数组
    /*
      用法：
        until 是RichInt类的方法，返回所有小于(但不包括)上限的数字。
      例如：
        0 until 10
           Range(0,1,2,3,4,5,6,7,8,9)
      注意：
        0 until 10 实际上是调用了一个方法：0.until(10)
        如下结构
          for(i <- 区间) 会让变量i 遍历该区间的所有值。
     */
    for(i <-0 until b.length )
      println(i + ":" + b(i) )

    //如果不需要返回数组的下标
    for(elem <- b)
      println(elem)



    /*********************数组转换**********************************************************************/


  }
}
