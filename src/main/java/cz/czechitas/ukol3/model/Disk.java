package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long vratVolneMisto() {
        return kapacita - vyuziteMisto;
    }

    public void ulozSoubor(long velikost) {
        vyuziteMisto = vyuziteMisto + velikost;
    }

    public void vymazSoubor(long velikost) {
        vyuziteMisto = vyuziteMisto - velikost;
    }

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "kapacita=" + kapacita +
                ", vyuziteMisto=" + vyuziteMisto +
                '}';
    }


}
