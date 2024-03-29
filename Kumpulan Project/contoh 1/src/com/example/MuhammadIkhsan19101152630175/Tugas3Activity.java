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
import android.widget.EditText;
import android.widget.TextView;

public class Tugas3Activity extends Activity {

	TextView txt_ket;
	Button btn_proses;
	EditText edit_kode;
	EditText edit_berat;
	EditText edit_tanggal;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas3);
		txt_ket = (TextView)findViewById(R.id.txt_ket);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		edit_kode = (EditText)findViewById(R.id.edit_kode);
		edit_berat = (EditText)findViewById(R.id.edit_berat);
		edit_tanggal = (EditText)findViewById(R.id.edit_tanggal);
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data_jenis = null,
					   data_kode = null,
					   data_jk = null,
					   data_usia = null,
					   data_warna = null,
					   data_pemotong = null,
					   data_status = null,
					   data_kondisi = null;
				
				int data_berat = 0 ;
				int data_tanggal = 0;
				
				//if cabang
				data_kode = String.valueOf(edit_kode.getText());
				if ("SP01".equalsIgnoreCase(data_kode)) {
					data_jenis = "Sapi Limosin";
					data_usia = "4 Tahun";
					data_jk = "Jantan";
					data_warna = "Putih";
					data_kondisi = "Sehat";
				}else if ("SP02".equalsIgnoreCase(data_kode)){
					data_jenis = "Sapi Simental";
					data_usia = "6 Tahun";
					data_jk = "Betina";
					data_warna = "Merah";
					data_kondisi = "Mandul";
				}else{
					txt_ket.setText("Data Tidak Ditemukan !!");
				}
				
				//if tunggal
				data_berat = Integer.parseInt(edit_berat.getText().toString());
				if (data_berat>=200) {
					data_status = "Siap Potong";
				}else {
					data_status = "Belum siap Potong";
				}
				
				//if majemuk
				data_tanggal = Integer.parseInt(edit_tanggal.getText().toString());
				if ((data_tanggal>=1)&&(data_tanggal<=10)) {
					data_pemotong = "Bapak Marsini";
				}else if ((data_tanggal>=11)&&(data_tanggal<=20)) {
					data_pemotong = "Bapak Very";
				}else if ((data_tanggal>=21)&&(data_tanggal<=31)) {
					data_pemotong = "Bapak Very";
				}else {
					data_pemotong = "Silahkan Pilih tanggal Dari 1-31";
				}
				
		 txt_ket.setText("===========================" + "\n" + 
						 "       Keterangan Sapi     " + "\n" +
						 "===========================" + "\n" +
						 "Kode      : " + data_kode + "\n" +
						 "Jenis     : " + data_jenis + "\n" +
						 "Usia      : " + data_usia + "\n" +
						 "Jenis Kel : " + data_jk + "\n" +
						 "Warna     : " + data_warna + "\n" +
						 "Kondisi   : " + data_kondisi + "\n" +
						 "Berat     : " + data_berat + "\n" +
						 "Status    : " + data_status + "\n" +
						 "Pemotong  : " + data_pemotong + "\n" +
						 "==========================");
				edit_kode.setText("");
				edit_berat.setText("");
				edit_tanggal.setText("");
				
			}
		});		
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas3Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah3 = new Intent(Tugas3Activity.this, General.class);
				startActivity(pindah3);
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
		getMenuInflater().inflate(R.menu.tugas3, menu);
		return true;
	}

}
