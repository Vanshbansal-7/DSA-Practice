import java.util.*;
public class ELEMENTSEARCH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter num for search: ");
        int target =sc.nextInt();
        for (int i =0;i<size;i++){
            if (arr[i]==target){
                System.out.println("item found at index"+ i);
            }
        }

    }
}