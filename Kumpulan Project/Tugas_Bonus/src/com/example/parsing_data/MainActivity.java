package com.example.parsing_data;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText edit_bp;
Button btn_proses;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edit_bp = (EditText)findViewById(R.id.edit_bp);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//layout pengirim
				//1. buatkan intent
					Intent pindah = new Intent(getApplicationContext(),Activity_Data.class);
				//2. Ciptakan Variable Pengirim
					pindah.putExtra("data_nobp", edit_bp.getText().toString());
					startActivityForResult(pindah, 1);
					edit_bp.setText("");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
