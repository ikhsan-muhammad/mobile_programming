package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class General extends TabActivity {
TabHost tab_menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_general);
		tab_menu = getTabHost();
		
		TabSpec ts1 = tab_menu.newTabSpec("Page Tugas");
		ts1.setIndicator("Tugas/Task");
		ts1.setContent(new Intent(this, Activity_Home.class));
		tab_menu.addTab(ts1);
		
		TabSpec ts2 = tab_menu.newTabSpec("Page Project");
		ts2.setIndicator("Project");
		ts2.setContent(new Intent(this, Activity_Home_2.class));
		tab_menu.addTab(ts2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.general, menu);
		return true;
	}

}
