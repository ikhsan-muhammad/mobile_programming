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
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Project6Activity extends Activity {
	
	RadioGroup rg;
	RadioButton rd_1,rd_2,rd_3,rd_4;
	CheckBox cb_mp,cb_gk, cb_wd, cb_ip;
	Button btn_cek1, btn_cek2, btn_lihat;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project6);

		rg = (RadioGroup)findViewById(R.id.rg);
		rd_1 = (RadioButton)findViewById(R.id.rd_1);
		rd_2 = (RadioButton)findViewById(R.id.rd_2);
		rd_3 = (RadioButton)findViewById(R.id.rd_3);
		rd_4 = (RadioButton)findViewById(R.id.rd_4);
		cb_mp = (CheckBox)findViewById(R.id.cb_mp);
		cb_gk = (CheckBox)findViewById(R.id.cb_gk);
		cb_wd = (CheckBox)findViewById(R.id.cb_wd);
		cb_ip = (CheckBox)findViewById(R.id.cb_ip);
		btn_cek1 = (Button)findViewById(R.id.btn_cek1);
		btn_cek2 = (Button)findViewById(R.id.btn_cek2);
		btn_lihat = (Button)findViewById(R.id.btn_lihat);
		
		btn_cek1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pilihan_rd = null;
				
				if (rd_1.isChecked()) {
					pilihan_rd = rd_1.getText().toString();
				}
				if (rd_2.isChecked()) {
					pilihan_rd = rd_2.getText().toString();
				}
				if (rd_3.isChecked()) {
					pilihan_rd = rd_3.getText().toString();
				}
				if (rd_4.isChecked()) {
					pilihan_rd = rd_4.getText().toString();
				}
				// menampilkan form validasi pilihan radio
				AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Project6Activity.this);
				validasi_radio.setTitle("Pilihan Jurusan");
				validasi_radio.setMessage("Jurusan yang Dipilih adalah " + pilihan_rd);
				validasi_radio.setNeutralButton("OKE", null);
				validasi_radio.show();
			}
		});
		
		
		btn_cek2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pilihan_cb = null;
				
				if (cb_mp.isChecked()) {
					pilihan_cb = cb_mp.getText().toString()+ ",";
				}
				if (cb_gk.isChecked()) {
					pilihan_cb = cb_gk.getText().toString()+ ",";
				}
				if (cb_wd.isChecked()) {
					pilihan_cb = cb_wd.getText().toString()+ ",";
				}
				if (cb_ip.isChecked()) {
					pilihan_cb = cb_ip.getText().toString()+ ",";
				}
				// menampilkan form validasi pilihan radio
				AlertDialog.Builder validasi_cek = new AlertDialog.Builder(Project6Activity.this);
				validasi_cek.setTitle("Pilihan Matakuliah");
				validasi_cek.setMessage("Matakuliah yang Dipilih adalah " + pilihan_cb);
				validasi_cek.setNeutralButton("OKE", null);
				validasi_cek.show();
			}
		});
//		btn_lihat
	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Project6Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah2 = new Intent(Project6Activity.this, General.class);
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
		getMenuInflater().inflate(R.menu.project6, menu);
		return true;
	}

}
