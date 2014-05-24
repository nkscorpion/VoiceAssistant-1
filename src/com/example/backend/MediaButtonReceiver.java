/**
 * 
 */
package com.example.backend;

import com.example.voiceassistantm2.MainActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author yuechuan
 *
 */
public class MediaButtonReceiver extends BroadcastReceiver {

	private static final String TAG = MediaButtonReceiver.class.getName();

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		if (action.equals(MediaButtonService.MEDIA_BUTTON_FILTER)){
			//TODO do action when received press
			Log.d(TAG,"media button pressed");
			//bring app to forground
			Intent i =  new Intent(context,MainActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
			context.startActivity(i);
		}
		else {
			//when action not recognized
		}
		
	}
	
	

}