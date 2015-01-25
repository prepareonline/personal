package com.manulogix.rbash.owner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manulogix.rbash.R;
public class Layout2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_layout2, null);
		
		Intent intent = new Intent(getActivity(),CustomersListActivity.class);
		startActivity(intent);
		return view;
	}
}
