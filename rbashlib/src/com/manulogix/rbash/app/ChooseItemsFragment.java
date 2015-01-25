package com.manulogix.rbash.app;

import com.manulogix.rbash.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ChooseItemsFragment extends Fragment {

	private Button onlineOrders;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_layout1, null);

		onlineOrders = (Button) view.findViewById(R.id.rdetails_online_orders);

		onlineOrders.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
		});
		return view;
	}
}
