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
import antanina.app.kumpulandoadoa.adapter.DoaAdapter;
import antanina.app.kumpulandoadoa.model.Doa;

public class DoaFragment extends Fragment{
    private List<Doa> doas = new ArrayList<>();

    RecyclerView listDoa;
    LinearLayoutManager linear;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_doa,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_doa);
        doasCollection();

        DoaAdapter adapter = new DoaAdapter(doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void doasCollection() {
        doas.add(new Doa ("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api nerakaِ"));
        doas.add(new Doa ("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنََ","Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam"));
        doas.add(new Doa ("Doa Sesudah  Minum","اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا","Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami"));
        doas.add(new Doa ("Doa Ketika Makan Lupa Membaca Doa","بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ","Dengan menyebut nama Allah pada awal dan akhirnya"));
        doas.add(new Doa ("Doa Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ","Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati"));
        doas.add(new Doa ("Doa Ketika Mimpi Buruk","اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ","Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
        doas.add(new Doa ("Doa Ketika Mendapat Mimpi Baik","اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new Doa ("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan"));
        doas.add(new Doa ("Doa Masuk Kamar Mandi","اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ","Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan"));
        doas.add(new Doa ("Doa Keluar Kamar Mandi","غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ\n","Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan"));

        DoaAdapter adapter = new DoaAdapter(doas);

        listDoa.setAdapter(adapter);
    }

}