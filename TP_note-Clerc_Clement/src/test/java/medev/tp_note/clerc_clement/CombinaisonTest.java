package medev.tp_note.clerc_clement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class CombinaisonTest {
    Couleur rouge = new couleur(0);
    Couleur bleu = new couleur(1);
    Combinaison aDeviner = new Combinaison(rouge, rouge, rouge,rouge);
    Combinaison tentative1 = new Combinaison(bleu, rouge, rouge, rouge);
    Combinaison tentative2 = new Combinaison(rouge, rouge, rouge, rouge)
  @test
    void egalite(){
      assertEquals(false, aDeviner.compare(tentative1));
  }
  @test
    void inegalite(){
        assertEquals(true, aDeviner.compare(tentaive2));
  }
}