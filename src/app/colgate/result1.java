package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class result1 extends Activity {

	
	String str_q1;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
        setContentView(R.layout.r1);
 
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        
        int rez;
		rez = R.drawable.colgate_nichego;

        ImageView imgFavorite = (ImageView) findViewById(R.id.imageView1_r1);
    	if (str_q1.equals("Zuby"))	{
    		rez = R.drawable.colgate_zuby;
    	}
    	if (str_q1.equals("Karies"))	{
    		rez = R.drawable.colgate_prof;
    	}
    	if (str_q1.equals("Kamen"))	{
     		rez = R.drawable.colgate_kamen;
    	}
    	if (str_q1.equals("Zapah"))	{
    		rez = R.drawable.colgate_zapah;
    	}
    	if (str_q1.equals("Pyatna"))	{
    		rez = R.drawable.colgate_pyatna;
    	}
    	if (str_q1.equals("Krov"))	{
    		rez = R.drawable.colgate_krov;
    	}
    	if (str_q1.equals("Nichego"))	{
    		rez = R.drawable.colgate_nichego;
    	}
        imgFavorite.setImageResource(rez);
        
 
        final Button button_clr = (Button) findViewById(R.id.button_p5_bk);
        button_clr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.putExtra("res", "prev");
        		setResult(RESULT_OK, intent);
            	finish();
           }
        });
        
        final Button button_sbm = (Button) findViewById(R.id.button_p5_det);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		Intent intent = new Intent();
            		intent.setClass(result1.this, details1.class);
               		intent.putExtra("q1", str_q1);
               		startActivityForResult(intent, 1);
            	
            }
        });
	}

	protected void onActivityResult(int rq, int rc, Intent res)
	{
		if (rc == RESULT_OK){
			String str_res = res.getStringExtra("res");
			if(str_res.equals("main") ){
        		Intent intent = new Intent();
        		intent.putExtra("res", "main");
        		setResult(RESULT_OK, intent);
				finish();
			}
		}
	}
	
}
