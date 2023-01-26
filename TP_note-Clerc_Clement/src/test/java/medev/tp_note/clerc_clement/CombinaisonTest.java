package medev.tp_note.clerc_clement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class CombinaisonTest {
    private Couleur rouge = new Couleur(0);
    private Couleur bleu = new Couleur(1);
    private Combinaison aDeviner = new Combinaison(rouge, rouge, rouge,rouge);
    private Combinaison tentative1 = new Combinaison(bleu, rouge, rouge, rouge);
    private Combinaison tentative2 = new Combinaison(rouge, rouge, rouge, rouge);
  @Test
    void egalite(){
      assertEquals(false, aDeviner.compare(tentative1));
  }
  @Test
    void inegalite(){
        assertEquals(true, aDeviner.compare(tentative2));
  }
}