package Biler;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<>();
    private String garageName;

    public Garage(String garageName) {
        this.garageName = garageName;

    }

    public void addCarToGarage(Bil bil) {
        this.biler.add(bil);
    }

    public void beregnGrønAfgiftForBilPark() {
        double totalAfgift = 0;
        for (Bil bil : biler) {
            totalAfgift += bil.beregnGrønEjerAfgift();
        }
        System.out.println("Den samlede afgift på bilerne er: " + totalAfgift + ",-");
    }

    @Override
    public String toString() {
        String msg = "";
        for (Bil s : biler) {
            System.out.println(s);

        }
        return msg;
    }
}

