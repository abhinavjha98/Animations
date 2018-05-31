package com.example.abhi.fading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void click(View view){
        ImageView img=(ImageView)findViewById(R.id.imageView);
        ImageView img2=(ImageView)findViewById(R.id.imageView2);
        img.animate().alpha(0f).setDuration(2000);
        img2.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
