package com.example.related;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        addListenerOnButton();
    }

   

    public void addListenerOnButton() {

        btn1 = (Button) findViewById(R.id.yandexmap);
        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Yandex");
                        startActivity(intent);

                    }
                }
        );

        btn2 = (Button) findViewById(R.id.google);
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Google");
                        startActivity(intent);

                    }
                }
        );

    }
}

