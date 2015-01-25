/**
 * 
 */
package com.manulogix.rbash.dto;

/**
 * @author goutham
 *
 */
public class LoginRequest {
	private String bz_user_email;
	private String bz_user_pwd;
	private String is_first_time;
	private String device_token;
	private DeviceDetails device_details;

	public String getBz_user_email() {
		return bz_user_email;
	}

	public void setBz_user_email(String bz_user_email) {
		this.bz_user_email = bz_user_email;
	}

	public String getBz_user_pwd() {
		return bz_user_pwd;
	}

	public void setBz_user_pwd(String bz_user_pwd) {
		this.bz_user_pwd = bz_user_pwd;
	}

	public String getIs_first_time() {
		return is_first_time;
	}

	public void setIs_first_time(String is_first_time) {
		this.is_first_time = is_first_time;
	}

	public String getDevice_token() {
		return device_token;
	}

	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}

	public DeviceDetails getDevice_details() {
		return device_details;
	}

	public void setDevice_details(DeviceDetails device_details) {
		this.device_details = device_details;
	}

}
