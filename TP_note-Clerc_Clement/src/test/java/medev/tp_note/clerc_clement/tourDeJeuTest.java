package medev.tp_note.clerc_clement;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class tourDeJeuTest {
    private tourDeJeu test = new tourDeJeu(2,2,2);
    
  @Test
    void getterNbr_tour(){
      assertEquals(true, test.getNbr_tour() == 2);
  }
  @Test
    void getterScore_j1(){
      assertEquals(true, test.getScore_j1() == 2);
  }
  @Test
    void getterScore_j2(){
      assertEquals(true, test.getScore_j2() == 2);
  }
  @Test
    void setterNbr_tour(){
        test.setNbr_tour(4);
        assertEquals(true, test.getNbr_tour() == 4);
  }
  @Test
    void setterScore_j1(){
        test.setScore_j1(4);
        assertEquals(true, test.getScore_j1() == 4);
  }
  @Test
    void setterScore_j2(){
        test.setScore_j2(4);
        assertEquals(true, test.getScore_j2() == 4);
  }
}