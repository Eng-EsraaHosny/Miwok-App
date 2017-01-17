package firstapp.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by User on 11/9/2016.
 */
public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "open numbers list", Toast.LENGTH_SHORT).show();
    }
}
