package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;
import com.example.splashscreen.R.layout;
import com.example.splashscreen.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tugas11_1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas11_1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas11_1, menu);
		return true;
	}

}
