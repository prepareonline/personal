package com.manulogix.rbash.app;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.manulogix.rbash.R;
import com.manulogix.rbash.list.adapters.CustomListAdapter;
import com.manulogix.rbash.ui.dto.RestaurantItemDetails;

public class ChooseItemsFragment extends Fragment {

	private List<RestaurantItemDetails> restaurantList = new ArrayList<RestaurantItemDetails>();
	private ListView listView;
	private CustomListAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_choose_items_list, null);

		listView = (ListView) view.findViewById(R.id.list);
		RestaurantItemDetails item = new RestaurantItemDetails();
		item.setTitle("Sandwich 1");
		item.setItems("2");
		restaurantList.add(item);
		item = new RestaurantItemDetails();
		item.setTitle("Sandwich 2");
		item.setItems("3");
		restaurantList.add(item);
		item = new RestaurantItemDetails();
		item.setTitle("Sandwich 3");
		item.setItems("4");
		restaurantList.add(item);
		item = new RestaurantItemDetails();
		item.setTitle("Sandwich 4");
		item.setItems("5");
		restaurantList.add(item);
		adapter = new CustomListAdapter(getActivity(), restaurantList);
		listView.setAdapter(adapter);
		return view;
	}
}
