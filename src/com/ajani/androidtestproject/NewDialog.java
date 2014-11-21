package com.ajani.androidtestproject;


public class NewDialog extends AlertDialog implements OnClickListener, OnCancelListener, OnDismissListener, OnShowListener{

	private boolean isPositiveButtonClicked;

	protected NewDialog(Context context) {
		super(context);
//		setContentView(R.layout.dialogview);
		
		setTitle("I Win");
		setIcon(R.drawable.ic_launcher);
		setOnCancelListener(this);
		setOnDismissListener(this);
		setOnShowListener(this);
		
//		setContentView(R.layout.dialogview);
		
		setMessage("sd mdnfk mdfmndl mdnfldmldf kdmflddf kn f kd kdmfnl kedn  wk");
		setButton(BUTTON_POSITIVE, "Positve", this);
		setButton(BUTTON_NEGATIVE, "Negative", this);
		setButton(BUTTON_NEUTRAL, "Neutral", this);
		setCancelable(false);
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
//		cancel();
		if (which == BUTTON_POSITIVE) {
			isPositiveButtonClicked = true;
		}
	}

	@Override
	public void dismiss() {
//		if (isPositiveButtonClicked) {
//			super.dismiss();
//		}
		super.dismiss();
		System.out.println("NewDialog.dismiss()");
	}

	@Override
	public void onCancel(DialogInterface dialog) {
		System.out.println("NewDialog.onCancel()");
	}

	@Override
	public void onDismiss(DialogInterface dialog) {
		System.out.println("NewDialog.onDismiss()");
	}

	@Override
	public void onShow(DialogInterface dialog) {
		System.out.println("NewDialog.onShow()");
	}
}
