/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ct.badger;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import android.app.Activity;

import me.leolin.shortcutbadger.ShortcutBadger;


@Kroll.module(name="Badger", id="ct.badger")
public class BadgerModule extends KrollModule
{
	public BadgerModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

	/**
	 * Set application badge
	 * 
	 * @param badgeCount badge counter
	 */
	@Kroll.method
	public void setBadgeCount(@Kroll.argument() int badgeCount) {
	    Activity currentActivity = TiApplication.getInstance().getCurrentActivity();
        ShortcutBadger.applyCount(currentActivity, badgeCount);
	}

}
