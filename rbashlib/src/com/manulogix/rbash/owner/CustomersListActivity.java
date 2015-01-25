package com.manulogix.rbash.owner;

import com.manulogix.rbash.R;
import com.manulogix.rbash.R.id;
import com.manulogix.rbash.R.layout;
import com.manulogix.rbash.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CustomersListActivity extends Activity {
	
	private ImageButton iButtonBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customers_list);
		iButtonBack=(ImageButton) findViewById(R.id.ibutton_back);
		
		iButtonBack.setOnClickListener(backButton);
	}

	private View.OnClickListener backButton = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			CustomersListActivity.this.finish();
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.customers_list, menu);
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
