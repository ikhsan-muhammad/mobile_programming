package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tugas11Activity extends TabActivity {
	TabHost tab_menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas11);
tab_menu = getTabHost();
		
		TabSpec ts1 = tab_menu.newTabSpec("Page 1");
		ts1.setIndicator("Logo Android");
		ts1.setContent(new Intent(this, Tugas11_1Activity.class));
		tab_menu.addTab(ts1);
		
		TabSpec ts2 = tab_menu.newTabSpec("Page 2");
		ts2.setIndicator("About Android");
		ts2.setContent(new Intent(this, Tugas11_2Activity.class));
		tab_menu.addTab(ts2);
		
		TabSpec ts3 = tab_menu.newTabSpec("Page 2");
		ts3.setIndicator("About Android");
		ts3.setContent(new Intent(this, Tugas11_3Activity.class));
		tab_menu.addTab(ts3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas11, menu);
		return true;
	}

}
