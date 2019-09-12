package com.example.androiddemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androiddemo.R;

public class FristDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist_demo);

        //找到对象按钮
        Button btn = findViewById(R.id.button);

        //注册按钮监听
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristDemoActivity.this, "you clicked a Button", Toast.LENGTH_SHORT).show();
            }
        });

        //Lambda(拉姆达)表达式写法：
//        btn.setOnClickListener((v) -> {
//            Toast.makeText(FristDemoActivity.this, "you clicked a Button", Toast.LENGTH_SHORT).show();
//        });
    }
}
