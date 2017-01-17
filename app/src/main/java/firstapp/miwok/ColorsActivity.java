package firstapp.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer player ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("red","wetetti",R.drawable.red,R.raw.color_red));
        words.add(new Word ("mustard yellow","chiwiita",R.drawable.mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word ("dusty yellow","topiisa",R.drawable.dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word ("green","chokokki",R.drawable.green,R.raw.color_green));
        words.add(new Word ("brown","takaakki",R.drawable.brown,R.raw.color_brown));
        words.add(new Word ("gray","topoppi",R.drawable.gray,R.raw.color_gray));
        words.add(new Word ("black","kululli",R.drawable.black,R.raw.color_black));
        words.add(new Word ("white","kelelli",R.drawable.white,R.raw.color_white));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Word word = words.get(position);
               // MediaPlayer player = MediaPlayer.create(ColorsActivity.this, R.raw.color_red);
                MediaPlayer player = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
                player.start();
            }
        });

    }
}
