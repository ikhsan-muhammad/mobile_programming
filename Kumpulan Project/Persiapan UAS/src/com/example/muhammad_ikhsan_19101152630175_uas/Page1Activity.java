package com.example.muhammad_ikhsan_19101152630175_uas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Page1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page1, menu);
		return true;
	}

}
