package antanina.app.kumpulandoadoa.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import antanina.app.kumpulandoadoa.R;
import antanina.app.kumpulandoadoa.holder.JadwalHolder;
import antanina.app.kumpulandoadoa.model.JadwalSholat;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalHolder> {
    private List<JadwalSholat> jadwals;
    public JadwalAdapter(List<JadwalSholat>jadwals) {
        this.jadwals=jadwals;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public JadwalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new JadwalHolder(LayoutInflater.from(parent.getContext()).inflate(R.id.carditem_jadwal,null));
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalHolder jadwalHolder, int position) {
        jadwalHolder.txtNama.setText(jadwals.get(position).getTxtNama());
        jadwalHolder.txtWaktu.setText(jadwals.get(position).getTxtWaktu());
    }

    @Override
    public int getItemCount() {
        return jadwals.size();
    }
}
