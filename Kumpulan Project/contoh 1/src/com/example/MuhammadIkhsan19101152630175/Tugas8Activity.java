package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Tugas8Activity extends Activity {
Button btn_lanjutkan;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas8);
		btn_lanjutkan = (Button)findViewById(R.id.btn_lanjutkan);
		btn_lanjutkan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent perpindahan = new Intent(arg0.getContext(), Tugas8_1Activity.class);
				startActivityForResult(perpindahan, 0);
			}
		});
	}
	@Override
	public void onBackPressed() {
			// TODO Auto-generated method stub
//			super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas8Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Lanjut Melihat Tugas 8");
		validasi_radio.setPositiveButton("Back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah8 = new Intent(Tugas8Activity.this, General.class);
				startActivity(pindah8);
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
		getMenuInflater().inflate(R.menu.tugas8, menu);
		return true;
	}

}
