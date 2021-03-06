package firstapp.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
  private   MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       /* String [] words = new String[10];
         words[0] ="one";
        words[1] ="two";
        words[2] ="three";
        words[3] ="four";
        words[4] ="five";
        words[5] ="six";
        words[6] ="seven";
        words[7] ="eight";
        words[8] ="nine";
        words[9] ="ten";
        Log.v("NumbersActivity" , "word at index 0 " + words[0]);
        Log.v("NumbersActivity" , "word at index 2 " + words[2]);*/

      /*  ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
*/

        // this ia a dynamically creation of textview in java code
        // there is a long solution copy & paste this block
        /*
        TextView wordView = new TextView(this);
    wordView.setText(words.get(0));
     rootView.addView(wordView);
         */
       /* LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        int index = 0;
        while (index < 10) {
            // or index<words.size()
            TextView wordView = new TextView(this); //create a new text view
            wordView.setText(words.get(index)); // set this text view to be a single word in the list
            rootView.addView(wordView);  // add the textview to the rootview

            index++;
        }
        */

      /* for(int x = 0 ; x<words.size();x++){
            // or index<words.size()
            TextView wordView = new TextView(this); //create a new text view
            wordView.setText(words.get(x)); // set this text view to be a single word in the list
            rootView.addView(wordView);  // add the textview to the rootview


        }
        */

        final ArrayList<Word> words = new ArrayList<Word>();
        // Word w = new Word("one" , "lutti");
        //words.add(w);
        words.add(new Word("one", "lutti", R.drawable.one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.five, R.raw.number_five));
        words.add(new Word("six", "temmokka", R.drawable.six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.eight, R.raw.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.nine, R.raw.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.ten, R.raw.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,R.layout.list_item,words );

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        //  listView.setAdapter(itemsAdapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

              player  = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                player.start();
            }
        });
    }
}

        // which viewGroup did you use as the root view in the layout
        // answer is LinearLayout of list_item
       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                MediaPlayer player = MediaPlayer.create(NumbersActivity.this,R.raw.number_one);
                player.start();
            }
        });
*/




       /* Log.v("NumbersActivity", "word at index 0 " + words.get(0));
        Log.v("NumbersActivity", "word at index 1 " + words.get(1));
        Log.v("NumbersActivity" , "word at index 2 " + words.get(2));
        Log.v("NumbersActivity" , "word at index 3 " + words.get(3));
        Log.v("NumbersActivity" , "word at index 4 " + words.get(4));
        Log.v("NumbersActivity" , "word at index 5 " + words.get(5));
        Log.v("NumbersActivity" , "word at index 6 " + words.get(6));
        Log.v("NumbersActivity" , "word at index 7 " + words.get(7));
        Log.v("NumbersActivity" , "word at index 8 " + words.get(8));
        Log.v("NumbersActivity" , "word at index 9 " + words.get(9));
        */
