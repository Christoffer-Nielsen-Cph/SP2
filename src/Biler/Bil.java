package Biler;

public abstract class Bil {
    private String regNr;
    private String mærke;
    private String model;
    private int årGang;
    private int antalDøre;

    public Bil(String regNr, String mærke, String model, int årGang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årGang = årGang;
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerAfgift();

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setÅrGang(int årGang) {
        this.årGang = årGang;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }

    public int getÅrGang() {
        return årGang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }
}
