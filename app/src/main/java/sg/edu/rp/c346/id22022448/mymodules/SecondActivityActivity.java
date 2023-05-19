package sg.edu.rp.c346.id22022448.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivityActivity extends AppCompatActivity {

    TextView ModInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        ModInfo = findViewById(R.id.ModInfo);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        Integer year = intentReceived.getIntExtra("Year", 0);
        Integer sem = intentReceived.getIntExtra("Sem", 0);
        Integer credit = intentReceived.getIntExtra("Credit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        ModInfo.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + sem + "\nModule Credit: " + credit + "\nVenue: " + venue);
    }
}