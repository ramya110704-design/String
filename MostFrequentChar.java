import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        int maxcount=0;
        char mostFrequent=' ';
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                mostFrequent = ch;
            }
        }
        System.out.println("Most Frequent character: "+ mostFrequent);
        System.out.println("Frequency: "+ maxcount);
        sc.close();
    }
    
}
