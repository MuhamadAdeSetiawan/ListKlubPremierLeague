package id.ac.poliban.dts.ade.listklubpremierleague;

public class Klub {
    private String logo;
    private String namaKlub;
    private String detailKlub;

    public Klub(String logo, String namaKlub, String detailKlub) {
        this.logo = logo;
        this.namaKlub = namaKlub;
        this.detailKlub = detailKlub;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public String getDetailKlub() {
        return detailKlub;
    }

    public void setDetailKlub(String detailKlub) {
        this.detailKlub = detailKlub;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getNamaKlub(), getDetailKlub());
    }
}

