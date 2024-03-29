package com.example.mobile_muhammad_ikhsan_19101152630175_if5;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
	Button btn_login;
	EditText edit_username, edit_pass;
	TextView txt_status;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		edit_username = (EditText)findViewById(R.id.edit_username);
		edit_pass = (EditText)findViewById(R.id.edit_pass);
		txt_status = (TextView)findViewById(R.id.txt_status);
		btn_login = (Button)findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data_nama,data_pass;
				data_nama = String.valueOf(edit_username.getText());
				data_pass = String.valueOf(edit_pass.getText());
				if ("Ikhsan".equalsIgnoreCase(data_nama)&&"Ikhsan123".equalsIgnoreCase(data_pass)) {
					Intent pindah1 = new Intent(arg0.getContext(), Page1Activity.class);
					startActivityForResult(pindah1, 0);
				} else {
					txt_status.setText("Nama atau Password salah,,Silahkan Ulang!!");
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
