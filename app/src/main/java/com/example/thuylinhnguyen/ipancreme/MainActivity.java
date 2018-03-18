package com.example.thuylinhnguyen.ipancreme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    public void fade(View view) {

        ImageView brushes = (ImageView) findViewById(R.id.brushes);
        ImageView birds = (ImageView) findViewById(R.id.birds);
        if(brushes.getAlpha()==1) {
            brushes.animate().alpha(0f).setDuration(2000);
            birds.animate().alpha(1f).setDuration(2000);

        }
        else{
            brushes.animate().alpha(1f).setDuration(2000);
            birds.animate().alpha(0f).setDuration(2000);
        }
    }

//    public void rfade(View view) {
//        ImageView brushes = (ImageView) findViewById(R.id.brushes);
//        ImageView birds = (ImageView) findViewById(R.id.birds);
//        brushes.animate().alpha(1f).setDuration(2000);
//        birds.animate().alpha(0f).setDuration(2000);
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void sendMessage(View view) {
//        // Do something in response to button
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
}
