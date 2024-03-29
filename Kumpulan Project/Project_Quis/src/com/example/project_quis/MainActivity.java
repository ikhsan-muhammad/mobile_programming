package com.example.project_quis;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txt_hasil;
	Button btn_proses;
	EditText edit_tgl;
	EditText edit_nama;
	EditText edit_tujuan;
	EditText edit_paket;
	EditText edit_jenis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt_hasil = (TextView)findViewById(R.id.txt_hasil);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		edit_tgl = (EditText)findViewById(R.id.edit_tgl);
		edit_nama = (EditText)findViewById(R.id.edit_nama);
		edit_tujuan = (EditText)findViewById(R.id.edit_tujuan);
		edit_paket = (EditText)findViewById(R.id.edit_paket);
		edit_jenis = (EditText)findViewById(R.id.edit_jenis);
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String 	   data_tgl = null,
						   data_nama = null,
						   data_tujuan = null,
						   data_paket = null,
						   data_jenis = null;
				
				int data_harga = 0;
				
				data_paket = String.valueOf(edit_paket.getText());
				data_jenis = String.valueOf(edit_jenis.getText());
				data_nama = String.valueOf(edit_nama.getText());
				data_tgl = String.valueOf(edit_tgl.getText());
				data_tujuan = String.valueOf(edit_tujuan.getText());
				
				if (("normal".equalsIgnoreCase(data_paket))&&("documen".equalsIgnoreCase(data_jenis))){
					data_harga = 15000;
				}else if (("exspress".equalsIgnoreCase(data_paket))&&("documen".equalsIgnoreCase(data_jenis))){
					data_harga = 20000;
				}else if (("normal".equalsIgnoreCase(data_paket))&&("bingkisan".equalsIgnoreCase(data_jenis))){
					data_harga = 20000;
				}else if (("exspress".equalsIgnoreCase(data_paket))&&("bingkisan".equalsIgnoreCase(data_jenis))){
					data_harga = 25000;
				}else {
					data_harga = 0;				
				}
				
		 txt_hasil.setText("===========================" + "\n" + 
						 "       Keterangan Hasil    " + "\n" +
						 "===========================" + "\n" +
						 "Tanggal      : " + data_tgl + "\n" +
						 "Nama     : " + data_nama + "\n" +
						 "Tujuan      : " + data_tujuan + "\n" +
						 "Paket : " + data_paket + "\n" +
						 "Jenis     : " + data_jenis + "\n" +
						 "Harga     : " + data_harga + "\n" +
						 "==========================");
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
