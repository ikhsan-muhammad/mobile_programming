package com.example.parsing_data;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText edit_bp,edit_uts,edit_uas;
Button btn_proses;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edit_bp = (EditText)findViewById(R.id.edit_bp);
		edit_uts = (EditText)findViewById(R.id.edit_uts);
		edit_uas = (EditText)findViewById(R.id.edit_uas);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//layout pengirim
				//1. buatkan intent
					Intent pindah = new Intent(getApplicationContext(),Activity_Data.class);
				//2. Ciptakan Variable Pengirim
					int data_uask,data_utsk;
					data_uask = Integer.parseInt(edit_uas.getText().toString());
					data_utsk = Integer.parseInt(edit_uts.getText().toString());
					
					pindah.putExtra("data_nobp", edit_bp.getText().toString());
					pindah.putExtra("data_uts", data_utsk);
					pindah.putExtra("data_uas", data_uask);
					startActivityForResult(pindah, 1);
					edit_bp.setText("");
					edit_uts.setText("");
					edit_uas.setText("");
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
