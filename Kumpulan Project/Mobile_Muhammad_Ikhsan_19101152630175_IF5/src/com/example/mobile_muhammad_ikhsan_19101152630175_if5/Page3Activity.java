package com.example.mobile_muhammad_ikhsan_19101152630175_if5;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page3Activity extends Activity {
TextView txt_hasil;
Button btn_back;
//1. buka gerbang intent yang sama dari pengirim
	Intent pindah = new Intent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page3);
		txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		
		// Berikan Konfirmasi Penerimaan data (Alert Dialog)
		AlertDialog.Builder konfirmasi = new AlertDialog.Builder(Page3Activity.this);
		konfirmasi.setTitle("Validasi Entry Data");
		konfirmasi.setMessage("Data Sukses Entry");
		konfirmasi.setNegativeButton("Oke", null);
		konfirmasi.show();
		
		//tampung Data Dari Pengirim Dengan Menyiapkan Variable Penerima
		pindah = getIntent();
		
		//Ciptakan Variable Penerima
		String  Penerima_Data_1 = null,
				Penerima_Data_2 = null,
				Penerima_Data_3 = null,
				Penerima_Data_4 = null,
				Penerima_Data_5=null;
				
		
		// ambil data dari pengirim
		Penerima_Data_1 = pindah.getStringExtra("data_pilihan");
		Penerima_Data_2 = pindah.getStringExtra("data_noreg");
		Penerima_Data_3 = pindah.getStringExtra("data_sp");
		Penerima_Data_4 = pindah.getStringExtra("data_nama");
		Penerima_Data_5 = pindah.getStringExtra("data_lama");
		txt_hasil.setText("      Data Jawaban     " + "\n" + 
				  "=========================" + "\n" + 
				  "No registrasi : " + Penerima_Data_1 + "\n" +
				  "tipe pengunjung : " + Penerima_Data_2 + "\n" +
				  "nama pengunjung : " + Penerima_Data_3 + "\n" +
				  "aktivitas pengunjung : " + Penerima_Data_4 + "\n" +
				  "lama pengunjung : " + Penerima_Data_5 + "\n" +
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
		getMenuInflater().inflate(R.menu.page3, menu);
		return true;
	}

}
