package com.manulogix.rbash.list.adapters;

import java.util.List;

import com.manulogix.rbash.R;
import com.manulogix.rbash.ui.dto.RestaurantItemDetails;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
	private Activity activity;
	private LayoutInflater inflater;
	private List<RestaurantItemDetails> restaurantItems;

	public CustomListAdapter(Activity activity,
			List<RestaurantItemDetails> restaurantItems) {
		this.activity = activity;
		this.restaurantItems = restaurantItems;
	}

	@Override
	public int getCount() {
		return restaurantItems.size();
	}

	@Override
	public Object getItem(int location) {
		return restaurantItems.get(location);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (inflater == null) {
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		if (convertView == null) {
			convertView = inflater.inflate(R.layout.choose_items_list_item,
					null);
		}

		TextView title = (TextView) convertView
				.findViewById(R.id.list_item_title);
		TextView count = (TextView) convertView
				.findViewById(R.id.list_item_count);

		// getting movie data for the row
		RestaurantItemDetails restaurantItem = restaurantItems.get(position);

		title.setText(restaurantItem.getTitle());
		count.setText(restaurantItem.getItems());
		return convertView;
	}

}