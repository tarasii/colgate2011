package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question3 extends Activity {

	String str_q1;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.q3);
	
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        
        final Button button_q1 = (Button) findViewById(R.id.button1_p4);
        final Button button_q2 = (Button) findViewById(R.id.button2_p4);
        final Button button_q3 = (Button) findViewById(R.id.button3_p4);
        
        button_q1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		
        		intent.setClass(question3.this, result1.class);
           		intent.putExtra("q1", str_q1);
        		startActivityForResult(intent, 1);
            }
        });
        
        button_q2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.setClass(question3.this, result1.class);
           		intent.putExtra("q1", str_q1);
        		startActivityForResult(intent, 1);
           }
        });
        
        button_q3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.setClass(question3.this, result1.class);
           		intent.putExtra("q1", str_q1);
        		startActivityForResult(intent, 1);
            }
        });
        
        final Button button_clr = (Button) findViewById(R.id.button_p4_clr);
        button_clr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.putExtra("res", "prev");
        		setResult(RESULT_OK, intent);
            	finish();
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
