package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Tugas8_1Activity extends Activity {
Button btn_lp,btn_home;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas8_1);
		btn_lp = (Button)findViewById(R.id.btn_lp);
		btn_home = (Button)findViewById(R.id.btn_home);
		btn_lp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent perpindahan = new Intent(arg0.getContext(), Tugas8_2Activity.class);
				startActivityForResult(perpindahan, 0);
			}
		});
		btn_home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent perpindahan = new Intent();
				setResult(RESULT_OK, perpindahan);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas8_1, menu);
		return true;
	}

}
