package com.example.related;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            btn1 = findViewById(R.id.btn1);
            btn1.setOnClickListener(this);

            btn2 = findViewById(R.id.btn2);
            btn2.setOnClickListener(this);

            btn3 = findViewById(R.id.btn3);
            btn3.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
       switch (v.getId()) {
           case R.id.btn1:
                Intent intent = new Intent(this, Yandexmap.class);
                startActivity(intent);
                break;
                    default:
                break;
            }

       switch (v.getId()) {
           case R.id.btn2:
                Intent intent = new Intent(this, Googlemap.class);
                startActivity(intent);
                break;
                    default:
                break;
            }

       switch (v.getId()) {
            case R.id.btn3:
                Intent intent = new Intent(this, Browser.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

