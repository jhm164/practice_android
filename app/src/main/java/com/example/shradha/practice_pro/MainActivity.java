package com.example.shradha.practice_pro;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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
Button button;
EditText u;
EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u=(EditText) findViewById(R.id.u);
        p=(EditText)findViewById(R.id.p);
    }

    public void func(View v){
        Toast.makeText(getApplication().getBaseContext(),u.getText()+" "+p.getText(),Toast.LENGTH_LONG).show();
if (p.getText().toString().equals("admin")&&u.getText().toString().equals("admin")){
        Intent intent=new Intent(".second_activity");
        startActivity(intent);
    }else {
    Toast.makeText(getApplication().getBaseContext(),"username or password is wrong",Toast.LENGTH_SHORT).show();
    }
    }
}
