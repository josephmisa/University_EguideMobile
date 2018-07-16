package pmtl.jjar.teamplar.universityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainMenu extends AppCompatActivity {

    ImageButton btnImg,listBuilding;
    Button btnQr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_view);

        listBuilding = (ImageButton) findViewById(R.id.list);
        listBuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.universityeguide.ml"));
                startActivity(intent);
            }
        });

        btnImg = (ImageButton) findViewById(R.id.mapbtn);
        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent citmapload = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(citmapload);
            }
        });

        btnQr = (Button) findViewById(R.id.qr_code_btn);
        btnQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qrscanbtn = new Intent(MainMenu.this, ScannerActivity.class);
                startActivity(qrscanbtn);
            }
        });

    }
}
