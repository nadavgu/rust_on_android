package com.krupitskas.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.loadLibrary("pong_lib");

        String r = RustBindings.greeting("Android world");
        ((TextView)findViewById(R.id.helloWorldText)).setText(r);
    }
}
