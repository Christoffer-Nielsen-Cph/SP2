package Biler;

public class Main {

    public static void main(String[] args) {
        Garage myGarrage = new Garage("Brians garage");
        Benzinbil benzinbil = new Benzinbil("BK92538","Kia","Familiebil",2017,5,95,3);
        Elbil elbil = new Elbil("BK94321","Tesla","roadster",2019,5,10,600,250);
        Dieselbil dieselbil = new Dieselbil("BK42069","Ford","truck",2011,5,true,4);

        myGarrage.addCarToGarage(benzinbil);
        myGarrage.addCarToGarage(elbil);
        myGarrage.addCarToGarage(dieselbil);

        System.out.println(myGarrage);
        myGarrage.beregnGrønAfgiftForBilPark();
    }
}
