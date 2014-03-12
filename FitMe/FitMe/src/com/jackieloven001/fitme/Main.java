package com.jackieloven001.fitme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread logoTimer = new Thread() {
			// creating a new Thread called logoTimer
			public void run() {
				try {
					sleep(2000);
					Intent splashIntent = new Intent(
							"com.jackieloven001.fitme.SPLASH");
					// exactly copied from the manifest
					startActivity(splashIntent);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				finally {
					finish();
				}
			}

		}; // put a semicolon after the thread ends
		logoTimer.start();

	}

	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) {
	 * 
	 *           // Inflate the menu; this adds items to the action bar if it is
	 *           present. getMenuInflater().inflate(R.menu.main, menu); return
	 *           true; }
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
	 *           action bar item clicks here. The action bar will //
	 *           automatically handle clicks on the Home/Up button, so long //
	 *           as you specify a parent activity in AndroidManifest.xml. int id
	 *           = item.getItemId(); if (id == R.id.action_settings) { return
	 *           true; } return super.onOptionsItemSelected(item); }
	 **/

}
