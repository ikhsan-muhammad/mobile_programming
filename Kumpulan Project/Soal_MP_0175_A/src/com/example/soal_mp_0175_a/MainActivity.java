package com.example.soal_mp_0175_a;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {
CheckBox c1,c2,c3,c4;
Button btn_proses;
Spinner sp;
EditText edit_nma, edit_nr, edit_phone;
StringBuilder paket;

String pilihan_sp = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bank_spinner();
		
		c1 = (CheckBox)findViewById(R.id.c1);
		c2 = (CheckBox)findViewById(R.id.c2);
		c3 = (CheckBox)findViewById(R.id.c3);
		c4 = (CheckBox)findViewById(R.id.c4);
		edit_nma =(EditText)findViewById(R.id.edit_nma);
		edit_nr = (EditText)findViewById(R.id.edit_nr);
		edit_phone = (EditText)findViewById(R.id.edit_phone);
		btn_proses = (Button)findViewById(R.id.btn_proses);
		
		btn_proses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data_nr = null,
					   data_nma = null,
					   data_phone = null;
				paket = new StringBuilder();
				
				data_nr = String.valueOf(edit_nr.getText());
				data_nma = String.valueOf(edit_nma.getText());
				data_phone = String.valueOf(edit_phone.getText());
				
				if (c1.isChecked()) {
					paket.append(c1.getText().toString()+",");
				}
				if (c2.isChecked()) {
					paket.append(c2.getText().toString()+",");
				}
				if (c3.isChecked()) {
					paket.append(c3.getText().toString()+",");
				}
				if (c4.isChecked()) {
					paket.append(c4.getText().toString()+",");
				}
				
				Spinner sp_bank = (Spinner)findViewById(R.id.sp);
				pilihan_sp = String.valueOf(sp_bank.getSelectedItem());
								
				
				// Menampilkan Alert
				AlertDialog.Builder validasi_radio = new AlertDialog.Builder(MainActivity.this);
				validasi_radio.setTitle("Rekam Data Kartu Tanda Peserta ");
				validasi_radio.setMessage("No.Registrasi  : " + data_nr+ "\n" +
										  "Nama           : " + data_nma+ "\n" +
										  "No.Telephone   : " + data_phone+ "\n" +
										  "Paket Terpilih : " + paket+ "\n" +
										  "Bank Pembayaran: " + pilihan_sp + "\n");
				validasi_radio.setNeutralButton("OKE", null);
				validasi_radio.show(); 
				
			}
		});
		
		
	}
	
	private void bank_spinner() {
		// TODO Auto-generated method stub
		sp = (Spinner)findViewById(R.id.sp);
		List<String> list_bank_sp = new ArrayList<String>();
		list_bank_sp.add("BRI");
		list_bank_sp.add("BCA");
		list_bank_sp.add("Mandiri");
		list_bank_sp.add("Nagari");
		list_bank_sp.add("BTN");
		list_bank_sp.add("BNI");
		list_bank_sp.add("CIMB");
		list_bank_sp.add("BUKOPIN Syariah");
		
		ArrayAdapter<String> daftar_bank_sp = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_bank_sp);
		
		daftar_bank_sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp .setAdapter(daftar_bank_sp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
