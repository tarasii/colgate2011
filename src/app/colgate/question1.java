package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question1 extends Activity {

	/** Called when the activity is first created. */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);
        
        final Button button_q1 = (Button) findViewById(R.id.button1_p2);
        final Button button_q7 = (Button) findViewById(R.id.button7_p2);
        button_q1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Zuby");
           		startActivityForResult(intent, 1);
           }
        });
        
        final Button button_q2 = (Button) findViewById(R.id.button2_p2);
        button_q2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
         		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Kamen");
           		startActivityForResult(intent, 1);
           }
        });
        
        final Button button_q3 = (Button) findViewById(R.id.button3_p2);
        button_q3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
         		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Karies");
           		startActivityForResult(intent, 1);
           }
        });
        
        final Button button_q4 = (Button) findViewById(R.id.button4_p2);
        button_q4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
         		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Zapah");
           		startActivityForResult(intent, 1);
           }
        });
        
        final Button button_q5 = (Button) findViewById(R.id.button5_p2);
        button_q5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
         		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Pyatna");
           		startActivityForResult(intent, 1);
           }
        });
        
        final Button button_q6 = (Button) findViewById(R.id.button6_p2);
        button_q6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
         		Intent intent = new Intent();
           		intent.setClass(question1.this, question2.class);
    		    intent.putExtra("q1", "Krov");
           		startActivityForResult(intent, 1);
           }
        });
        
        button_q7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             		Intent intent = new Intent();
               		intent.setClass(question1.this, question2.class);
               		intent.putExtra("q1", "Nichego");
               		startActivityForResult(intent, 1);
           	
            }
        });
        
        final Button button_clr = (Button) findViewById(R.id.button_p2_clr);
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
