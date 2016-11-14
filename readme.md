# Mappeoppgave Java 8

Jobb i klassen `Streamingoppgaver` og `StreamingoppgaverTest`.

I klassen `Innsjoer` er det en liste med objekter av typen `Innsjoe`.
Oppgaven deres er å først gjøre streamingoperasjoner på denne listen.

For hver oppgave gjør dere som følger:

1. Lag en statisk funksjon med et beskrivende navn som returnerer `null`.
1. Lag en test som sjekker at funksjon dere lagde over gjør som den skal. Se at testen feiler.
1. Implementer funksjonen, og se at testen kjører OK.

Jeg har allerede laget en test for den første oppgaven, så dere kan se mønsteret.

Husk på å bruke streams til alle oppgavene.

NB! Alle navn er på engelsk.

# Oppgaver

1. Oppgave 1 (Predicates, Filtering)
    1. Finn alle innsjøer som har et navn som starter på C
    1. Finn alle innsjøer som inneholder mer enn ett ord
    1. Finn alle innsjøer som grenser til flere enn to land
    1. Finn alle innsjøer som er i Europa, og som har et areal over 10000.0 km<sup>2</sup>, og som kun befinner seg i ett land
    1. Finn den første innsjøen som har et areal på over 5000.0 km<sup>2</sup>.
1. Oppgave 2 (Function, Map)
    1. Returner en liste med navnene på alle innsjøene.
    1. Returner en liste med navnene på alle innsjøene, med store bokstaver.
    1. Returner en liste med innsjøer, hvor du endrer kontinent til Antarktis på alle.
    1. Finn navnet på den første innsjøen som har et areal på over 500000.0 km<sup>2</sup>. Hvis det ikke finnes, skriv ut "Ingen". Hint: Se Optional.orElse.
1. Oppgave 3 (Map, Reduce, findAny)
    1. Finn gjennomsnittlig areal på innsjøene.
    1. Finn hvilken innsjø som har størst lengde.
    1. Finn hvilken innsjø som har minst lengde.
    1. Finn en innsjø som har en dybde på større enn 1/10 av lengden.
    1. Finn gjennomsnittlig antall land per innsjø.
    1. Finn produktet av alle dybdene.
1.  Oppgave 4 (Collectors)
    1. Grupper innsjøene per kontinent i en `Map<String, List<Innsjoe>>`
    1. Finn ut hvor mange innsjøer hvert kontinent har.
    1. Bruk `Collectors.joining(String)` til å få en liste med navnene på innsjøene, separert med tegnet "|"
    1. Bruk `Collectors.averagingDouble(int)` til å finne gjennomsnittlig areal på innsjøene.
    1. Bruk `Collectors.partitioningBy(Predicate)` til å returnere et map med to lister, én med innsjøer med dybde over 500 meter, og én med de under.
1.  Oppgave 5 (Flatmap)
    1. Returner en liste med alle landene som er representert i lista.
    1. Returner en liste med alle landene som er representert i lista, uten duplikater.
    1. Returner en liste med alle landene som er representert i lista, og tell antall ganger hvert land er representert.
    
