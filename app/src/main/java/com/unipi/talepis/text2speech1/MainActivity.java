package com.unipi.talepis.text2speech1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    MyTts myTts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        myTts=new MyTts(getApplicationContext());
    }
    public void speak(View view){
        if (editText.getText().length()>0)
        myTts.speak(editText.getText().toString());
    }
}
