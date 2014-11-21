package com.ajani.androidtestproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;;

public class CustomDialog extends AlertDialog implements OnClickListener{

	public CustomDialog(Context context) {
		super(context);
		
		setButton(BUTTON1, "button1", this);
		

	}

	@Override
	public void show() {
		super.show();
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		
	}

}
