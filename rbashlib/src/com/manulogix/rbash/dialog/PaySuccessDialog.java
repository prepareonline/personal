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
public class PaySuccessDialog extends Dialog {

	private Activity parentActivity;
	private Dialog dialog;
	private Button submit;

	public PaySuccessDialog(Activity activity) {
		super(activity);
		this.parentActivity = activity;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_pay_success);

		dialog = this;
		submit = (Button) findViewById(R.id.dialog_success);
		submit.setOnClickListener(submitListener);

	}

	private View.OnClickListener submitListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			dialog.dismiss();
		}
	};

}
