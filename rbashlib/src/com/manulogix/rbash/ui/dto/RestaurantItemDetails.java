/**
 * 
 */
package com.manulogix.rbash.ui.dto;

/**
 * @author goutham
 *
 */
public class RestaurantItemDetails {
	private String title;
	private String items;
	private String price;
	private String subject;
	private String description;

	public RestaurantItemDetails() {
	}

	public RestaurantItemDetails(String title, String items, String price,
			String subject, String description) {
		super();
		this.title = title;
		this.items = items;
		this.price = price;
		this.subject = subject;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
