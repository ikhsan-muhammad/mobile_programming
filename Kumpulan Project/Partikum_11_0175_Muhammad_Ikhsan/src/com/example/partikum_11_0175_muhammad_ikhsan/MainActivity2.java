package com.example.partikum_11_0175_muhammad_ikhsan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {
Button btn_lp,btn_home;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		btn_lp = (Button)findViewById(R.id.btn_lp);
		btn_home = (Button)findViewById(R.id.btn_home);
		btn_lp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent perpindahan = new Intent(arg0.getContext(), MainActivity3.class);
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
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

}
