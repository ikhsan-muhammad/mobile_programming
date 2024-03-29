package com.example.MuhammadIkhsan19101152630175;

import java.util.ArrayList;
import java.util.List;

import com.example.splashscreen.R;
import com.example.splashscreen.R.id;
import com.example.splashscreen.R.layout;
import com.example.splashscreen.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Tugas11_2Activity extends Activity {
	Spinner sp;
	String data_jawaban2 = null;
	String pilihan_sp = null;
	RadioGroup rg;
	RadioButton rb1,rb2,rb3;
	Button btn_sub;
	String penampung_rb = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tugas11_2);
		isi_spinner_soal();
		
		rg = (RadioGroup)findViewById(R.id.rg);
		rb1 = (RadioButton)findViewById(R.id.rb1);
		rb2 = (RadioButton)findViewById(R.id.rb2);
		rb3 = (RadioButton)findViewById(R.id.rb3);
		btn_sub = (Button)findViewById(R.id.btn_sub);
		btn_sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pilihan_rb = null;
				
				if (rb1.isChecked()) {
					pilihan_rb = "Benar";
				}
				if (rb2.isChecked()) {
					pilihan_rb = "salah";
				}
				if (rb3.isChecked()) {
					pilihan_rb = "salah";
				}
				
				Spinner sp_jurusan = (Spinner)findViewById(R.id.sp);
				pilihan_sp = String.valueOf(sp_jurusan.getSelectedItem());
				
				if (pilihan_sp.equalsIgnoreCase("JAVA")) {
					data_jawaban2 = "Benar";
				}else {
					data_jawaban2 = "Salah";
				}
				
				//layout pengirim
				//1. buatkan intent
					Intent pindah = new Intent(getApplicationContext(),Tugas11_2Activity.class);
				//2. Ciptakan Variable Pengirim
					
					pindah.putExtra("data_uts", pilihan_rb);
					pindah.putExtra("data_uas", data_jawaban2);
					startActivityForResult(pindah, 1);
			}
		});
	}
	
	private void isi_spinner_soal() {
		// TODO Auto-generated method stub
		sp = (Spinner)findViewById(R.id.sp);
		List<String> list_jawaban_sp = new ArrayList<String>();
		list_jawaban_sp.add("PHP");
		list_jawaban_sp.add("JAVA");
		list_jawaban_sp.add("JAVASCRIPT");
		list_jawaban_sp.add("C");
		
		ArrayAdapter<String> daftar_jawaban_sp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_jawaban_sp);
		
		daftar_jawaban_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp .setAdapter(daftar_jawaban_sp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tugas11_2, menu);
		return true;
	}

}
