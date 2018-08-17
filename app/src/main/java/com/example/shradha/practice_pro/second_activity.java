package com.example.shradha.practice_pro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ResourceBundle;

public class second_activity extends AppCompatActivity {
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        Configuration config=getResources().getConfiguration();
/*

this is code to change fragmet  by orientation

 */

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            /**
             * Landscape mode of the device
             */
            BlankFragment ls_fragment = new BlankFragment();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            /**
             * Portrait mode of the device
             */
      BlankFragment2 pm_fragment = new BlankFragment2();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
    }
    /*
    
    1) this is on click event there are two buttons in second_activity.xml and that buttons are use to load  fragmets
    2) both button have same on click function attached that is frag
    3)frag function get elemet by id and replace existiong fragment by new fragment
    4) make use of headerfile as given above otherwise it will show error

public void frag(View v){
    Fragment fragment;
    BlankFragment b=new BlankFragment();

    if(v == findViewById(R.id.button2)){
fragment= new BlankFragment();
        FragmentManager fn=getFragmentManager();
        FragmentTransaction ft= fn.beginTransaction();
        ft.replace(R.id.fragment2,fragment);
        ft.commit();
    }else  if(v == findViewById(R.id.button3)){
        fragment= new BlankFragment2();
        FragmentManager fn=getFragmentManager();
        FragmentTransaction ft= fn.beginTransaction();
        ft.replace(R.id.fragment2,fragment);
        ft.commit();
    }

}

*/
    }

