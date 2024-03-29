package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TugasBonusActivity extends Activity {
	EditText edit_bp;
	Button btn_proses;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas_bonus);
		edit_bp = (EditText)findViewById(R.id.edit_bp);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//layout pengirim
				//1. buatkan intent
					Intent pindah = new Intent(getApplicationContext(),TugasBonusDataActivity.class);
				//2. Ciptakan Variable Pengirim
					pindah.putExtra("data_nobp", edit_bp.getText().toString());
					startActivityForResult(pindah, 1);
					edit_bp.setText("");
			}
		});
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(TugasBonusActivity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah2 = new Intent(TugasBonusActivity.this, General.class);
				startActivity(pindah2);
				this.finish();
			}
			private void finish() {
				System.exit(1);
			}
		});
		validasi_radio.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
		});
		validasi_radio.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas_bonus, menu);
		return true;
	}

}
