import java.util.Scanner;
public class FirstNonRepeatedchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        boolean found = false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;
            for( int j=0;j<str.length();j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count ==1){
                System.out.println("First Non-Repeated Character: "+ ch);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No Non-Repeated Character found");
        }
        sc.close();
    }
    
}
