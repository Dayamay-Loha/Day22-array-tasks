import java.util.Scanner;

public class thirdSmallest {

    public static int thirdSmall(int[] arr){
        int firstSmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<firstSmall){
                firstSmall = arr[i];
            }
        }

        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<secondSmall && arr[i] != firstSmall){
                secondSmall = arr[i];
            }
        }

        int tSmall = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<tSmall &&  arr[i] != secondSmall){
                if(arr[i] != firstSmall){
                    tSmall = arr[i];
                }
            }
        }

        return tSmall;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(thirdSmall(arr));
    }
}
