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

public class Tugas9_1Activity extends Activity {
	TextView txt_datasapi2;
	Button btn_InputDataLagi;
	// 1. buka gerbang intent yang sama dari pengirim
	Intent pindah = new Intent(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas9_1);
		
		txt_datasapi2 = (TextView)findViewById(R.id.txt_datasapi2);
		btn_InputDataLagi = (Button)findViewById(R.id.btn_InputDataLagi);
		
		// Berikan Konfirmasi Penerimaan data (Alert Dialog)
		AlertDialog.Builder konfirmasi = new AlertDialog.Builder(Tugas9_1Activity.this);
		konfirmasi.setTitle("Validasi Entry Data");
		konfirmasi.setMessage("Data Sukses Entry");
		konfirmasi.setNegativeButton("Oke", null);
		konfirmasi.show();
		
		//tampung Data Dari Pengirim Dengan Menyiapkan Variable Penerima
				pindah = getIntent();
		
		String data_jenis = null,
		   data_jk = null,
		   data_usia = null,
		   data_warna = null,
		   data_status = null,
		   penerima_data_kode = null,
		   penerima_data_jenkar = null,
		   penerima_data_syarats = null,
		   penerima_data_pemotong = null;
		int penerima_data_berat = 0;
		
		// ambil data dari pengirim
		penerima_data_kode = pindah.getStringExtra("data_kode");
		penerima_data_jenkar = pindah.getStringExtra("data_jenkar");
		penerima_data_syarats = pindah.getStringExtra("data_syarat");
		penerima_data_pemotong = pindah.getStringExtra("data_pemotong");
		penerima_data_berat = pindah.getIntExtra("data_berat", 0);
	
	//if cabang
	if ("SP01".equalsIgnoreCase(penerima_data_kode)) {
		data_jenis = "Sapi Limosin";
		data_usia = "4 Tahun";
		data_jk = "Jantan";
		data_warna = "Putih";
	}else if ("SP02".equalsIgnoreCase(penerima_data_kode)){
		data_jenis = "Sapi Simental";
		data_usia = "6 Tahun";
		data_jk = "Betina";
		data_warna = "Merah";
	}else if ("SP03".equalsIgnoreCase(penerima_data_kode)){
		data_jenis = "Sapi Madura";
		data_usia = "5 Tahun";
		data_jk = "Jantan";
		data_warna = "Hitam";
	}else if ("SP04".equalsIgnoreCase(penerima_data_kode)){
		data_jenis = "Sapi Brahman";
		data_usia = "3 Tahun";
		data_jk = "betina";
		data_warna = "belang 2";
	}else{
		data_jenis = "---";
		data_usia = "---";
		data_jk = "---";
		data_warna = "---";
	}
	
	
	//if tunggal
	if (penerima_data_berat>=200) {
		data_status = "Siap Potong";
	}else {
		data_status = "Belum siap Potong";
	}
	
	
	txt_datasapi2.setText("===========================" + "\n" + 
			 "       Keterangan Sapi     " + "\n" +
			 "===========================" + "\n" +
			 "Kode      : " + penerima_data_kode + "\n" +
			 "Jenis     : " + data_jenis + "\n" +
			 "Usia      : " + data_usia + "\n" +
			 "Jenis Kel : " + data_jk + "\n" +
			 "Warna     : " + data_warna + "\n" +
			 "Berat     : " + penerima_data_berat + "\n" +
			 "Jenis potongan karkas :\n" + penerima_data_jenkar + "\n" +
			 "Persyaratan yang Terpenuhi yaitu :\n" + penerima_data_syarats + "\n" +
			 "Status    : " + data_status + "\n" +
			 "Pemotong  : " + penerima_data_pemotong + "\n" +
			 "==========================");
	
		btn_InputDataLagi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent perpindahan = new Intent(arg0.getContext(), Tugas9Activity.class);
				startActivityForResult(perpindahan, 0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas9_1, menu);
		return true;
	}

}
