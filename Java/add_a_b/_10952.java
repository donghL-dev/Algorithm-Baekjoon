package baekjoon.add_a_b;

import java.util.Scanner;

public class _10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 || y == 0)
                break;
            System.out.println(x+y);
        }
    }
}
