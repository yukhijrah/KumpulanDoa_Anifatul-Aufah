package antanina.app.kumpulandoadoa;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import antanina.app.kumpulandoadoa.adapter.ContainerAdapter;
import antanina.app.kumpulandoadoa.fragment.DoaFragment;
import antanina.app.kumpulandoadoa.fragment.HomeFragment;
import antanina.app.kumpulandoadoa.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpMain;
    private Button btnHome, btnDoa, btnProfile;

    private ContainerAdapter adapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#dd2c00")));
        // casting object (view)
        vpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome= (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile = (Button) findViewById(R.id.btn_pofile);

        setContainerPrepared(); // pannggil method untuk preparing fragment container
        onButtonsClicked(); // method agar button bisa diclicked
    }
    private void setContainerPrepared() {
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.menu_home));
        adapter.addFragment(new DoaFragment(), getString(R.string.menu_doa));
        adapter.addFragment(new ProfileFragment(), getString(R.string.menu_profile));
        vpMain.setAdapter(adapter);
    }
    private void onButtonsClicked() {
        // ini untuk handle click button pada btnHome
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        // ini untuk handle click button pada btnDoa
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        // ini untuk handle click button pada btnProfile
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
