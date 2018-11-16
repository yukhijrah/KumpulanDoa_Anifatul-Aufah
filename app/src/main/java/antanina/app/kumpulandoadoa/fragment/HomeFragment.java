package antanina.app.kumpulandoadoa.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import antanina.app.kumpulandoadoa.R;
import antanina.app.kumpulandoadoa.adapter.JadwalAdapter;
import antanina.app.kumpulandoadoa.model.JadwalSholat;

public class HomeFragment extends Fragment {
    private List<JadwalSholat>jadwals= new ArrayList<>();

    RecyclerView lstJadwal;
    LinearLayoutManager linear;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }


    //tempat casting ee'
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.list_adzan);

        jadwalCollection();
        JadwalAdapter adapter = new JadwalAdapter(jadwals);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }
    private void jadwalCollection() {
        jadwals.add(new JadwalSholat("Subuh","04.15"));
        jadwals.add(new JadwalSholat("Dhuhur","12.00"));
        jadwals.add(new JadwalSholat("Ashar","15.00"));
        jadwals.add(new JadwalSholat("Magrib","18.00"));
        jadwals.add(new JadwalSholat("Isya","19.00"));
    }
}
