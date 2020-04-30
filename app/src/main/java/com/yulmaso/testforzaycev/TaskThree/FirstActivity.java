package com.yulmaso.testforzaycev.TaskThree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yulmaso.testforzaycev.R;

public class FirstActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        State.name = "Dmitriy";
    }

    @Override
    protected void onResume() {
        super.onResume();
        State.age = 20;
    }

    @Override
    protected void onPause() {
        super.onPause();
        State.age = 19;
    }

    @Override
    protected void onStop() {
        super.onStop();
        State.name = "Daria";
    }
}
