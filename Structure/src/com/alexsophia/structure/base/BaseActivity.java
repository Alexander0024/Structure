package com.alexsophia.structure.base;

import com.alexsophia.structure.root.RootActivity;

import android.os.Bundle;
import android.view.View;

public abstract class BaseActivity extends RootActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		findViewById();
		initView();
		refreshView();
		setListener();
	}
	
	/**
	 * 点击事件的监听
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
	public abstract void findViewById();
	
	/**
	 * 初始化页面数据
	 */
	public abstract void initView();
	
	/**
	 * 设置监听
	 */
	public abstract void setListener();
	
	/**
	 * 按钮点击事件
	 * @param v
	 */
	public void clickView(View v) {
		
	}
	
	protected void refreshView() {
		
	}
	
	protected void loadMoreView() {
		
	}
}
