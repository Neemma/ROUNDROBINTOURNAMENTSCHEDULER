package com.example.galaxy2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class ACTUALHOME extends AppCompatActivity {
    public Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualhome);
        TextView ongoinggames = (TextView) findViewById(R.id.ongoinggames);
        TextView RegisterGame = (TextView) findViewById(R.id.RegisterGame);
        TextView SeasonsBest = (TextView) findViewById(R.id.SeasonsBest);

        Button ongoingbtn = (Button) findViewById(R.id.Ongoingbtn);

        Button Registerbtn = (Button) findViewById(R.id.Registerbtn);

        button1 = (Button) findViewById(R.id.SeasonsBestbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ACTUALHOME.this,SEASONSBEST1.class);
                startActivity(intent);
            }
        });


    }
}
