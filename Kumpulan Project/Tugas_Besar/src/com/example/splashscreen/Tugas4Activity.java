package com.example.splashscreen;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tugas4Activity extends Activity {
	RadioGroup rg;
	RadioButton rb1,rb2,rb3,rb4;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	Button cek1,cek2,btn_proses;
	EditText edit_kode,edit_berat;
	TextView txt_hasil;
	StringBuilder syarat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas4);
		rg = (RadioGroup)findViewById(R.id.rg);
		rb1 = (RadioButton)findViewById(R.id.rb1);
		rb2 = (RadioButton)findViewById(R.id.rb2);
		rb3 = (RadioButton)findViewById(R.id.rb3);
		rb4 = (RadioButton)findViewById(R.id.rb4);
		cb1 = (CheckBox)findViewById(R.id.cb1);
		cb2 = (CheckBox)findViewById(R.id.cb2);
		cb3 = (CheckBox)findViewById(R.id.cb3);
		cb4 = (CheckBox)findViewById(R.id.cb4);
		cb5 = (CheckBox)findViewById(R.id.cb5);
		cb6 = (CheckBox)findViewById(R.id.cb6);
		cek1 = (Button)findViewById(R.id.cek1);
		cek2 = (Button)findViewById(R.id.cek2);
		edit_kode = (EditText)findViewById(R.id.edit_kode);
		edit_berat = (EditText)findViewById(R.id.edit_berat);
		txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		
		cek1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String pilihan_rb = null;
				
				if (rb1.isChecked()) {
					pilihan_rb = rb1.getText().toString();
				}
				if (rb2.isChecked()) {
					pilihan_rb = rb2.getText().toString();
				}
				if (rb3.isChecked()) {
					pilihan_rb = rb3.getText().toString();
				}
				if (rb4.isChecked()) {
					pilihan_rb = rb4.getText().toString();
				}
				// menampilkan form validasi pilihan radio
				AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas4Activity.this);
				validasi_radio.setTitle("Hari Pemotongan");
				validasi_radio.setMessage("Hari Pemotongan yang Dipilih adalah Hari " + pilihan_rb);
				validasi_radio.setNeutralButton("OKE", null);
				validasi_radio.show();
				
			}
		});
		
		cek2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				syarat = new StringBuilder();
				
				if (cb1.isChecked()) {
					syarat.append("- "+cb1.getText().toString()+"\n");
				}
				if (cb2.isChecked()) {
					syarat.append("- "+cb2.getText().toString()+"\n");
				}
				if (cb3.isChecked()) {
					syarat.append("- "+cb3.getText().toString()+"\n");
				}
				if (cb4.isChecked()) {
					syarat.append("- "+cb4.getText().toString()+"\n");
				}
				if (cb5.isChecked()) {
					syarat.append("- "+cb5.getText().toString()+"\n");
				}
				if (cb6.isChecked()) {
					syarat.append("- "+cb6.getText().toString()+"\n");
				}
				// menampilkan form validasi pilihan radio
				AlertDialog.Builder validasi_cek = new AlertDialog.Builder(Tugas4Activity.this);
				validasi_cek.setTitle("Persyaratan");
				validasi_cek.setMessage("Persyaratan yang Terpenuhi yaitu :\n" + syarat);
				validasi_cek.setNeutralButton("OKE", null);
				validasi_cek.show();
				
			}
		});
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String pilihan_rb = null;
				
				if (rb1.isChecked()) {
					pilihan_rb = rb1.getText().toString();
				}
				if (rb2.isChecked()) {
					pilihan_rb = rb2.getText().toString();
				}
				if (rb3.isChecked()) {
					pilihan_rb = rb3.getText().toString();
				}
				if (rb4.isChecked()) {
					pilihan_rb = rb4.getText().toString();
				}
				
				syarat = new StringBuilder();
				
				if (cb1.isChecked()) {
					syarat.append("- "+cb1.getText().toString()+"\n");
				}
				if (cb2.isChecked()) {
					syarat.append("- "+cb2.getText().toString()+"\n");
				}
				if (cb3.isChecked()) {
					syarat.append("- "+cb3.getText().toString()+"\n");
				}
				if (cb4.isChecked()) {
					syarat.append("- "+cb4.getText().toString()+"\n");
				}
				if (cb5.isChecked()) {
					syarat.append("- "+cb5.getText().toString()+"\n");
				}
				if (cb6.isChecked()) {
					syarat.append("- "+cb6.getText().toString()+"\n");
				}
				
				String data_jenis = null,
						   data_kode = null,
						   data_jk = null,
						   data_usia = null,
						   data_warna = null,
						   data_pemotong = null,
						   data_status = null;
					
					int data_berat = 0 ;
					
					//if cabang
					data_kode = String.valueOf(edit_kode.getText());
					if ("SP01".equalsIgnoreCase(data_kode)) {
						data_jenis = "Sapi Limosin";
						data_usia = "4 Tahun";
						data_jk = "Jantan";
						data_warna = "Putih";
					}else if ("SP02".equalsIgnoreCase(data_kode)){
						data_jenis = "Sapi Simental";
						data_usia = "6 Tahun";
						data_jk = "Betina";
						data_warna = "Merah";
					}else if ("SP03".equalsIgnoreCase(data_kode)){
						data_jenis = "Sapi Madura";
						data_usia = "5 Tahun";
						data_jk = "Jantan";
						data_warna = "Hitam";
					}else if ("SP04".equalsIgnoreCase(data_kode)){
						data_jenis = "Sapi Brahman";
						data_usia = "3 Tahun";
						data_jk = "betina";
						data_warna = "belang 2";
					}else{
						txt_hasil.setText("Data Tidak Ditemukan !!");
					}
					
					//if tunggal
					data_berat = Integer.parseInt(edit_berat.getText().toString());
					if (data_berat>=200) {
						data_status = "Siap Potong";
						if (pilihan_rb.equalsIgnoreCase("Senin")) {
							data_pemotong = "Bapak Marsini";
						}else if (pilihan_rb.equalsIgnoreCase("Rabu")) {
							data_pemotong = "Bapak Very";
						}else if (pilihan_rb.equalsIgnoreCase("Kamis")) {
							data_pemotong = "Bapak Nino";
						}else {
							data_pemotong = "Bapak zine";
						}
					}else {
						data_status = "Belum siap Potong";
						data_pemotong = "----";
					}
					
					
			 txt_hasil.setText("===========================" + "\n" + 
							 "       Keterangan Sapi     " + "\n" +
							 "===========================" + "\n" +
							 "Kode      : " + data_kode + "\n" +
							 "Jenis     : " + data_jenis + "\n" +
							 "Usia      : " + data_usia + "\n" +
							 "Jenis Kel : " + data_jk + "\n" +
							 "Warna     : " + data_warna + "\n" +
							 "Berat     : " + data_berat + "\n" +
							 "Persyaratan yang Terpenuhi yaitu :\n" + syarat +
							 "Status    : " + data_status + "\n" +
							 "Pemotong  : " + data_pemotong + "\n" +
							 "==========================");
					edit_kode.setText("");
					edit_berat.setText("");
			}
		});
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas4Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah4 = new Intent(Tugas4Activity.this, General.class);
				startActivity(pindah4);
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
		getMenuInflater().inflate(R.menu.tugas4, menu);
		return true;
	}

}
