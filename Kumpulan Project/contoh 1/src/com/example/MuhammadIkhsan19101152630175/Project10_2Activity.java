package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Project10_2Activity extends Activity {
	TextView txt_hasil;
	Button btn_back;
	// 1. buka gerbang intent yang sama dari pengirim
	Intent pindah = new Intent(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project10_2);
txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		
		// Berikan Konfirmasi Penerimaan dta (Alert Dialog)
		AlertDialog.Builder konfirmasi = new AlertDialog.Builder(Project10_2Activity.this);
		konfirmasi.setTitle("Validasi Entry Data");
		konfirmasi.setMessage("Data Sukses Entry");
		konfirmasi.setNegativeButton("Oke", null);
		konfirmasi.show();
		
		//tampung Data Dari Pengirim Dengan Menyiapkan Variable Penerima
		pindah = getIntent();
		
		//Ciptakan Variable Penerima
		String Penerima_Data_Nobp = null,
			   Penerima_Data_Nama = null;
		
		// ambil data dari pengirim
		Penerima_Data_Nobp = pindah.getStringExtra("data_nobp");
		Penerima_Data_Nama = pindah.getStringExtra("data_nama");
		
		// Tampilkan Data Hasil Pengiriman
		txt_hasil.setText("      Data_mahasiswa     " + "\n" + 
						  "=========================" + "\n" + 
						  "Nobp : " + Penerima_Data_Nobp + "\n" + 
						  "Nama : " + Penerima_Data_Nama + "\n" + 
						  "=========================");
		
		
		btn_back = (Button)findViewById(R.id.btn_back);
		btn_back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				setResult(RESULT_OK, pindah);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.project10_2, menu);
		return true;
	}

}
