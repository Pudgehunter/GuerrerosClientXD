package co.domi.guerrerosclientxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);

        start.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this, Control.class);
                    startActivity(i);
                    finish();
                }
        );
    }
}