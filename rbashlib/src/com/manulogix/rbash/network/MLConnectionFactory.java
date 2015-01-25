/**
 * 
 */
package com.manulogix.rbash.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import com.manulogix.rbash.util.MLURL;

import android.os.AsyncTask;

/**
 * @author goutham
 *
 */
public class MLConnectionFactory extends AsyncTask<String, String, String> {

	// Required initialization

	private final HttpClient client = new DefaultHttpClient();
	private String content;
	private String error = null;
	String data = "";
	int sizeData = 0;

	protected void onPreExecute() {
		// NOTE: You can call UI Element here.

		// Start Progress Dialog (Message)

		try {
			// Set Request parameter
			data += "&" + URLEncoder.encode("data", "UTF-8");

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Call after onPreExecute method
	protected String doInBackground(String... urls) {

		/************ Make Post Call To Web Server ***********/
		BufferedReader reader = null;

		// Send data
		try {

			// Defined URL where to send data
			// URL url = new URL(MLURL.ROOT_PATH+urls[0]);
			URL url = new URL(MLURL.ROOT_PATH + MLURL.LOGIN);
			// Send POST data request

			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(
					conn.getOutputStream());
			wr.write(data);
			wr.flush();

			// Get the server response

			reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = null;

			// Read Server Response
			while ((line = reader.readLine()) != null) {
				// Append server response in string
				sb.append(line + "");
			}

			// Append Server Response To Content String
			content = sb.toString();
			
			JSONObject obj = new JSONObject(content);
			System.out.println(obj.toString());
		} catch (Exception ex) {
			error = ex.getMessage();
		} finally {
			try {

				reader.close();
			}

			catch (Exception ex) {
			}
		}

		/*****************************************************/
		return content;
	}

	protected void onPostExecute(Void unused) {
	}
}
