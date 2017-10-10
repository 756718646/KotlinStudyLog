package com.yongzheng.kotlinstudy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hello_world.*

/**
 * kotlin activity
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


}
