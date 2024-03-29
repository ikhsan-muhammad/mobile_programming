package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Activity_Home_2 extends Activity {
Button pjct1, pjct2, pjct3, pjct4, pjct5, pjct6, pjct7, pjct8, pjct9, pjct10, pjct11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity__home_2);
		pjct1 = (Button)findViewById(R.id.pjct1);
		pjct2 = (Button)findViewById(R.id.pjct2);
		pjct3 = (Button)findViewById(R.id.pjct3);
		pjct4 = (Button)findViewById(R.id.pjct4);
		pjct5 = (Button)findViewById(R.id.pjct5);
		pjct6 = (Button)findViewById(R.id.pjct6);
		pjct7 = (Button)findViewById(R.id.pjct7);
		pjct8 = (Button)findViewById(R.id.pjct8);
		pjct9 = (Button)findViewById(R.id.pjct9);
		pjct10 = (Button)findViewById(R.id.pjct10);
		pjct11 = (Button)findViewById(R.id.pjct11);
		
		pjct1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah1 = new Intent(arg0.getContext(), Project1Activity.class);
				startActivityForResult(pindah1, 0);
			}
		});
		pjct2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah2 = new Intent(arg0.getContext(), Project2Activity.class);
				startActivityForResult(pindah2, 0);
			}
		});
		pjct3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah3 = new Intent(arg0.getContext(), Project3Activity.class);
				startActivityForResult(pindah3, 0);
			}
		});
		pjct4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah4 = new Intent(arg0.getContext(), Project4Activity.class);
				startActivityForResult(pindah4, 0);
			}
		});
		pjct5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah5 = new Intent(arg0.getContext(), Project5Activity.class);
				startActivityForResult(pindah5, 0);
			}
		});
		pjct6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah6 = new Intent(arg0.getContext(), Project6Activity.class);
				startActivityForResult(pindah6, 0);
			}
		});
		pjct7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah7 = new Intent(arg0.getContext(), Project7Activity.class);
				startActivityForResult(pindah7, 0);
			}
		});
		pjct8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah8 = new Intent(arg0.getContext(), Project8Activity.class);
				startActivityForResult(pindah8, 0);
			}
		});
		pjct9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah9 = new Intent(arg0.getContext(), Project9Activity.class);
				startActivityForResult(pindah9, 0);
			}
		});
		pjct10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah10 = new Intent(arg0.getContext(), Project10Activity.class);
				startActivityForResult(pindah10, 0);
			}
		});
		pjct11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah11 = new Intent(arg0.getContext(), Project10Activity.class);
				startActivityForResult(pindah11, 0);
			}
		});		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity__home_2, menu);
		return true;
	}

}
