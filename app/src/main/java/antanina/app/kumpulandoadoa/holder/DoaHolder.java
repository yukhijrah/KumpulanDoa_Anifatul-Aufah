package antanina.app.kumpulandoadoa.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import antanina.app.kumpulandoadoa.R;

public class DoaHolder extends RecyclerView.ViewHolder {
    public TextView txtJudulDoa;
    public TextView txtArtiDoa;
    public TextView txtAyat;
    public View cardItemDoa;

    public DoaHolder(@NonNull View itemView) {
        super(itemView);

        cardItemDoa = itemView.findViewById(R.id.carditem_doa);
        txtJudulDoa = itemView.findViewById(R.id.txt_judul_doa);
        txtAyat = itemView.findViewById(R.id.txt_detail_ayat);
        txtArtiDoa = itemView.findViewById(R.id.txt_arti_doa);

    }
}
