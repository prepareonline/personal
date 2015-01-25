package com.manulogix.rbash.dto;

public class Restaurant {
	private int id;
	private int bz_user_id;
	private String res_name;
	private String contact_name;
	private String phone;
	private String fax;
	private String email;
	private String address;

	private String city;
	private String state;
	private String zip;
	private String country;
	private int is_international;
	private String address_type;
	private String lat;
	private String lng;
	private String description;
	private double user_rating;
	private int user_rating_count;
	private String logo_path;
	private String from;
	private String to;
	private String timezone;
	private String bt_merchant_account;
	private String account_num;
	private String tax;
	private String delivery_radius;
	private String created_by;
	private String last_updated_by;
	private int bz_restID;
	private int brs_id;
	private int is_cancelled;
	private int res_id;
	private String bank_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBz_user_id() {
		return bz_user_id;
	}

	public void setBz_user_id(int bz_user_id) {
		this.bz_user_id = bz_user_id;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIs_international() {
		return is_international;
	}

	public void setIs_international(int is_international) {
		this.is_international = is_international;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(double user_rating) {
		this.user_rating = user_rating;
	}

	public int getUser_rating_count() {
		return user_rating_count;
	}

	public void setUser_rating_count(int user_rating_count) {
		this.user_rating_count = user_rating_count;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getBt_merchant_account() {
		return bt_merchant_account;
	}

	public void setBt_merchant_account(String bt_merchant_account) {
		this.bt_merchant_account = bt_merchant_account;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getDelivery_radius() {
		return delivery_radius;
	}

	public void setDelivery_radius(String delivery_radius) {
		this.delivery_radius = delivery_radius;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public int getBz_restID() {
		return bz_restID;
	}

	public void setBz_restID(int bz_restID) {
		this.bz_restID = bz_restID;
	}

	public int getBrs_id() {
		return brs_id;
	}

	public void setBrs_id(int brs_id) {
		this.brs_id = brs_id;
	}

	public int getIs_cancelled() {
		return is_cancelled;
	}

	public void setIs_cancelled(int is_cancelled) {
		this.is_cancelled = is_cancelled;
	}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", bz_user_id=" + bz_user_id
				+ ", res_name=" + res_name + ", contact_name=" + contact_name
				+ ", phone=" + phone + ", fax=" + fax + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", country=" + country
				+ ", is_international=" + is_international + ", address_type="
				+ address_type + ", lat=" + lat + ", lng=" + lng
				+ ", description=" + description + ", user_rating="
				+ user_rating + ", user_rating_count=" + user_rating_count
				+ ", logo_path=" + logo_path + ", from=" + from + ", to=" + to
				+ ", timezone=" + timezone + ", bt_merchant_account="
				+ bt_merchant_account + ", account_num=" + account_num
				+ ", tax=" + tax + ", delivery_radius=" + delivery_radius
				+ ", created_by=" + created_by + ", last_updated_by="
				+ last_updated_by + ", bz_restID=" + bz_restID + ", brs_id="
				+ brs_id + ", is_cancelled=" + is_cancelled + ", res_id="
				+ res_id + ", bank_name=" + bank_name + "]";
	}

}
