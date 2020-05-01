package com.yulmaso.testforzaycev.TaskThree;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yulmaso.testforzaycev.R;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("myLogs", "SecondActivity.onCreate()");
        setContentView(R.layout.activity);
        tv = findViewById(R.id.textView);
        tv.setText(this.getClass().getSimpleName());
        findViewById(R.id.buttonTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("My name is ");
                tv.append(State.name);
                tv.append(" i'm ");
                tv.append(Integer.toString(State.age));
                tv.append(" years old");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myLogs", "  SecondActivity.onStart()");
        State.name = "Mikhail";
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myLogs", "    SecondActivity.onResume()");
        State.age = 22;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myLogs", "    SecondActivity.onPause()");
        State.age = 21;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myLogs", "  SecondActivity.onStop()");
        State.name = "Igor";
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myLogs", "SecondActivity.onDestroy()");
    }
}
