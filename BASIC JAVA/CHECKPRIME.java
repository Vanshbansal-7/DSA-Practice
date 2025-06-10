import java.util.*;

public class CHECKPRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = sc.nextInt();
        
        int div = 2;
        while (num > div) {
            if (num % div == 0) {
                System.out.println("NUM ENTERED IS NOT PRIME");
                break;
            }
            else {
                div += 1;
            }
            System.out.println("YOU ENTERED PRIME NUMBER");
            
        
        

        
    }

}
