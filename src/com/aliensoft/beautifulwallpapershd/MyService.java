package com.aliensoft.beautifulwallpapershd;

import com.parse.Parse;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {
		Parse.initialize(this, "dDMiMWX0vzu8mxmPgHKBEmdftfwuGLGfXSJw5aax",
				"9VtCRyWQmucD4gBIyAyC4zQUWQL9Ngi4Fmh3biLQ");
	}

	@Override
	public void onStart(Intent intent, int startId) {

	}

	@Override
	public void onDestroy() {

	}

}
