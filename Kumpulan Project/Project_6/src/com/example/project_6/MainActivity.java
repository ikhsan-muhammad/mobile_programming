package com.example.project_6;

import com.example.project_2.R;

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
	EditText edit_nilai;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // deklarasikan setiap ID yang telah diperkenalkan
        txt_data = (TextView)findViewById(R.id.txt_data);
        btn_proses = (Button)findViewById(R.id.btn_proses);
        edit_nobp = (EditText)findViewById(R.id.edit_nobp);
        edit_nilai = (EditText)findViewById(R.id.edit_nilai);
        
        //aktifkan button
        btn_proses.setOnClickListener(new View.OnClickListener() {
			
        	
			public void onClick(View arg0) {
				//siapkan tipe data string untuk menampung data 
				String 	data_nobp = null,
						data_nama = null,
						data_kelas = null,
						data_jurusan = null;
				
				int data_nilai = 0;
				String data_huruf = null;
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
				
				// proses kondisi bercabang
				data_nilai = Integer.parseInt(edit_nilai.getText().toString());
				
				if((data_nilai>=80)&&(data_nilai<=100)){
					data_huruf="A";
				}else if((data_nilai>=65)&&(data_nilai<=79)){
					data_huruf="B";
				}else if((data_nilai>=55)&&(data_nilai<=64)){
					data_huruf="C";
				}else if((data_nilai>=40)&&(data_nilai<=54)){
					data_huruf="D";
				}else {
					data_huruf="E";
				}
				
				// perintah settext terhadap textView
				txt_data.setText("===========================" + "\n" + 
								 "      Biodata Mahasiswa    " + "\n" +
								 "===========================" + "\n" +
								 "Nobp    : " + data_nobp + "\n" +
								 "Nama    : " + data_nama + "\n" +
								 "Kelas   : " + data_kelas+ "\n" +
								 "Jurusan : " + data_jurusan+ "\n" +
								 "Nilai   : " + data_nilai + "\n" +
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
