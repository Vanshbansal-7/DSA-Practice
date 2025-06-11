// A 
// AB
// ABC
// ABCD

import java.util.Scanner;
public class CHARACTER_PAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE THE NUMBER OF LINES:");
        int n=sc.nextInt();
        char ch='A';
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}

