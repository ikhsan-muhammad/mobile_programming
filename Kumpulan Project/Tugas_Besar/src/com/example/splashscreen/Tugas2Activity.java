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
import android.widget.TextView;

public class Tugas2Activity extends Activity {
	TextView txt_undangan;
	Button btn_proses;
	EditText edit_nama;
	EditText edit_hari;
	EditText edit_tanggal;
	EditText edit_tempat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas2);
		txt_undangan = (TextView)findViewById(R.id.txt_undangan);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		edit_nama = (EditText)findViewById(R.id.edit_nama);
		edit_hari = (EditText)findViewById(R.id.edit_hari);
		edit_tanggal = (EditText)findViewById(R.id.edit_tanggal);
		edit_tempat = (EditText)findViewById(R.id.edit_tempat);
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data_nama = null;
				String data_hari = null;
				String data_tanggal = null;
				String data_tempat = null;
				
				data_nama = String.valueOf(edit_nama.getText());
				data_hari = String.valueOf(edit_hari.getText());
				data_tanggal = String.valueOf(edit_tanggal.getText());
				data_tempat = String.valueOf(edit_tempat.getText());
				
				txt_undangan.setText("Dengan ini kami mengundang Bapak/Ibu " + data_nama + " pada pernikahan Fulan dan Fulin pada hari " + data_hari +" tanggal " + data_tanggal +" bertempat di " + data_tempat);
				edit_nama.setText("");
				edit_hari.setText("");
				edit_tanggal.setText("");
				edit_tempat.setText("");
			}
		});
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas2Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah2 = new Intent(Tugas2Activity.this, General.class);
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
		getMenuInflater().inflate(R.menu.tugas2, menu);
		return true;
	}

}
