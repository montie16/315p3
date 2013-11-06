package proj3.teama.csce315;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    //begins game (on click from button)
    public void startAct(View view)
    {
    	Intent startIntent = new Intent(this, DisplayGameActivity.class);
    	
    }
    
    //displays instructions (on click from button)
    public void instructionAct(View view)
    {
    	Intent instructionIntent = new Intent(this, InstructionActivity.class);
    }
    
    //displays high scores (on click from button)
    public void highScoreAct(View view)
    {
    	Intent highScoreIntent = new Intent(this, HighScoreActivity.class);
    }
    
}
