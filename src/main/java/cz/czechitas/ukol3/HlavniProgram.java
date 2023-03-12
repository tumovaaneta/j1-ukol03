package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac mujPocitac = new Pocitac();

        Pamet pamet = new Pamet();
        pamet.setKapacita(12_000_000_000L);

        Disk disk = new Disk();
        disk.setKapacita(475_000_000_000L);
        disk.setVyuziteMisto(242_000_000_000L);

        Disk druhyDisk = new Disk();
        druhyDisk.setKapacita(900_000_000_000L);
        druhyDisk.setVyuziteMisto(2_000_000_000L);

        Procesor procesor = new Procesor();
        procesor.setRychlost(2_500_000_000L);
        procesor.setVyrobce("Intel");

        mujPocitac.setRam(pamet);
        mujPocitac.setPevnyDisk(disk);
        mujPocitac.setDruhyDisk(druhyDisk);
        mujPocitac.setCpu(procesor);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();
        mujPocitac.vypniSe();
        mujPocitac.vypniSe();
        mujPocitac.zapniSe();


        mujPocitac.vytvorSouborOVelikosti(200_000_000_000L);
        System.out.println(mujPocitac.toString());
        mujPocitac.vytvorSouborOVelikosti(200_000_000_000L);
        System.out.println(mujPocitac.toString());
        mujPocitac.vytvorSouborOVelikosti(800_000_000_000L);
        System.out.println(mujPocitac.toString());
        mujPocitac.vymazSouboryOVelikosti(200_000_000_000L);
        System.out.println(mujPocitac.toString());
        mujPocitac.vymazSouboryOVelikosti(900_000_000_000L);

    }


}
