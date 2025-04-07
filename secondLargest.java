import java.util.Scanner;

public class secondLargest {

    public static int secondLarge(int[] arr){

        int firstLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLarge){
                firstLarge = arr[i];
            }
        }

        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secLarge && arr[i]!=firstLarge){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLarge(arr));
    }
}
