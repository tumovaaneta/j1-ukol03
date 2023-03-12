package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý.");
        } else {
            if (kontrolaVybaveni()) {
                jeZapnuty = true;
                System.out.println("Počítač se zapnul.");
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.vratVolneMisto() >= velikost) {
                pevnyDisk.ulozSoubor(velikost);
            } else if (druhyDisk.vratVolneMisto() >= velikost) {
                druhyDisk.ulozSoubor(velikost);
            } else {
                System.err.println("Je nedostatek místa na obouch diskách.");
            }
        }

    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty) {
            return;
        }
        if (pevnyDisk.getVyuziteMisto() >= velikost) {
            pevnyDisk.vymazSoubor(velikost);
        } else if (druhyDisk.getVyuziteMisto() >= velikost) {
            druhyDisk.vymazSoubor(velikost);
        } else {
            System.err.println("Kapacita nemůže být pod 0.");
        }
    }

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    private boolean kontrolaVybaveni() {
        if (cpu == null) {
            System.err.println("Počítači chybí procesor.");
            return false;
        }
        if (ram == null) {
            System.err.println("Počítači chybí paměť.");
            return false;
        }
        if (pevnyDisk == null) {
            System.err.println("Počítači chybí pevný disk.");
            return false;
        }
        return true;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                ", druhyDisk=" + druhyDisk +
                '}';
    }
}
