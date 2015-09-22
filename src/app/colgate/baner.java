package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class baner extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.baner); 
	
        ImageView imgFavorite = (ImageView) findViewById(R.id.imageView1_banner);
        imgFavorite.setClickable(true);
        imgFavorite.setOnTouchListener(new OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						// TODO Auto-generated method stub
	            		Intent intent = new Intent();
	            		intent.putExtra("res", "main");
	            		setResult(RESULT_OK, intent);
						finish();
						return false;
					}
                });
	    // TODO Auto-generated method stub
	}

}
