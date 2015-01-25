package com.manulogix.rbash.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.manulogix.rbash.R;
import com.manulogix.rbash.owner.MainActivity;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class WelcomeScreenActivity extends Activity {

	private ImageView imgView;
	private WelcomeScreenActivity thisActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		thisActivity = this;
		setContentView(R.layout.activity_welcome_screen);
		imgView = (ImageView) findViewById(R.id.img_welcome_screen);
		imgView.setOnClickListener(welcomeScreenImgListener);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
	}

	private View.OnClickListener welcomeScreenImgListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			startHomeScreen();
		}
	};

	private void startHomeScreen() {
		Intent intent = new Intent(getApplicationContext(),
				DialogShowActivity.class);
		startActivity(intent);
		thisActivity.finish();
	}
}
