import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @AUTHOR Suresh
 * @TITLE  ZOHO Problems
 */

/**
 * Problem Asked by ZOHO Corporation.
 *
 * Write a program to print a snake matrix without using Arrays and if
 */

/**
 * Note:
 * ~ tilde is used to denote the spaces
 * | Bitwise OR is used for visualize the number
 */

public class Problem1 {
    final static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        int n=Integer.parseInt(br.readLine());
        int spaces=n-1;
        int value=0;
        int sign=1;
        String spaceChar="~",separator="|";
        for(int i=0;i<n;i++){
            int front,center,back;
            
            //For Front Spaces
            front=0;
            for(;front<spaces-i;front++){
                System.out.print(spaceChar);
            }
            //For Values
            center=front;
            for(;center<front+n;center++){
                value+=sign;
                System.out.print(value+separator);
            }
            //For Back Spaces
            back=center;
            for(;back<n*2-1;back++){
                System.out.print("~");
            }
            //Change Signature and values
            value+=n+sign;
            sign=-sign;
            System.out.println();
        }

    }
}
