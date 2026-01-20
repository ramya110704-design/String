import java.util.Scanner;
public class LongSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        int maxlength = 0;
        for(int i=0;i<s.length();i++){
            String current ="";
            for(int j=i;j < s.length(); j++){
                char ch = s.charAt(j);
                if(current.indexOf(ch)!=-1){
                    break;
                }
                current = current + ch;
                if(current.length() > maxlength){
                    maxlength = current.length();
                }
            }
        }
        System.out.println("Longest Substring length:"+ maxlength);
        sc.close();
    }
    
}
