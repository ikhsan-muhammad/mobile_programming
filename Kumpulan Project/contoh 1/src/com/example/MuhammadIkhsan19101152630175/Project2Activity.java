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

public class Project2Activity extends Activity {
	// perkenalkan id dari komponen
		TextView txt_nama;
		Button btn_proses;
		EditText edit_nama;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project2);
		 // deklarasikan setiap ID yang telah diperkenalkan
        txt_nama = (TextView)findViewById(R.id.txt_nama);
        btn_proses = (Button)findViewById(R.id.btn_proses);
        edit_nama = (EditText)findViewById(R.id.edit_nama);        
        
        //aktifkan button
        btn_proses.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View arg0) {
				//siapkan tipe data string untuk menampung data 
				String data_nama = null;
				// buantkan perintah tampung data 
				data_nama = String.valueOf(edit_nama.getText());
				
				// perintah settext terhadap textView
				txt_nama.setText("Nama Saya: " + data_nama);
				edit_nama.setText("");
			}
		});
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
		AlertDialog.Builder validasi_radio = new AlertDialog.Builder(Project2Activity.this);
		validasi_radio.setTitle("Home Validation");
		validasi_radio.setMessage("Kembali ke Menu Home");
		validasi_radio.setPositiveButton("Home", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent pindah2 = new Intent(Project2Activity.this, General.class);
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
		getMenuInflater().inflate(R.menu.project2, menu);
		return true;
	}

}
