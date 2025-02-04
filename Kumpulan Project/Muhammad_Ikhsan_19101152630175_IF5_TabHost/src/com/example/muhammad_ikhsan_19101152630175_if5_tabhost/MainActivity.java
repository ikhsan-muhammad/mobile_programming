package com.example.muhammad_ikhsan_19101152630175_if5_tabhost;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
TabHost tab_menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tab_menu = getTabHost();
		
		TabSpec ts1 = tab_menu.newTabSpec("Page 1");
		ts1.setIndicator("Logo Android");
		ts1.setContent(new Intent(this, MainActivity2.class));
		tab_menu.addTab(ts1);
		
		TabSpec ts2 = tab_menu.newTabSpec("Page 2");
		ts2.setIndicator("About Android");
		ts2.setContent(new Intent(this, MainActivity3.class));
		tab_menu.addTab(ts2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
