package com.jackieloven001.fitme;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity {

	public static final String PREFS_NAME = "MyPreferencesFile";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display_prefs);
		// TODO Auto-generated method stub

		TextView tvStore = (TextView) findViewById(R.id.textViewFaveJeansBrand);

		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		// same name

		tvStore.setText(settings.getString("faveStore", "AŽropostale"));
		// default value is Jackie if it can't find a name

	}

}
