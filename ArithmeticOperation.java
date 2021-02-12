import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @AUTHOR SURESH KUMAR
 * @TITLE  ZOHO Problems
 */
 
/**
 *Problem Asked by ZOHO Corporation.
 *
 *Given String with Numbers and operators Performs operations on that numbers in their respective order.
 *Operator Precedence need not be considered.The Input String will have numbers followed by Operators.
 *
 */

/**
 * Test Case
 * ---------------
 * Input: 12345*+-+
 * Output: Explanation[1*2+3-4+5] = 6
 *
 */

public class ArithmeticOperation {
    
    final static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args)throws IOException {
        String s=br.readLine();
      
        //Separate Operator and operand
        String operand=s.substring( 0 , (int)Math.ceil((double) s.length()/2) );
        char[] operator=s.substring((int)Math.ceil((double)s.length()/2)).toCharArray();
       
        //Store first value in the accumulator
        double value=Double.parseDouble(operand.substring(0,1));
        int ind=1;//fetch value from 1'st char not from 0'th char
        
        //Process
        for(char c:operator){
            double next = Double.parseDouble(operand.charAt(ind++)+"");
            switch(c){
                case '+':value+=next;
                            break;
                case '-':value-=next;
                    break;
                case '*':value*=next;
                    break;
                case '/':value/=next;
                    break;
                default:
                    System.err.println("Invalid Operator "+c);
            }
        }
        System.out.println(value);
    }
}
