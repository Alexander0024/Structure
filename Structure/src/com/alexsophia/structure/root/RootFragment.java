package com.alexsophia.structure.root;

import android.app.Fragment;
import android.os.Bundle;

import com.alexsophia.structure.utils.LogWrapper;

public class RootFragment extends Fragment {
	private static final String TAG = RootActivity.class.getSimpleName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogWrapper.i(TAG, "onCreate()");
	}

	@Override
	public void onStart() {
		super.onStart();
		LogWrapper.i(TAG, "onStart()");
	}

	@Override
	public void onResume() {
		super.onResume();
		LogWrapper.i(TAG, "onResume()");
	}

	@Override
	public void onPause() {
		super.onPause();
		LogWrapper.i(TAG, "onPause()");
	}

	@Override
	public void onStop() {
		super.onStop();
		LogWrapper.i(TAG, "onStop()");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		LogWrapper.i(TAG, "onDestroy()");
	}
}
