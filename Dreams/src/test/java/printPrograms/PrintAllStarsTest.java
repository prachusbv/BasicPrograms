package printPrograms;

//import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class PrintAllStarsTest {

    @Test
    public void printStarsAllInMetrix() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}