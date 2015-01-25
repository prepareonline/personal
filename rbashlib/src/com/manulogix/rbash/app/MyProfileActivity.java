package com.manulogix.rbash.app;

import com.manulogix.rbash.R;
import com.manulogix.rbash.R.id;
import com.manulogix.rbash.R.layout;
import com.manulogix.rbash.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MyProfileActivity extends Activity {
	private MyProfileActivity thisActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_profile);
		thisActivity = this;
	}

}
