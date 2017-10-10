package com.yongzheng.kotlinstudy;

import android.content.Intent;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * java的activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 调用kotlin activity
     * @param view
     */
    public void startKotlinActivity(View view) {
        //调用kotlin
        People people = new People(1,"mike2");
        people.setName("ccc");
        Toast.makeText(this,"xxx:"+people.getName(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,HelloWorldActivity.class));
    }
}
