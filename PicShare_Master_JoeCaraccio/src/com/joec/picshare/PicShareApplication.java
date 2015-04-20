package com.joec.picshare;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseFacebookUtils;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.PushService;

public class PicShareApplication extends Application {

	//the setup file - joe c
	
	@Override
	public void onCreate() {
		super.onCreate();		
		
		/*
		 *subclasses for the user and for the actual pphoto
		 */
		ParseObject.registerSubclass(Photo.class);
		ParseObject.registerSubclass(Activity.class);
		
		//parse setup stuff with parse server
		Parse.initialize(this, "4X6Y1S87zj0mybfgFSmTMHtJxNuR675j4uTy5iXE", "vLjQqQ5ZIOE195yQoGHVuKfcJyTj8zPZS57ygBpw");		
		ParseFacebookUtils.initialize(getString(R.string.app_id));
		//using the facebook dev sdk as well
		

		//gotta look into acl a bit
		ParseACL defaultACL = new ParseACL();

		
		defaultACL.setPublicReadAccess(true);

		/*
		 * Default ACL is public read access, and user read/write access
		 */
		ParseACL.setDefaultACL(defaultACL, true);
		
		/*
		 *  Register for push notifications.
		 */
		PushService.setDefaultPushCallback(this, LoginActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		
		//bam
	}

}
