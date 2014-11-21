package com.ajani.androidtestproject;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    
    public void clickMe(View v) {
//    	NewDialog dialog = new NewDialog(this);
//    	System.out.println("MainActivity.clickMe()11 "+ dialog.isShowing());
//    	dialog.show();
//    	System.out.println("MainActivity.clickMe() 22"+ dialog.isShowing());
    	
    	
    	LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
    	View view = inflater.inflate(R.layout.dialogview, (ViewGroup) findViewById(R.id.layout_root));
    	
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Dialog test");
    	builder.setView(view);
    	builder.setPositiveButton("ok", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
    	AlertDialog alertDialog = builder.create();
    	alertDialog.show();
    	
   
    	
//    	showDialog(1);
	}
    
    
    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
    	dialog.setTitle("I changed");
//    	dialog.setCancelable(true);
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
		case 1:
			return new NewDialog(this);
		default:
			break;
		}
    	
    	return super.onCreateDialog(id);
    }
}
