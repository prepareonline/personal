package com.manulogix.rbash.owner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.manulogix.rbash.R;
import com.manulogix.rbash.dto.DeviceDetails;
import com.manulogix.rbash.dto.LoginRequest;
public class MainActivity extends FragmentActivity {

	MainLayout mLayout;
	private ListView lvMenu;
	private String[] lvMenuItems;
	ImageButton btMenu;
	TextView tvTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mLayout = (MainLayout) this.getLayoutInflater().inflate(
				R.layout.activity_main, null);
		setContentView(mLayout);

		lvMenuItems = getResources().getStringArray(R.array.menu_items);
		lvMenu = (ListView) findViewById(R.id.menu_listview);
		lvMenu.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, lvMenuItems));
		lvMenu.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				onMenuItemClick(parent, view, position, id);
			}

		});

		btMenu = (ImageButton) findViewById(R.id.button_menu);
		btMenu.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Show/hide the menu
				toggleMenu(v);
			}
		});

		tvTitle = (TextView) findViewById(R.id.activity_main_content_title);

		FragmentManager fm = MainActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		Layout1 fragment = new Layout1();
		ft.add(R.id.activity_main_content_fragment, fragment);
		ft.commit();

		try {
			loadLoginData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

	private void loadLoginData() throws Exception{
		LoginRequest request = new LoginRequest();
		request.setBz_user_email("afsara@manulogix.com");
		request.setBz_user_pwd("demo123");
		request.setDevice_token("79c5b1a8289bf63a08d14a70b440fe6f9c3d7d0f063522069131e675f614f8ed");

		request.setIs_first_time("TRUE");
		DeviceDetails deviceDetails = new DeviceDetails();
		deviceDetails.setDevice_id("949FA5D1-16AA-4EF1-AAA9-DC2AFE44F7B7");
		deviceDetails.setLat("55.755786");
		deviceDetails.setLongitude("37.617633");
		request.setDevice_details(deviceDetails);
		
		/*Gson gson= new Gson();
		String jsonString=gson.toJson(request);
		
		new CustomHttpNetworkClient().execute("",jsonString);*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	public void toggleMenu(View v) {
		mLayout.toggleMenu();
	}

	private void onMenuItemClick(AdapterView<?> parent, View view,
			int position, long id) {
		String selectedItem = lvMenuItems[position];
		String currentItem = tvTitle.getText().toString();
		if (selectedItem.compareTo(currentItem) == 0) {
			mLayout.toggleMenu();
			return;
		}

		FragmentManager fm = MainActivity.this.getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		Fragment fragment = null;

		if (selectedItem.compareTo("Online Orders") == 0) {
			Intent intent = new Intent(MainActivity.this,OrdersListActivity.class);
			startActivity(intent);
		} else if (selectedItem.compareTo("Customers") == 0) {
			Intent intent = new Intent(MainActivity.this,CustomersListActivity.class);
			startActivity(intent);
		}

		if (fragment != null) {
			ft.replace(R.id.activity_main_content_fragment, fragment);
			ft.commit();
			tvTitle.setText(selectedItem);
		}
		mLayout.toggleMenu();
	}

	@Override
	public void onBackPressed() {
		if (mLayout.isMenuShown()) {
			mLayout.toggleMenu();
		} else {
			super.onBackPressed();
		}
	}
}
