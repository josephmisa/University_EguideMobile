package pmtl.jjar.teamplar.universityguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spalash extends AppCompatActivity {

    private static int Splash_time_out = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Spalash.this,MainMenu.class);
                startActivity(homeIntent);
                finish();

            }
        },Splash_time_out);
    }
}
