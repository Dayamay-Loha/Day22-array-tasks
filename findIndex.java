import java.util.Scanner;

public class findIndex {

    public static int findIndexOfAnelement(int[] arr, int n, int target){

        int index = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                index = i;
                return index;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements : ");
        int target = sc.nextInt();

        System.out.println(findIndexOfAnelement(arr, n, target));
    }
}
