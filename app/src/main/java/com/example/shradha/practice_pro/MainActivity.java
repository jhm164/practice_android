package com.example.shradha.practice_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


/*

Steps to create Activities
1)go to res/layout rhitclick and select empty activity
2)go to mainfist.xml fime copy and pest
 <intent-filter>
                <action android:name=".second_activity" />
                <category android:name="android.intent.category.DEFAULT" />
  </intent-filter>
  3)change name of  <action android:name=".second_activity" />
  4) create method as given below and assign on click event to it
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func(View v){
        Intent intent=new Intent(".second_activity");
        startActivity(intent);
    }
}
