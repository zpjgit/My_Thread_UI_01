    package com.example.administrator.my_thread_ui_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView1);
        Button button_1 = (Button) findViewById(R.id.button1);
        button_1.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.button1:
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            text.setText("地球，早上好！");

                        }
                    }).start();
                    break;
                 default:
                     break;
            }
        }
    }
