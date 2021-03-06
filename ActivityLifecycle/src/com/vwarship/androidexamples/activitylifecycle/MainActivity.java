package com.vwarship.androidexamples.activitylifecycle;

import com.vwarship.activitylifecycle.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	
	private Button m_btnSearch;
	private Button m_btnDesktop;
	private Button m_btnClear;
	
	private TextView m_textView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //onPause -> onResume
        m_btnSearch = (Button)this.findViewById(R.id.btnSearch);
        m_btnSearch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClassName("com.android.quicksearchbox", "com.android.quicksearchbox.SearchActivity");
				startActivity(intent);
			}
		});
        
        //onPause -> onStop -> onRestart -> onStart -> onResume
        m_btnDesktop = (Button)this.findViewById(R.id.btnDesktop);
        m_btnDesktop.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				startActivity(intent);
			}
		});
        
        m_btnClear = (Button)this.findViewById(R.id.btnClear);
        m_btnClear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				m_textView.setText("");
			}
		});
        
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
