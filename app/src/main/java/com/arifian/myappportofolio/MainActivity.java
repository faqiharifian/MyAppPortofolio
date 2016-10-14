package com.arifian.myappportofolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view){
        String message = "This button will launch my ";
        switch(view.getId()){
            case R.id.app1_button:
                message += getResources().getString(R.string.app_1);
                break;
            case R.id.app2_button:
                message += getResources().getString(R.string.app_2);
                break;
            case R.id.app3_button:
                message += getResources().getString(R.string.app_3);
                break;
            case R.id.app4_button:
                message += getResources().getString(R.string.app_4);
                break;
            case R.id.app5_button:
                message += getResources().getString(R.string.app_5);
                break;
            case R.id.app6_button:
                message += getResources().getString(R.string.app_6);
                break;
        }
        message += " app!";

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
