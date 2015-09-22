package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class details1 extends Activity {

	/** Called when the activity is first created. */
	String str_q1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    // TODO Auto-generated method stub
        setContentView(R.layout.d1);
        
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");

        int rez;
		rez = R.drawable.colgate_nichego_d;

        ImageView imgFavorite = (ImageView) findViewById(R.id.imageView1_d1);
    	if (str_q1.equals("Zuby"))	{
    		rez = R.drawable.colgate_zuby_d;
    	}
    	if (str_q1.equals("Karies"))	{
    		rez = R.drawable.colgate_prof_d;
    	}
    	if (str_q1.equals("Kamen"))	{
     		rez = R.drawable.colgate_kamen_d;
    	}
    	if (str_q1.equals("Zapah"))	{
    		rez = R.drawable.colgate_zapah_d;
    	}
    	if (str_q1.equals("Pyatna"))	{
    		rez = R.drawable.colgate_pyatna_d;
    	}
    	if (str_q1.equals("Krov"))	{
    		rez = R.drawable.colgate_krov_d;
    	}
    	if (str_q1.equals("Nichego"))	{
    		rez = R.drawable.colgate_nichego_d;
    	}
        imgFavorite.setImageResource(rez);

        final Button button_clr = (Button) findViewById(R.id.button_p12_bk);
        button_clr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.putExtra("res", "prev");
        		setResult(RESULT_OK, intent);
            	finish();
           }
        });
        
        final Button button_sbm = (Button) findViewById(R.id.button_p12_det);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		Intent intent = new Intent();
            		intent.setClass(details1.this, baner.class);
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
