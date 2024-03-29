package com.example.MuhammadIkhsan19101152630175;

import com.example.splashscreen.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Activity_Home extends Activity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn_bonus,btn_bonus_arit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity__home);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn3 = (Button)findViewById(R.id.btn3);
		btn4 = (Button)findViewById(R.id.btn4);
		btn5 = (Button)findViewById(R.id.btn5);
		btn6 = (Button)findViewById(R.id.btn6);
		btn7 = (Button)findViewById(R.id.btn7);
		btn8 = (Button)findViewById(R.id.btn8);
		btn9 = (Button)findViewById(R.id.btn9);
		btn10 = (Button)findViewById(R.id.btn10);
//		btn11 = (Button)findViewById(R.id.btn11);
		btn_bonus = (Button)findViewById(R.id.btn_bonus);
		btn_bonus_arit = (Button)findViewById(R.id.btn_bonus_arit);
		
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah1 = new Intent(arg0.getContext(), Tugas1Activity.class);
				startActivityForResult(pindah1, 0);
			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah2 = new Intent(arg0.getContext(), Tugas2Activity.class);
				startActivityForResult(pindah2, 0);
			}
		});
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah3 = new Intent(arg0.getContext(), Tugas3Activity.class);
				startActivityForResult(pindah3, 0);
			}
		});
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah4 = new Intent(arg0.getContext(), Tugas4Activity.class);
				startActivityForResult(pindah4, 0);
			}
		});
		btn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah5 = new Intent(arg0.getContext(), Tugas5Activity.class);
				startActivityForResult(pindah5, 0);
			}
		});
		btn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah6 = new Intent(arg0.getContext(), Tugas6Activity.class);
				startActivityForResult(pindah6, 0);
			}
		});
		btn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah7 = new Intent(arg0.getContext(), Tugas7Activity.class);
				startActivityForResult(pindah7, 0);
			}
		});
		btn8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah8 = new Intent(arg0.getContext(), Tugas8Activity.class);
				startActivityForResult(pindah8, 0);
			}
		});
		btn9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah9 = new Intent(arg0.getContext(), Tugas9Activity.class);
				startActivityForResult(pindah9, 0);
			}
		});
		btn10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah10 = new Intent(arg0.getContext(), Tugas10Activity.class);
				startActivityForResult(pindah10, 0);
			}
		});
		btn11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah13 = new Intent(arg0.getContext(), Tugas11Activity.class);
				startActivityForResult(pindah13, 0);
			}
		});
		btn_bonus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah11 = new Intent(arg0.getContext(), TugasBonusActivity.class);
				startActivityForResult(pindah11, 0);
			}
		});
		btn_bonus_arit.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
			Intent pindah12 = new Intent(arg0.getContext(), TugasBonus2Activity.class);
			startActivityForResult(pindah12, 0);
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity__home, menu);
		return true;
	}

}
