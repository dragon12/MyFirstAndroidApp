package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Intent passedIntent = getIntent();
        String messagePassed = passedIntent.getStringExtra(MyFirstActivity.KEY_EXTRA_MESSAGE);
        
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(messagePassed);
        
        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_message, menu);
        return true;
    }

    
}
