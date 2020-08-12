package com.example.tugaspemogramanlanjut;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button but;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = (Button)findViewById(R.id.show);
        text = (TextView)findViewById(R.id.nama);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getVisibility() == View.VISIBLE)
                    text.setVisibility(View.INVISIBLE);
                else
                    text.setVisibility(View.VISIBLE);
            }
        });


    }
}
