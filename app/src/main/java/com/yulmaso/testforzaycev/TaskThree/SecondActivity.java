package com.yulmaso.testforzaycev.TaskThree;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yulmaso.testforzaycev.R;

public class SecondActivity extends AppCompatActivity {

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
        State.name = "Mikhail";
    }

    @Override
    protected void onResume() {
        super.onResume();
        State.age = 22;
    }

    @Override
    protected void onPause() {
        super.onPause();
        State.age = 21;
    }

    @Override
    protected void onStop() {
        super.onStop();
        State.name = "Igor";
    }
}
