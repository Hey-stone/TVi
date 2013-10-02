package com.example.lichvansu.main;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.support.v4.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.example.lichvansu.R;
import com.example.lichvansu.datecalendar.DateCalendarFragment;

public class MainActivity extends FragmentActivity implements TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActionBar actionBar = getActionBar(); // Get reference to ActionBar

		// Enable ActionBar navigation tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);

		actionBar.addTab(actionBar.newTab().setText("Lịch Ngày")
				.setTabListener((TabListener) this));
		actionBar.addTab(actionBar.newTab().setText("Chọn Ngày")
				.setTabListener((TabListener) this));
		actionBar.addTab(actionBar.newTab().setText("Đổi Ngày")
				.setTabListener((TabListener) this));

		// FrameLayout a = (FrameLayout) findViewById(R.id.container);
		// gestureDetector = new GestureDetector(new MyGestureDetector());
		// gestureListener = new View.OnTouchListener() {
		// public boolean onTouch(View v, MotionEvent event) {
		// return gestureDetector.onTouchEvent(event);
		// }
		// };

		// a.setOnClickListener(this);
		// a.setOnTouchListener(gestureListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		Fragment fragment = new DateCalendarFragment();
		// Bundle args = new Bundle();
		// args.putInt(DateCalendarFragment.ARG_SECTION_NUMBER,
		// tab.getPosition() + 1);
		// fragment.setArguments(args);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, fragment).commit();
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {

	}
}
