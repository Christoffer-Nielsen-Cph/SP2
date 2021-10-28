package Biler;

public class Dieselbil extends Bil {
    private boolean harPartikelFilter;
    private int kmPrL;

    public Dieselbil(String regNr, String mærke, String model, int årGang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årGang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerAfgift() {

        double grønAfgift = 0;

        if (kmPrL >= 20 && kmPrL > 50)
            grønAfgift = 330 + 130;
        if (kmPrL >= 15 && kmPrL < 20)
            grønAfgift = 1050 + 1390;
        if (kmPrL >= 10 && kmPrL < 15)
            grønAfgift = 2340 + 1850;
        if (kmPrL >= 5 && kmPrL < 10)
            grønAfgift = 5500 + 2770;
        if (kmPrL >= 0 && kmPrL < 5)
            grønAfgift = 10470 + 15260;
        if (harPartikelFilter == false)
            grønAfgift = grønAfgift + 1000;

        return grønAfgift;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{ RegNr: " + getRegNr() + ", Mærke: " + getMærke() + ", Model: " + getModel() +
                ", Årgang: " + getÅrGang() + ", Antal døre: " + getAntalDøre() +
                ", Bilen har et partikelfilter: " + isHarPartikelFilter() + ", kmPrL: " + getKmPrL() + " }";
    }

}
