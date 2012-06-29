package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.util.Log;

public class MyFirstActivity extends Activity {
	
	private static final String DEBUG_TAG = "MyFirstAppLogging";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
        Log.i(DEBUG_TAG, "Test info output");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_my_first, menu);
        return true;
    }

    
}
