package com.aliensoft.allwallpapers;

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
		Parse.initialize(this, "vzLCqJpOd64uDh7hCYJLY1Exk0JS77M9VYmHfbGt",
				"xaxY4TVn2sJqQYdCuYTP3FqzOt1h7eJJHVjnrIAO");
	}

	@Override
	public void onStart(Intent intent, int startId) {

	}

	@Override
	public void onDestroy() {

	}

}
