/**
 * 
 */
package com.manulogix.rbash.dialog;

import com.manulogix.rbash.R;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * @author goutham
 *
 */
public class PayNowDialog extends Dialog {

	private Activity parentActivity;
	private Dialog dialog;
	private Button cancel, submit;

	public PayNowDialog(Activity activity) {
		super(activity);
		this.parentActivity = activity;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_pay_now);
		dialog = this;
		submit = (Button) findViewById(R.id.dialog_submit);
		submit.setOnClickListener(submitListener);
		cancel = (Button) findViewById(R.id.dialog_cancel);
		cancel.setOnClickListener(cancelListener);
	}

	private View.OnClickListener submitListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};

	private View.OnClickListener cancelListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			dialog.cancel();
		}
	};
}
