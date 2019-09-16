package com.example.tuan2p2bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toast toast = Toast.makeText(MainActivity.this,"Hello toast !",Toast.LENGTH_SHORT);
        Toast toast = Toast.makeText(MainActivity.this,"Hello toast !",Toast.LENGTH_LONG);
        toast.show();
        //Toast.LENGTH_SHORT : hiển thị 2 giây; Toast.LENGTH_LONG : hiển thị 3.5 giây
    }
}
