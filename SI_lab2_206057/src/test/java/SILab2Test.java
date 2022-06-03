import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    @Test
    void EveryStatement() {

        List<String> prazna = new ArrayList<>();
        List<String> nonSquare = Arrays.asList("0", "0", "0");

        List<String> lista = Arrays.asList("0", "#", "0", "0", "#","0","#");
        List<String> lista_answ = Arrays.asList("1", "#", "2", "2", "#","3","#");


        // assertThrows(IllegalArgumentException.class, () -> SILab2.function(empty_list));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(prazna));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(nonSquare));
        assertEquals(lista_answ, SILab2.function(lista));
    }

    @Test
    void EveryBranch() {

        List<String> list = Arrays.asList("0", "#", "0", "0","0", "#","0", "#","0","0", "#","0","0");
        List<String> list_answ = Arrays.asList("2", "#", "3", "3", "#","4","#","1","1","#","1","1");
        assertEquals(list_answ, SILab2.function(list));
    }
}