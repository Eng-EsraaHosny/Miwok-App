package firstapp.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("father", "әpә", R.drawable.father, R.raw.family_father));
             words.add(new Word("mother", "әṭa", R.drawable.mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.son, R.raw.family_son));
             words.add(new Word("daughter", "tune", R.drawable.daughter, R.raw.family_daughter));
              words.add(new Word("older brother", "taachi", R.drawable.older_brother,
                             R.raw.family_older_brother));
             words.add(new Word("younger brother", "chalitti", R.drawable.younger_brother,
                            R.raw.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.older_sister,
                              R.raw.family_older_sister));
             words.add(new Word("younger sister", "kolliti", R.drawable.younger_sister,
                                R.raw.family_younger_sister));
              words.add(new Word("grandmother ", "ama", R.drawable.grandmother,
                              R.raw.family_grandmother));
               words.add(new Word("grandfather", "paapa", R.drawable.grandfather,
                               R.raw.family_grandfather));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Word word = words.get(position);
                MediaPlayer player = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                player.start();
            }
        });

    }
}
