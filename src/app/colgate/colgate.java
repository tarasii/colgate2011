package app.colgate;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colgate extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        final Button button_start = (Button) findViewById(R.id.button1_p1);
        button_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent();
    		    intent.setClass(colgate.this, question1.class);
    		    startActivityForResult(intent, 1);
            }
        });
        
        button_start.setSelected(false);
   }
}