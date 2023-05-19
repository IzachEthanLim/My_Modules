package sg.edu.rp.c346.id22022448.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.Module1);
        mod2 = findViewById(R.id.Module2);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivityActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });
        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivityActivity.class);
                intent.putExtra("Code", "C349");
                intent.putExtra("Name", "Ipad Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 3);
                intent.putExtra("Venue", "W64L");
                startActivity(intent);
            }
        });
    }
}