package medev.tp_note.clerc_clement;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class CouleurTest {
    private Couleur rouge = new Couleur(0);
    private Couleur bleu = new Couleur(1);
    
  @Test
    void getter(){
      assertEquals(true, rouge.getCouleur() == 0);
  }
  @Test
    void egalite(){
        assertEquals(false,rouge.egal(bleu));
    }
  @Test
    void inegalite(){
        assertEquals(true,rouge.egal(rouge));
    }
  @Test
    void setter(){
        rouge.setCouleur(1);
        assertEquals(true, (rouge.egal(bleu)));
        rouge.setCouleur(0);
  }
}