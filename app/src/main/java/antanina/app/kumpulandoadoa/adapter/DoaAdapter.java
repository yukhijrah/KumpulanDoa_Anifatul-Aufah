package antanina.app.kumpulandoadoa.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import antanina.app.kumpulandoadoa.DetailActivity;
import antanina.app.kumpulandoadoa.R;
import antanina.app.kumpulandoadoa.holder.DoaHolder;
import antanina.app.kumpulandoadoa.model.Doa;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;
    public DoaAdapter(List<Doa>doas) {
        this.doas = doas;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public DoaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new DoaHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.id.carditem_doa, null));
    }

    @Override
    public void onBindViewHolder(@NonNull DoaHolder doaHolder, int position) {
        doaHolder.txtJudulDoa.setText(doas.get(position).getJudul());

        doaHolder.txtArtiDoa.setText(doas.get(position).getArti());

        doaHolder.cardItemDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
