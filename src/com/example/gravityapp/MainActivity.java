package com.example.gravityapp;

import android.os.*;
import android.app.*;
import android.view.Menu;
import android.graphics.*;

public class MainActivity extends Activity {

	drawGravitySpace drawView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		drawView = new drawGravitySpace(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	

}
