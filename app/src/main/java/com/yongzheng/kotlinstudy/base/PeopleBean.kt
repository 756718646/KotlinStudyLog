package com.yongzheng.kotlinstudy.base

/**
 * Created by Administrator on 2017/11/9 0009.
 */
class PeopleBean( var name : String,var age : Int)


fun PeopleFun(){
    var people = PeopleBean("mike",10);
    people.age = 10;
}


//2.3.2 自定义访问器
class Rectangle(var height:Int,var width:Int){
    val isSquare : Boolean get() = height==width
}

fun RectTest(){
    var r = Rectangle(10,11);
    println(r.isSquare);
}

//2.3.3 目录和包


//简单枚举类
enum class SimpleColor{
    RED,BLUE,GREEN
}

//带属性的枚举类
enum class Color(var r:Int,var g:Int,var b:Int){
    RED(255,0,0);
    fun rgb() = (r * 256 + g) * 256 +b
}

fun testColor(){
    println(Color.RED.rgb());
}

//2.4.2 使用 "when” 处理枚举类

//when是一个有返回值的表达式，因此，作为表达式函数体，它可以去掉花括号和return语句，并省略返回类型的声明。
//下面是一个通过when处理枚举类的例子，它和Java中的switch语句类似，根据when中Color的值走到对应的分支，除此之外，我们可以把多个值用逗号间隔，合并到同一个分支：

fun getWarmth(color: SimpleColor) = when(color){
    SimpleColor.BLUE,SimpleColor.GREEN -> "test"
    SimpleColor.RED -> "red"
}

//2.4.3 在 “when”结构中使用任意对象
//setOf是由Kotlin标准函数库提供的，它可以创建出一个Set
//如果set集合里面的数据一样，就进行分支选择
fun mix(c1:SimpleColor,c2:SimpleColor) =
        when(setOf(c1,c2)){
            setOf(SimpleColor.RED,SimpleColor.GREEN) -> "1111"
            setOf(SimpleColor.GREEN,SimpleColor.BLUE) -> "333"
            else -> "222"
        }


//2.4.4 智能转换：合并类型检查和转换
//在kotlin中，判断一个变量是否是某种类型需要使用is关键字，它和Java当中的instanceOf相似。

//接口类
interface Expr
//直接返回
class Num(val value : Int) : Expr
//求和
class Sum(val left : Expr,var right : Expr):Expr

//递归求和函数
fun cal(expr : Expr) : Int =
        when(expr){
            is Num -> expr.value
            is Sum -> cal(expr.left) + cal(expr.right)
            else -> 0
        }

fun testCal(){
    println(cal(Sum(Sum(Num(1),Num(2)),Num(6))))
}