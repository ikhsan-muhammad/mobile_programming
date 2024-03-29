package com.example.project_2;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
// perkenalkan id dari komponen
	TextView txt_nama;
	Button btn_proses;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // deklarasikan setiap ID yang telah diperkenalkan
        txt_nama = (TextView)findViewById(R.id.txt_nama);
        btn_proses = (Button)findViewById(R.id.btn_proses);
        
        //aktifkan button
        btn_proses.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View arg0) {
				//siapkan tipe data string untuk memberikan data 
				String data_nama = "Ikhsan";
				// perintah settext terhadap textView
				txt_nama.setText("Nama Saya : " + data_nama);
				
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
