package antanina.app.kumpulandoadoa.model;

public class Doa {
    private String judul;
    private String ayat;
    private String arti;

    public Doa(String judul, String ayat, String arti) {  // generate construktornya
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public String getJudul() {              // generate getter
        return judul;
    }

    public String getAyat() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }
}
