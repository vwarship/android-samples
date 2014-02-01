package com.vwarship.activitylifecycle;

import com.vwarship.activitylifecycle.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	
	private TextView m_textView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        m_textView = (TextView)this.findViewById(R.id.textView);
        
    	Log("onCreate");
    }
    
    private void Log(String text)
    {
    	StringBuilder sb = new StringBuilder(m_textView.getText());
    	sb.append('\n').append(text);
    	
        m_textView.setText(sb.toString());
    	Log.i(TAG, text);
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	
        Log("onStart");
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	
    	Log("onResume");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	
    	Log("onPause");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	
    	Log("onStop");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	
    	Log("onRestart");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	
    	Log("onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
