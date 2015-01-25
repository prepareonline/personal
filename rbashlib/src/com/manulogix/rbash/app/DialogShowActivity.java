package com.manulogix.rbash.app;

import com.manulogix.rbash.R;
import com.manulogix.rbash.R.id;
import com.manulogix.rbash.R.layout;
import com.manulogix.rbash.R.menu;
import com.manulogix.rbash.dialog.AddTipDialog;
import com.manulogix.rbash.dialog.DeliveryAddressDialog;
import com.manulogix.rbash.dialog.PayNowDialog;
import com.manulogix.rbash.dialog.PaySuccessDialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DialogShowActivity extends Activity {
	private Button orderNow, payNow, paySuccess, addTip, accountSeettings,
			myProfile;
	private DialogShowActivity currentActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_app);

		orderNow = (Button) findViewById(R.id.app_home_order_now);
		orderNow.setOnClickListener(orderNowListener);

		payNow = (Button) findViewById(R.id.app_home_pay_now);
		payNow.setOnClickListener(payNowListener);

		paySuccess = (Button) findViewById(R.id.app_home_pay_success);
		paySuccess.setOnClickListener(paySuccessListener);

		addTip = (Button) findViewById(R.id.app_home_add_tip);
		addTip.setOnClickListener(addTipListener);
		currentActivity = this;

		accountSeettings = (Button) findViewById(R.id.app_home_acc_setting);
		accountSeettings.setOnClickListener(accSettingsListener);

		myProfile = (Button) findViewById(R.id.app_home_my_profile);
		myProfile.setOnClickListener(myProfileListener);
	}

	private View.OnClickListener orderNowListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			DeliveryAddressDialog cd = new DeliveryAddressDialog(
					currentActivity);
			cd.show();
		}
	};

	private View.OnClickListener payNowListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			PayNowDialog cd = new PayNowDialog(currentActivity);
			cd.show();
		}
	};

	private View.OnClickListener paySuccessListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			PaySuccessDialog cd = new PaySuccessDialog(currentActivity);
			cd.show();
		}
	};

	private View.OnClickListener addTipListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			AddTipDialog cd = new AddTipDialog(currentActivity);
			cd.show();
		}
	};

	private View.OnClickListener accSettingsListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(currentActivity,
					AccountSettingsActivity.class);
			startActivity(intent);
		}
	};

	private View.OnClickListener myProfileListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(currentActivity, MyProfileActivity.class);
			startActivity(intent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_app, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
