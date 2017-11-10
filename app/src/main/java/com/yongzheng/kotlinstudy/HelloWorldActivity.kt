package com.yongzheng.kotlinstudy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hello_world.*

/**
 * kotlin activity
 * //在线 编辑 https://try.kotlinlang.org
 * http://www.kotlindoc.cn/
 * http://www.jianshu.com/p/f9e78d6c54bd
 */
class HelloWorldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world);
        nameView.text = "跳转到java activity"
        nameView.setOnClickListener { toJavaActivity() }
    }

    /**
     * 前去
     */
    private fun toJavaActivity() {
        startActivity(Intent(this,MainActivity::class.java))
    }

    //2.1.1 函数的基本构成
    /**
     * 函数
     *  函数名称
        参数列表
        返回类型
        函数体
     */
    public fun toToast(info:String):String{
        return info;
    }

    //无返回值的函数
    public fun toToast(){
        System.out.println("test");
    }


    //2.1.2 表达式和语句
    public fun max(num:Int,num2 :Int):Int{
        //有函数体的需要显示返回值和返回类型
        return if (num>num2)num else num2;
    }

    //当函数体是由单个表达式构成时，可以用这个表达式作为完整的函数体，
    // 并且去掉花括号和return语句，上面的例子就是这种情况，因此可以改写为：
    public fun max2(num: Int,num2: Int):Int = if(num>num2)num else num2;
    //如果函数体写在花括号中，我们说这个函数有    代码块体
    //如果它直接返回了一个表达式，它就有         表达式体

    //表达式函数可以省略return返回值和返回类型(他会自动类型推导)，代码块(有大括号的)必须有显示写出返回类型和返回值


    //2.2 变量
    //变量的声明以关键字val/var
    //可以不加变量类型
    private fun valueTest(){
        //初始化赋值，可以不用添加类型
        val name = "mike";
        val age = 10;
        //没有初始化，需要制定类型
        var address : String;
        address = "myAddress";
        println("address=$address")
        System.out.println(name+" "+age);
    }

    //2.2.1 可变变量和不可变变量
    //(1)使用val声明的变量不能在初始化之后再次赋值，它对应的是Java的final变量。
    //(2) 可变引用 var 这种变量的值可以改变，但是它的类型却是改变不了的。
    fun varFun(){
        var name = "mike";
        name = "join";
        println("name is $name");
    }


    //2.2.2 字符串模板
    fun funString(){
        val a = 1;
        val b = 2;
        val  name = if (a>b)a else b;
        println("name is $name")
    }

    //花括号可以使用表达式
    fun funStr2(){
        val a = 1;
        val b = 2;
        println("max is ${if (a>b)a else b}");
    }

    //2.3 类



}
