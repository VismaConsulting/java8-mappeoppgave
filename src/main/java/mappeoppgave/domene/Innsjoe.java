package mappeoppgave.domene;

import java.util.List;

public class Innsjoe {
    private final String navn;
    private final List<String> land;
    private final String kontinent;
    private final Double areal;
    private final Double lengde;
    private final Double maksDybde;

    public Innsjoe(String navn, List<String> land, String kontinent, Double areal, Double lengde, Double maksDybde) {
        this.navn = navn;
        this.land = land;
        this.kontinent = kontinent;
        this.areal = areal;
        this.lengde = lengde;
        this.maksDybde = maksDybde;
    }

    public String navn() {
        return navn;
    }

    public List<String> land() {
        return land;
    }

    public String kontinent() {
        return kontinent;
    }

    public Double areal() {
        return areal;
    }

    public Double lengde() {
        return lengde;
    }

    public Double maksDybde() {
        return maksDybde;
    }

    @Override
    public String toString() {
        return "Innsjoe{" +
                "navn='" + navn + '\'' +
                ", land=" + land +
                ", kontinent='" + kontinent + '\'' +
                ", areal=" + areal +
                ", lengde=" + lengde +
                ", maksDybde=" + maksDybde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Innsjoe innsjoe = (Innsjoe) o;

        if (navn != null ? !navn.equals(innsjoe.navn) : innsjoe.navn != null) return false;
        if (land != null ? !land.equals(innsjoe.land) : innsjoe.land != null) return false;
        if (kontinent != null ? !kontinent.equals(innsjoe.kontinent) : innsjoe.kontinent != null) return false;
        if (areal != null ? !areal.equals(innsjoe.areal) : innsjoe.areal != null) return false;
        if (lengde != null ? !lengde.equals(innsjoe.lengde) : innsjoe.lengde != null) return false;
        return maksDybde != null ? maksDybde.equals(innsjoe.maksDybde) : innsjoe.maksDybde == null;

    }

    @Override
    public int hashCode() {
        int result = navn != null ? navn.hashCode() : 0;
        result = 31 * result + (land != null ? land.hashCode() : 0);
        result = 31 * result + (kontinent != null ? kontinent.hashCode() : 0);
        result = 31 * result + (areal != null ? areal.hashCode() : 0);
        result = 31 * result + (lengde != null ? lengde.hashCode() : 0);
        result = 31 * result + (maksDybde != null ? maksDybde.hashCode() : 0);
        return result;
    }
}
