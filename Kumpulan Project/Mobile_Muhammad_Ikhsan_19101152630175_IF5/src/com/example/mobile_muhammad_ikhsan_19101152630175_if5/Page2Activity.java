package com.example.mobile_muhammad_ikhsan_19101152630175_if5;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Page2Activity extends Activity {
Button btn_simpan;
EditText edit_noreg, edit_nama, edit_lama;
Spinner sp;
RadioGroup rg;
RadioButton rb1,rb2;
String data_jawaban2 = null;
String pilihan_sp = null;
String penampung_rb = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page2);
isi_spinner_soal();
		edit_nama = (EditText)findViewById(R.id.edit_nama);
		edit_noreg = (EditText)findViewById(R.id.edit_noreg);
		edit_lama = (EditText)findViewById(R.id.edit_lama);
		rg = (RadioGroup)findViewById(R.id.rg);
		rb1 = (RadioButton)findViewById(R.id.rb1);
		rb2 = (RadioButton)findViewById(R.id.rb2);
		btn_simpan = (Button)findViewById(R.id.btn_simpan);
		btn_simpan.setOnClickListener(new View.OnClickListener() {
			
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
				
				Spinner sp_jurusan = (Spinner)findViewById(R.id.sp);
				pilihan_sp = String.valueOf(sp_jurusan.getSelectedItem());
				
				
				//layout pengirim
				//1. buatkan intent
					Intent pindah = new Intent(getApplicationContext(),Page3Activity.class);
				//2. Ciptakan Variable Pengirim
					
					pindah.putExtra("data_pilihan", pilihan_rb);
					pindah.putExtra("data_noreg", edit_noreg.getText().toString());
					pindah.putExtra("data_sp", pilihan_sp);
					pindah.putExtra("data_nama", edit_nama.getText().toString() );
					pindah.putExtra("data_lama", edit_lama.getText().toString());
					startActivityForResult(pindah, 1);
			}
		});
	}
	
	private void isi_spinner_soal() {
		// TODO Auto-generated method stub
		sp = (Spinner)findViewById(R.id.sp);
		List<String> list_jawaban_sp = new ArrayList<String>();
		list_jawaban_sp.add("umum");
		list_jawaban_sp.add("mahasiswa");
		list_jawaban_sp.add("dosen");
		
		ArrayAdapter<String> daftar_jawaban_sp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_jawaban_sp);
		
		daftar_jawaban_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp .setAdapter(daftar_jawaban_sp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page2, menu);
		return true;
	}

}
