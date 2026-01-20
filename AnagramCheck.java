import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String: ");
        String str2 = sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("The Strings are Anagrams");
        }
        else{
             System.out.println("The Strings are not Anagrams");
        }

    }
    
}
