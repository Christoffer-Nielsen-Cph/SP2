package Biler;

public class Elbil extends Bil {
    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(String regNr, String mærke, String model, int årGang, int antalDøre, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årGang, antalDøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerAfgift() {

        double grønAfgift = 0;
        double kmPrL = 100 / (whPrKm / 91.25);

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

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{ RegNr: " + getRegNr() + ", Mærke: " + getMærke() + ", Model: " + getModel() +
                ", Årgang: " + getÅrGang() + ", Antal døre: " + getAntalDøre() +
                ", Batterikapacitet i KWh: " + getBatteriKapacitetKWh() + ", maxKm: " + getMaxKm() + ", whPrKm: " + getWhPrKm() + " }";
    }
}
