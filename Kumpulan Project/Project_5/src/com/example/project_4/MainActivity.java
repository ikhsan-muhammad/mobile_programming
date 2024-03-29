package com.example.project_4;

import com.example.project_2.R;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
// perkenalkan id dari komponen
	TextView txt_data;
	Button btn_proses;
	EditText edit_nobp;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // deklarasikan setiap ID yang telah diperkenalkan
        txt_data = (TextView)findViewById(R.id.txt_data);
        btn_proses = (Button)findViewById(R.id.btn_proses);
        edit_nobp = (EditText)findViewById(R.id.edit_nobp);        
        
        //aktifkan button
        btn_proses.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View arg0) {
				//siapkan tipe data string untuk menampung data 
				String 	data_nobp = null,
						data_nama = null,
						data_kelas = null,
						data_jurusan = null;
				// buantkan perintah tampung data 
				data_nobp = String.valueOf(edit_nobp.getText());
				
				//proses kondisi percabangan tunggal
				if("190175".equalsIgnoreCase(data_nobp)){
					data_nama = "Ikhsan";
					data_kelas = "IF_5";
					data_jurusan = "Teknik Informatika";
				}else if("190176".equalsIgnoreCase(data_nobp)){
					data_nama = "BOWO";
					data_kelas = "IF_5";
					data_jurusan = "Teknik Informatika";
				}else{
					System.out.println("data tidak ditemukan");
				}
				
				// perintah settext terhadap textView
				txt_data.setText("===========================" + "\n" + 
								 "      Biodata Mahasiswa    " + "\n" +
								 "===========================" + "\n" +
								 "Nobp    : " + data_nobp + "\n" +
								 "Nama    : " + data_nama + "\n" +
								 "Kelas   : " + data_kelas+ "\n" +
								 "Jurusan : " + data_jurusan+ "\n" +
								 "==========================");
				edit_nobp.setText("");
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
