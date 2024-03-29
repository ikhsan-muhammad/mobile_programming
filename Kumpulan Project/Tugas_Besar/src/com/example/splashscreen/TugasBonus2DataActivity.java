package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TugasBonus2DataActivity extends Activity {
	TextView txt_hasil;
	Button btn_back;
	// 1. buka gerbang intent yang sama dari pengirim
	Intent pindah = new Intent(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas_bonus2_data);
txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		
		// Berikan Konfirmasi Penerimaan data (Alert Dialog)
		AlertDialog.Builder konfirmasi = new AlertDialog.Builder(TugasBonus2DataActivity.this);
		konfirmasi.setTitle("Validasi Entry Data");
		konfirmasi.setMessage("Data Sukses Entry");
		konfirmasi.setNegativeButton("Oke", null);
		konfirmasi.show();
		
		//tampung Data Dari Pengirim Dengan Menyiapkan Variable Penerima
		pindah = getIntent();
		
		//Ciptakan Variable Penerima
		String Penerima_Data_Nobp = null,
		data_nama = null,
			   Fakultas = null,
			   jurusan = null,
			   data_Kelas = null,
			   data_Peminatan = null;
		int Penerima_Data_uas;
		int Penerima_Data_uts;
		
		// ambil data dari pengirim
		Penerima_Data_Nobp = pindah.getStringExtra("data_nobp");
		Penerima_Data_uts = pindah.getIntExtra("data_uts", 0);
		Penerima_Data_uas = pindah.getIntExtra("data_uas", 0);
		
		double pers_uts = Penerima_Data_uts*0.4;
		double pers_uas = Penerima_Data_uas*0.6;
		
		double total_nilai = pers_uts+pers_uas;
		
		if ("19101152630175".equalsIgnoreCase(Penerima_Data_Nobp)) {
			data_nama = "Muhammad Ikhsan";
			data_Kelas = "IF-5";
			Fakultas = "Ilmu Komputer";
			jurusan = "Teknik Informatika";
			data_Peminatan = "Artificiall Intelligence";
		}else if ("19101152630182".equalsIgnoreCase(Penerima_Data_Nobp)) {
			data_nama = "Repi Marisko";
			data_Kelas = "IF-1";
			Fakultas = "Ilmu Komputer";
			jurusan = "Teknik Informatika";
			data_Peminatan = "Artificiall Intelligence";
		}else if ("19101152630184".equalsIgnoreCase(Penerima_Data_Nobp)) {
			data_nama = "Roki";
			data_Kelas = "IF-3";
			Fakultas = "Ekonomi";
			jurusan = "Akuntansi";
			data_Peminatan = "Perpajakan";
		}
		
		
		// Tampilkan Data Hasil Pengiriman
		txt_hasil.setText("      Data_mahasiswa     " + "\n" + 
						  "=========================" + "\n" + 
						  "Nobp : " + Penerima_Data_Nobp + "\n" + 
						  "Nama : " + data_nama + "\n" +
						  "Kelas : " + data_Kelas + "\n" +
						  "Fakultas : " + Fakultas + "\n" +
						  "Jurusan : " + jurusan + "\n" +
						  "Peminatan : " + data_Peminatan + "\n" +
						  "Nilai UTS : " + Penerima_Data_uts + "\n" +
						  "Nilai UAS : " + Penerima_Data_uas + "\n" +
						  "Total Nilai  : " + total_nilai + "\n" +
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
		getMenuInflater().inflate(R.menu.tugas_bonus2_data, menu);
		return true;
	}

}
