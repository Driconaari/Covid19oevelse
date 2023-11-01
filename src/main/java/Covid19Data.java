
public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensivAfdeling() {
        return indlagtePåIntensivAfdeling;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }
}