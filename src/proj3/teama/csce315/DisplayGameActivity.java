package proj3.teama.csce315;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DisplayGameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_game);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_game, menu);
		return true;
	}

}
