package firstapp.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {



    TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);

        //first method is by using    android:onClick="navigate"  in xml


        // second method is by instanse
      //  NumbersClickListener ncl = new  NumbersClickListener();
        //   android:onClick="navigate"
        //we delete tis from XML file


        //third method by anonymous class
        //textView.setOnClickListener : attach the listener to the view
        //new View.OnClickListener() : create new instanse object of event listener
        /*Intent i = new Intent(MainActivity.this , NumbersActivity.class);
        startActivity(i);
        : define the event listener inline (custom behavior for when the event happens)
        */

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , NumbersActivity.class);
                startActivity(i);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this ,FamilyActivity.class);
                startActivity(i);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this ,ColorsActivity.class);
                startActivity(i);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(i);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , GridActivity.class);
                startActivity(i);
            }
        });

    }
   /* public void navigate(View v)
    {
        Intent i = new Intent(MainActivity.this , NumbersActivity.class);
        startActivity(i);
    }*/
}
