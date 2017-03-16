package cn.lingban.demo1

/**
  * Created by xukai on 2017/3/16.
  * 伴生类和伴生对象
  */

//伴生类
class Student(var name:String,var address:String) {
  private var phone="110"
  //直接访问伴生对象的私有成员
  def infoCompObj() = println("伴生类中访问伴生对象：" + Student.sno)


}

//伴生对象
object Student extends App{
  private var sno:Int = 100

  def incrementSno()={
    sno += 1 //加1
    sno  //返回sno
  }
  //main
  println("单例对象：" + Student.incrementSno()) //单例对象
  //实例化伴生类
  val obj = new Student("徐凯","河北省承德市")
  obj.infoCompObj();
  println(obj.toString)
}


