package com.example.lenovo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setMax(75-20);
    }

    public void setText(View v) {
        textView.setText(editText.getText().toString());
        textView.setTextSize(seekBar.getProgress()+20);
    }
}
