package mappeoppgave.domene;

import java.util.List;
import java.util.stream.Collectors;

public class Innsjoe {
    public final String navn;
    public final List<String> land;
    public final String kontinent;
    public final Double areal;
    public final Double lengde;
    public final Double maksDybde;

    public Innsjoe(String navn, List<String> land, String kontinent, Double areal, Double lengde, Double maksDybde) {
        this.navn = navn;
        this.land = land;
        this.kontinent = kontinent;
        this.areal = areal;
        this.lengde = lengde;
        this.maksDybde = maksDybde;
    }

    @Override
    public String toString() {
        return "new Innsjoe(\"" + navn + "\", Arrays.asList(\"" + land.stream().collect(Collectors.joining("\", \"")) + "\")," + "\"" + kontinent + "\", " + areal + "," + lengde + "," + maksDybde + ")";
    }
}
