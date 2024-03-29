package com.example.project_8;

import android.R.string;
import android.location.Address;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView ls;
	Button btn_proses;
	
	//1. memberikan isi terhadap list
	String [] daftar_jurusan = {"Sistem Informasi",
								"Sistem Komputer",
								"Manajemen Informatika",
								"Teknik Informatika"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ls = (ListView)findViewById(R.id.ls);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		
		//2. setting ArrayAdapter untuk tampilan list
		ArrayAdapter<String>atur_list = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,daftar_jurusan);
		ls.setAdapter(atur_list);
		
		//3. aktifkan list untuk di klik
		ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				String pilihan_list = null;
				pilihan_list = String.valueOf(daftar_jurusan[position]);
				
				AlertDialog.Builder hasil_pilihan = new AlertDialog.Builder(MainActivity.this);
				hasil_pilihan.setTitle("Validasi pilihan Jurusan");
				hasil_pilihan.setMessage("Apakah Anda Yakin Memilih Jurusan " + pilihan_list);
				hasil_pilihan.setNegativeButton("OKE", null);
				hasil_pilihan.show();
			}
		});
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// tugas 6 tambahkan List di dalamnya...
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
