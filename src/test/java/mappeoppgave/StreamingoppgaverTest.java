package mappeoppgave;

import mappeoppgave.domene.Innsjoe;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamingoppgaverTest {

    @Test
    public void skalFinneAlleSomStarterPaaC() throws Exception {
        List<Innsjoe> innsjoerSomBegynnerPaaC = Streamingoppgaver.begynnerPaaC();
        assertEquals(1, innsjoerSomBegynnerPaaC.size());
    }
}