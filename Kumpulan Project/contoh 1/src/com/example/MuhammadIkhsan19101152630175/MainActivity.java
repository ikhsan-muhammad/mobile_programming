package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
//Project 11 SplashScreen
	//Buatkan kelas interval waktu perpindahan
	private static int waktu_splash = 5000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Buatkan Permintaan Akses untuk Buka layout (Window)
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
							 WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);
		
		//Perintah Untuk Melakukan Perpindahan 
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent pindah1 = new Intent(MainActivity.this, General.class);
				startActivity(pindah1);
				this.finish();
			}

			private void finish() {
				System.exit(1);
			}
		},waktu_splash);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
