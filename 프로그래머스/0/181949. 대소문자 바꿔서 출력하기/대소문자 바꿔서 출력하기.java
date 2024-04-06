import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result ="";
        
        for(int i = 0; i<a.length(); i++){
            char temp = a.charAt(i);
            if(Character.isUpperCase(temp)){
                result += Character.toLowerCase(temp);
            }else{
                result += Character.toUpperCase(temp);
            }
                
        }
        System.out.println(result);
    }
}