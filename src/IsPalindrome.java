import java.util.Scanner;

public class IsPalindrome {
    public void isPalindrome ( int[] table){
        boolean flag = true;

        for (int i = 0; i < table.length; i++) {
            if ((table[i] - table[table.length - 1 - i]) != 0) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("Tablica nie jest palindromem");
        } else {
            System.out.println("Tablica jest palindromem");
        }
    }
}
