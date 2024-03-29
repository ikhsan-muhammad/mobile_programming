package com.example.splashscreen;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Project8Activity extends Activity {
	Spinner sp;
	Button btn_proses;
	TextView txt_hasil;
	String pilihan_sp = null;
	String keterangan = null;
	
	//1. membuat isian dari spinner
//	String [] daftar_jurusan = {"Sistem Informasi",
//								"Sistem Komputer",
//								"Teknik Informatika",
//								"Manajemen Informatika"};
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project8);
		isi_spinner_jurusan();
		
		btn_proses = (Button)findViewById(R.id.btn_proses);
		txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// buatkan spinner bayangan
				Spinner sp_jurusan = (Spinner)findViewById(R.id.sp);
				pilihan_sp = String.valueOf(sp_jurusan.getSelectedItem());
				
				if (pilihan_sp.equalsIgnoreCase("Sistem Informasi")) {
					keterangan = "S1";
				}if (pilihan_sp.equalsIgnoreCase("Sistem Komputer")) {
					keterangan = "S1";
				}if (pilihan_sp.equalsIgnoreCase("Teknik Informatika")) {
					keterangan = "S1";
				}if (pilihan_sp.equalsIgnoreCase("Manajemen Informatika")) {
					keterangan = "S1";
				}
				
				AlertDialog.Builder validasi = new AlertDialog.Builder(Project8Activity.this);
				validasi.setTitle("Validasi Pilihan Spinner");
				validasi.setMessage("Apakah Anda Memilih Jurusan " + pilihan_sp);
				validasi.setNeutralButton("YA", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				//hasil alert dialog setelah di klik
				//tambahkan textview
				txt_hasil.setText("Pilhan :" + pilihan_sp);
			}
		});
				validasi.show();
			}
		});		
	}

	private void isi_spinner_jurusan() {
		// TODO Auto-generated method stub
		sp = (Spinner)findViewById(R.id.sp);
		List<String> list_jawaban_sp = new ArrayList<String>();
		list_jawaban_sp.add("Sistem Informasi");
		list_jawaban_sp.add("Sistem Komputer");
		list_jawaban_sp.add("Teknik Informatika");
		list_jawaban_sp.add("Manajemen Informatika");
		
		ArrayAdapter<String> daftar_jawaban_sp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_jawaban_sp);
		
		daftar_jawaban_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp .setAdapter(daftar_jawaban_sp);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Project8Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah2 = new Intent(Project8Activity.this, General.class);
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
		getMenuInflater().inflate(R.menu.project8, menu);
		return true;
	}

}
