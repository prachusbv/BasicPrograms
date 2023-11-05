package printPrograms;

import org.testng.annotations.Test;

public class PrintReverseDiagonalStarsTest {
    @Test
    public void printDiagonalStars() {
        for (int i = 4; i >0; i--) {
            for (int j = 0; j <=4; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
