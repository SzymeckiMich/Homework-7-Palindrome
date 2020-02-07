import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        boolean flag = true;
        int[] table = {1,2,3,2,1};

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
