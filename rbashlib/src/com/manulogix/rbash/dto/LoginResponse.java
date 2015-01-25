/**
 * 
 */
package com.manulogix.rbash.dto;

import java.util.List;

/**
 * @author goutham
 *
 */
public class LoginResponse {
	private String success;
	private List<Restaurant> restaurants;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	@Override
	public String toString() {
		return "LoginResponse [success=" + success + ", restaurants="
				+ restaurants + "]";
	}
}
