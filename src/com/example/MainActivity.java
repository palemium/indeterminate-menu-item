package com.example;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initializeABS();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.menu, menu);
    	return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	if (item.getItemId() == R.id.menu_refresh) {
    		item.setActionView(R.layout.indeterminate_progress_action);
    	}
    	return super.onOptionsItemSelected(item);
    }
    
    private void initializeABS() {
		ActionBar bar = getActionBar();
		bar.setHomeButtonEnabled(true);
	}
}