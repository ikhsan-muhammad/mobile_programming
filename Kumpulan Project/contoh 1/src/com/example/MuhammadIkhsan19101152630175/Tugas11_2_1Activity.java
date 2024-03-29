package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;
import com.example.splashscreen.R.id;
import com.example.splashscreen.R.layout;
import com.example.splashscreen.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tugas11_2_1Activity extends Activity {
	TextView txt_hasil;
	Button btn_back;
	// 1. buka gerbang intent yang sama dari pengirim
	Intent pindah = new Intent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas11_2_1);
txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		
		// Berikan Konfirmasi Penerimaan data (Alert Dialog)
		AlertDialog.Builder konfirmasi = new AlertDialog.Builder(Tugas11_2_1Activity.this);
		konfirmasi.setTitle("Validasi Entry Data");
		konfirmasi.setMessage("Data Sukses Entry");
		konfirmasi.setNegativeButton("Oke", null);
		konfirmasi.show();
		
		//tampung Data Dari Pengirim Dengan Menyiapkan Variable Penerima
		pindah = getIntent();
		
		//Ciptakan Variable Penerima
		String Penerima_Data_1 = null,
				Penerima_Data_2 = null;
		
		// ambil data dari pengirim
		Penerima_Data_1 = pindah.getStringExtra("data_uts");
		Penerima_Data_2 = pindah.getStringExtra("data_uas");
		txt_hasil.setText("      Data Jawaban     " + "\n" + 
				  "=========================" + "\n" + 
				  "No 1 : " + Penerima_Data_1 + "\n" +
				  "No 2 : " + Penerima_Data_2 + "\n" +
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
		getMenuInflater().inflate(R.menu.tugas11_2_1, menu);
		return true;
	}

}
