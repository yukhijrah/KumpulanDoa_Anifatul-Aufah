package antanina.app.kumpulandoadoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txtDetailJudul, txtDetailAyat, txtDetailArti;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_judul_doa);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailArti = (TextView) findViewById(R.id.txt_arti_doa);
    }


}
