package antanina.app.kumpulandoadoa.model;

public class JadwalSholat {
    //private int imgJadwal;
    private String txtNama;
    private String txtWaktu;

    public JadwalSholat( String txtNama, String txtWaktu) {
      //  this.imgJadwal = imgJadwal;
        this.txtNama = txtNama;
        this.txtWaktu = txtWaktu;
    }

   // public int getImgJadwal() {
     //   return imgJadwal;
    //}

    public String getTxtNama() {
        return txtNama;
    }

    public String getTxtWaktu() {
        return txtWaktu;
    }
}
