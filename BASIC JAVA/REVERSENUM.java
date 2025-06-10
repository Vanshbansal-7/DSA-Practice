import java.util.*;
public class REVERSENUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUM FOR REVERSE:");
        int num=sc.nextInt();
        int result=0;
        int temp;
        do{
            temp=num%10;
            num=num/10;
            result=(result*10)+temp;
        }while (num!=0);
        System.out.println(result);
    }
    
}
