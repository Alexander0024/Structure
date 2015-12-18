package com.alexsophia.structure.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexsophia.structure.root.RootFragment;
import com.lidroid.xutils.ViewUtils;

public abstract class BaseFragment extends RootFragment {
	protected View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(getFragmentView(), container, false);
		ViewUtils.inject(this, view);
		return view;
	}

	public abstract int getFragmentView();

	public View getContentView() {
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		findViewById(view);
		initView();
		refreshView();
		setListener();
		super.onActivityCreated(savedInstanceState);
	}

	/**
	 * 点击的监听
	 */
	public View.OnClickListener listener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			clickView(v);
		}
	};

	/**
	 * 查找布局
	 */
	protected abstract void findViewById(View v);

	/**
	 * 初始化数据
	 */
	protected abstract void initView();

	/**
	 * 设置监听
	 */
	protected abstract void setListener();

	/**
	 * 点击某个view
	 * 
	 * @param v
	 */
	protected void clickView(View v) {

	};

	protected void refreshView() {

	};

	protected void loadMoreView() {

	};
}
