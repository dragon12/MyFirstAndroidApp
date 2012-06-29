package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MyFirstActivity extends Activity {
	
	public static final String DEBUG_TAG = "MyFirstAppLogging";
	public static final String KEY_EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
        Log.i(DEBUG_TAG, "Test info output");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	Log.i(DEBUG_TAG, "On create options menu");
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public void sendMessage (View view)
    {
    	Intent intent = new Intent(this, DisplayMessageActivity.class);

    	EditText eText = (EditText)findViewById(R.id.edit_message);
    	String message = eText.getText().toString();
    	intent.putExtra(KEY_EXTRA_MESSAGE, message);
    	
    	Log.i(DEBUG_TAG, "About to send message to next activity: " + message);

    	startActivity(intent);
    }
    
}
