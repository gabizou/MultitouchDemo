package co.whitejack.multitouchdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class PhotoSortrActivity extends Activity {
	
	PhotoSortrView photoSorter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(R.string.instructions);
		photoSorter = new PhotoSortrView(this);
		setContentView(photoSorter);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		photoSorter.loadImages(this);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		photoSorter.unloadImages();
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
			photoSorter.trackballClicked();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}