package antanina.app.kumpulandoadoa.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import antanina.app.kumpulandoadoa.R;

public class JadwalHolder extends RecyclerView.ViewHolder {

    public ImageView imgJadwal;
    public TextView txtNama;
    public TextView txtWaktu;
    public View cardItemJadwal;     // cardview untuk menampilkan img, nama, jadwal.
    public JadwalHolder(@NonNull View itemView) {
        super(itemView);
        cardItemJadwal = itemView.findViewById(R.id.carditem_jadwal);
        imgJadwal = itemView.findViewById(R.id.img_mesjid);
        txtNama= itemView.findViewById(R.id.txt_nama);
        txtWaktu = itemView.findViewById(R.id.txt_jam);
    }


}
