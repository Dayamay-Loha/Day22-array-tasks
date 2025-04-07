import java.util.Scanner;

public class printaToz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[26];
        int n = arr.length;
        // for(int i = 0; i<n; i++){
        //     arr[i] = (char)('a'+i);
        // }

        // user take input as character
        System.out.println("Enter character lower case a to z : ");

        String line = sc.nextLine();
        String[] input = line.split(" ");

        if(input.length != 26){
            System.out.println("You must enter exactly 26 characters !!!");
            return;
        }

        for(int i = 0; i<n; i++){
             arr[i] = input[i].charAt(0);
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
