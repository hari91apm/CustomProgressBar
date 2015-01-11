package com.example.showcustomprogress;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	ProgressBar progressBar2;
	Button btnShowProgress,btnStopProgress;
	TextView txtContact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtContact=(TextView)findViewById(R.id.txtContact);
		btnShowProgress=(Button)findViewById(R.id.btnShowProgress);
		btnStopProgress=(Button)findViewById(R.id.btnStopProgress);
		progressBar2=(ProgressBar)findViewById(R.id.progressBar2);
		progressBar2.setVisibility(View.GONE);
		btnStopProgress.setVisibility(View.GONE);
		txtContact.setVisibility(View.GONE);
		btnShowProgress.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				progressBar2.setVisibility(View.VISIBLE);
				btnShowProgress.setVisibility(View.GONE);
				btnStopProgress.setVisibility(View.VISIBLE);
				txtContact.setVisibility(View.VISIBLE);
			}
		});
		
		btnStopProgress.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				progressBar2.setVisibility(View.GONE);
				btnShowProgress.setVisibility(View.VISIBLE);
				btnStopProgress.setVisibility(View.GONE);
				txtContact.setVisibility(View.GONE);
			}
		});
	}

}
