package app.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class question2 extends Activity {

	/** Called when the activity is first created. */
	boolean q1_prs = false;
	boolean q2_prs = false;
	boolean q3_prs = false;
	boolean q4_prs = false;
	boolean q5_prs = false;
	boolean q6_prs = false;
	
	String str_q1;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.q2);
	
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
 
        final Button button_q1 = (Button) findViewById(R.id.button1_p3);
        button_q1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q1_prs = !q1_prs;
            	button_q1.setSelected(q1_prs);
            }
        });
        
        final Button button_q2 = (Button) findViewById(R.id.button2_p3);
        button_q2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q2_prs = !q2_prs;
            	button_q2.setSelected(q2_prs);
            }
        });
        
        final Button button_q3 = (Button) findViewById(R.id.button3_p3);
        button_q3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q3_prs = !q3_prs;
            	button_q3.setSelected(q3_prs);
            }
        });
        
        final Button button_q4 = (Button) findViewById(R.id.button4_p3);
        button_q4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q4_prs = !q4_prs;
            	button_q4.setSelected(q4_prs);
            }
        });
        
        final Button button_q5 = (Button) findViewById(R.id.button5_p3);
        button_q5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q5_prs = !q5_prs;
            	button_q5.setSelected(q5_prs);
            }
        });
        
        final Button button_q6 = (Button) findViewById(R.id.button6_p3);
        button_q6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	q6_prs = !q6_prs;
            	button_q6.setSelected(q6_prs);
            }
        });
        
        final Button button_sbm = (Button) findViewById(R.id.button_p3_subm);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		Intent intent = new Intent();
            		intent.setClass(question2.this, question3.class);
               		intent.putExtra("q1", str_q1);
               		startActivityForResult(intent, 1);
            }
        });

        final Button button_clr = (Button) findViewById(R.id.button_p3_clr);
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
