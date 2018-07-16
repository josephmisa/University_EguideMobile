package pmtl.jjar.teamplar.universityguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements View.OnClickListener,OnMapReadyCallback {

    public static LatLng main_building = new LatLng(10.294821, 123.880912);

    public static LatLng st_bld = new LatLng(10.294389, 123.881234);

    public static LatLng library = new LatLng(10.295215, 123.880728);

    public static LatLng Auditorium = new LatLng(10.294999, 123.880244);

    public static  LatLng BackGate = new LatLng(10.297549, 123.880093);

    public static LatLng Canteen = new LatLng(10.296081, 123.880327);

    public static LatLng FrontGate = new LatLng(10.294340, 123.881400);

    public static LatLng New_Academic = new LatLng(10.295684, 123.880946);



    public Marker mMain_building,mSt_building,mLibrary,mAuditorium,mBackgate,mCanteen,mNewacademic,mFrontgate;



    private GoogleMap mMap;

    TextView txt_st,txt_main,txt_library,txt_canteen,txt_new_academic,txt_frontgate,txt_backgate,txt_auditorium;
    FloatingActionButton fab_satelite,fab_st,fab_library,fab_main,fab_canteen,fab_new_academic,fab_frontgate,fab_backgate,fab_auditorium;
    Animation FabClose,FabOpen,FabClockwise,FabAnticlockwise;
    boolean isOpen = false;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        txt_st = (TextView)findViewById(R.id.txt_st);
        txt_main = (TextView)findViewById(R.id.txt_main);
        txt_library= (TextView)findViewById(R.id.txt_library);
        txt_auditorium = (TextView)findViewById(R.id.txt_auditorium);
        txt_new_academic = (TextView)findViewById(R.id.txt_new_academic);
        txt_frontgate = (TextView)findViewById(R.id.txt_main_entrance);
        txt_backgate = (TextView)findViewById(R.id.txt_backgate_entrance);
        txt_canteen = (TextView)findViewById(R.id.txt_canteen);

        fab_satelite=(FloatingActionButton)findViewById(R.id.fab_satelite);
        fab_st=(FloatingActionButton)findViewById(R.id.fab_st);
        fab_library=(FloatingActionButton)findViewById(R.id.fab_library);
        fab_canteen=(FloatingActionButton)findViewById(R.id.fab_canteen);
        fab_auditorium=(FloatingActionButton)findViewById(R.id.fab_auditorium);
        fab_new_academic=(FloatingActionButton)findViewById(R.id.fab_new_academic);
        fab_frontgate=(FloatingActionButton)findViewById(R.id.fab_main_entrance);
        fab_backgate=(FloatingActionButton)findViewById(R.id.fab_backgate_entrance);
        fab_main=(FloatingActionButton)findViewById(R.id.fab_main);

        FabOpen = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabClockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

       fab_satelite.setOnClickListener(this);
       fab_st.setOnClickListener(this);
       fab_main.setOnClickListener(this);
       fab_library.setOnClickListener(this);
        fab_canteen.setOnClickListener(this);
        fab_auditorium.setOnClickListener(this);
        fab_new_academic.setOnClickListener(this);
        fab_frontgate.setOnClickListener(this);
        fab_backgate.setOnClickListener(this);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void changeType(View view) {
        if (mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL) {
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        } else {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }
    }


    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.fab_satelite:
                if (isOpen){
                    fab_backgate.startAnimation(FabClose);
                    txt_backgate.startAnimation(FabClose);
                    fab_backgate.setClickable(false);
                    fab_frontgate.startAnimation(FabClose);
                    txt_frontgate.startAnimation(FabClose);
                    fab_frontgate.setClickable(false);
                    fab_new_academic.startAnimation(FabClose);
                    txt_new_academic.startAnimation(FabClose);
                    fab_new_academic.setClickable(false);
                    fab_auditorium.startAnimation(FabClose);
                    txt_auditorium.startAnimation(FabClose);
                    fab_auditorium.setClickable(false);
                    fab_canteen.startAnimation(FabClose);
                    txt_canteen.startAnimation(FabClose);
                    fab_canteen.setClickable(false);
                    fab_st.startAnimation(FabClose);
                    txt_st.startAnimation(FabClose);
                    fab_st.setClickable(false);
                    fab_library.startAnimation(FabClose);
                    txt_library.startAnimation(FabClose);
                    fab_library.setClickable(false);
                    fab_main.startAnimation(FabClose);
                    txt_main.startAnimation(FabClose);
                    fab_main.setClickable(false);
                    isOpen = false;
                }
                else {
                    fab_backgate.startAnimation(FabOpen);
                    txt_backgate.startAnimation(FabOpen);
                    fab_backgate.setClickable(true);
                    fab_frontgate.startAnimation(FabOpen);
                    txt_frontgate.startAnimation(FabOpen);
                    fab_frontgate.setClickable(true);
                    fab_new_academic.startAnimation(FabOpen);
                    txt_new_academic.startAnimation(FabOpen);
                    fab_new_academic.setClickable(true);
                    fab_auditorium.startAnimation(FabOpen);
                    txt_auditorium.startAnimation(FabOpen);
                    fab_auditorium.setClickable(true);
                    fab_canteen.startAnimation(FabOpen);
                    txt_canteen.startAnimation(FabOpen);
                    fab_canteen.setClickable(true);
                    fab_st.startAnimation(FabOpen);
                    txt_st.startAnimation(FabOpen);
                    fab_st.setClickable(true);
                    fab_main.startAnimation(FabOpen);
                    txt_main.startAnimation(FabOpen);
                    fab_main.setClickable(true);
                    fab_library.startAnimation(FabOpen);
                    txt_library.startAnimation(FabOpen);
                    fab_library.setClickable(true);
                    isOpen = true;
                }
                break;
            case R.id.fab_backgate_entrance:
                startActivity(new Intent(this, SVBackGate.class));
                break;
            case R.id.fab_main_entrance:
                startActivity(new Intent(this, SVFrontGate.class));
                break;
            case R.id.fab_canteen:
                startActivity(new Intent(this, SVCanteen.class));
                break;
            case R.id.fab_new_academic:
                startActivity(new Intent(this, SVNewAcademic.class));
                break;
            case R.id.fab_auditorium:
                startActivity(new Intent(this, SVAuditorium.class));
                break;
            case R.id.fab_st:
                startActivity(new Intent(this, SVStBuilding.class));
                break;
            case R.id.fab_library:
                startActivity(new Intent(this, SVLibrary.class));
                break;
            case R.id.fab_main:
                startActivity(new Intent(this, SVMainBuilding.class));
                break;
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mSt_building = mMap.addMarker(new MarkerOptions()
                .position(st_bld)
                .title("St Building"));
        mMain_building = mMap.addMarker(new MarkerOptions()
                .position(main_building)
                .title("Main Building"));
        mLibrary = mMap.addMarker(new MarkerOptions()
                .position(library)
                .title("Library"));
        mAuditorium = mMap.addMarker(new MarkerOptions()
                .position(Auditorium)
                .title("Auditorium"));
        mFrontgate = mMap.addMarker(new MarkerOptions()
                .position(FrontGate)
                .title("Main Entrance"));
        mBackgate = mMap.addMarker(new MarkerOptions()
                .position(BackGate)
                .title("Back Entrance"));
        mCanteen = mMap.addMarker(new MarkerOptions()
                .position(Canteen)
                .title("Canteen"));
        mNewacademic = mMap.addMarker(new MarkerOptions()
                .position(New_Academic)
                .title("New Academic"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(library,17.8f));

    }

}
