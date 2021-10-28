package Biler;

public class Benzinbil extends Bil {
    private int oktanTal;
    private int kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årGang, int antalDøre, int oktanTal, int kmPrL) {
        super(regNr, mærke, model, årGang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerAfgift() {

        double grønAfgift = 0;

        if (kmPrL >= 20 && kmPrL > 50) {
            grønAfgift = 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {

            grønAfgift = 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            grønAfgift = 2340;

        } else if (kmPrL >= 5 && kmPrL < 10) {

            grønAfgift = 5500;
        } else if (kmPrL >= 0 && kmPrL < 5) {
            grønAfgift = 10470;
        }
        return grønAfgift;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{ RegNr: " + getRegNr() + ", Mærke: " + getMærke() + ", Model: " + getModel() +
                ", Årgang: " + getÅrGang() + ", Antal døre: " + getAntalDøre() + ", Oktantal : " + getOktanTal() + ", kmPrL: " + getKmPrL() + " }";
    }
}
