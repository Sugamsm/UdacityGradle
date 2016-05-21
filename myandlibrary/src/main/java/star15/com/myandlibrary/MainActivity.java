package star15.com.myandlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by SM01 on 18-05-2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String Joke = intent.getStringExtra("joke");

        Toast.makeText(this, Joke, Toast.LENGTH_LONG).show();
        finish();
    }
}
