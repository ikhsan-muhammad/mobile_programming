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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Tugas6Activity extends Activity {
	RadioGroup rg;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	Button cek1,cek2,btn_proses;
	EditText edit_kode,edit_berat;
	TextView txt_hasil;
	StringBuilder syarat;
	ListView ls;
	
	Spinner sp;
	String pilihan_sp = null;
	
	String[] jenis_karkas = {"Karkas Amerika Serikat(Rusuk 12/13)",
							 "Karkas Eropa(Rusuk 8/9)",
							 "Karkas Australia(Rusuk 10/11)",
							 "Karkas Indonesia(Rusuk 5/6)"};
	
	//Penampung variable lokal atau variabel global
	String penampung_rb = null;
	String jk = null;
	String data_pemotong = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas6);
		isi_spinner_hari();
		
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
		ls = (ListView)findViewById(R.id.ls); 
		//tahap 2 list view
		ArrayAdapter<String>atur_list = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1,jenis_karkas);
		ls.setAdapter(atur_list);
		
		cek1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Spinner sp_jurusan = (Spinner)findViewById(R.id.sp);
				pilihan_sp = String.valueOf(sp_jurusan.getSelectedItem());
				
				if (pilihan_sp.equalsIgnoreCase("Senin")) {
					data_pemotong = "Bapak Marsini";
				}if (pilihan_sp.equalsIgnoreCase("Rabu")) {
					data_pemotong = "Bapak Very";
				}if (pilihan_sp.equalsIgnoreCase("Kamis")) {
					data_pemotong = "Bapak Nino";
				}if (pilihan_sp.equalsIgnoreCase("Sabtu")) {
					data_pemotong = "Bapak zine";
				}
				
				
				// menampilkan form validasi pilihan radio
				AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas6Activity.this);
				validasi_radio.setTitle("Hari Pemotongan");
				validasi_radio.setMessage("Hari Pemotongan yang Dipilih adalah Hari " + pilihan_sp + " " + data_pemotong);
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
				AlertDialog.Builder validasi_cek = new AlertDialog.Builder(Tugas6Activity.this);
				validasi_cek.setTitle("Persyaratan");
				validasi_cek.setMessage("Persyaratan yang Terpenuhi yaitu :\n" + syarat);
				validasi_cek.setNeutralButton("OKE", null);
				validasi_cek.show();
				
			}
		});
		
		ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				String pilihan_list = null;
				pilihan_list = String.valueOf(jenis_karkas[position]);
				jk = pilihan_list;
				AlertDialog.Builder hasil_pilihan = new AlertDialog.Builder(Tugas6Activity.this);
				hasil_pilihan.setTitle("Validasi pilihan jenis potong karkas");
				hasil_pilihan.setMessage("Apakah Anda Yakin Memilih Jenis pemotongan " + pilihan_list);
				hasil_pilihan.setNegativeButton("OKE", null);
				hasil_pilihan.show();
				
			}
		});
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
								
				String data_jenis = null,
						   data_kode = null,
						   data_jk = null,
						   data_usia = null,
						   data_warna = null,
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
					
					//Menjadikan variable global ke lokal kembali
					String jk2 = null;
					jk2 = String.valueOf(jk);
					
					
					//if tunggal
					data_berat = Integer.parseInt(edit_berat.getText().toString());
					if (data_berat>=200) {
						data_status = "Siap Potong";
					}else {
						data_status = "Belum siap Potong";
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
							 "Jenis potongan karkas :\n" + jk2 + "\n" +
							 "Persyaratan yang Terpenuhi yaitu :\n" + syarat + "\n" +
							 "Status    : " + data_status + "\n" +
							 "Pemotong  : " + data_pemotong + "\n" +
							 "==========================");
					edit_kode.setText("");
					edit_berat.setText("");
			}
		});
	}

	private void isi_spinner_hari() {
		// TODO Auto-generated method stub
		sp = (Spinner)findViewById(R.id.sp);
		List<String> list_jawaban_sp = new ArrayList<String>();
		list_jawaban_sp.add("Senin");
		list_jawaban_sp.add("Rabu");
		list_jawaban_sp.add("Kamis");
		list_jawaban_sp.add("Sabtu");
		
		ArrayAdapter<String> daftar_jawaban_sp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_jawaban_sp);
		
		daftar_jawaban_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp .setAdapter(daftar_jawaban_sp);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Tugas6Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah6 = new Intent(Tugas6Activity.this, General.class);
				startActivity(pindah6);
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
		getMenuInflater().inflate(R.menu.tugas6, menu);
		return true;
	}

}
