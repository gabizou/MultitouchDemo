package co.whitejack.multitouchdemo;

import android.app.Activity;
import android.os.Bundle;

public class MultiTouchVisualizerActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(R.string.instructions);
		setContentView(new MultiTouchVisualizerView(this));
	}
}