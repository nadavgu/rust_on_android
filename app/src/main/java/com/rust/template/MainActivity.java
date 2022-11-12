package com.rust.template;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.loadLibrary("template_lib");

        String r = new RustBindings().greeting("Android world");
        ((TextView)findViewById(R.id.helloWorldText)).setText(r);
    }
}
