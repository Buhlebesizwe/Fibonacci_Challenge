
package fibonnacci_challenge;


public class Fibonnacci_Challenge {

    
    public static void main(String[] args) {
        int num1 =0, num2 = 1, num3;
        
        for (int i = 0; i < 12; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3+", ");
            
        }
    }   
}
