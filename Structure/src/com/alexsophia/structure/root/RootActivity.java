package com.alexsophia.structure.root;

import com.alexsophia.structure.utils.LogWrapper;

import android.app.Activity;
import android.os.Bundle;

public class RootActivity extends Activity {
	private static final String TAG = RootActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogWrapper.i(TAG, "onCreate()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		LogWrapper.i(TAG, "onStart()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		LogWrapper.i(TAG, "onResume()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		LogWrapper.i(TAG, "onPause()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		LogWrapper.i(TAG, "onStop()");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		LogWrapper.i(TAG, "onDestroy()");
	}
}
