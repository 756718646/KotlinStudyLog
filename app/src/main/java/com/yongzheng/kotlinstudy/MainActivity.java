package com.yongzheng.kotlinstudy;

import android.content.Intent;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHelloWorld();
            }
        });
    }

    private void startHelloWorld() {
        //调用kotlin
        People peopleKt = new People(1,"mike2");
        Toast.makeText(this,"xxx:"+peopleKt.getName(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,HelloWorldActivity.class));
    }
}
