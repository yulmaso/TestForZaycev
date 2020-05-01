package com.yulmaso.testforzaycev.TaskThree;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yulmaso.testforzaycev.R;

public class FirstActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("myLogs", "FirstActivity.onCreate()");
        setContentView(R.layout.activity);
        tv = findViewById(R.id.textView);
        tv.setText(this.getClass().getSimpleName());
        findViewById(R.id.buttonTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myLogs", "  FirstActivity.onStart()");
        State.name = "Dmitriy";
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myLogs", "    FirstActivity.onResume()");
        State.age = 20;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myLogs", "    FirstActivity.onPause()");
        State.age = 19;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myLogs", "  FirstActivity.onStop()");
        State.name = "Daria";
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myLogs", "FirstActivity.onDestroy()");
    }
}
