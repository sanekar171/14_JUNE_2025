import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Additional1 {
    /**
     * Q1. Armstrong Numbers!
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
     *
     * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
     *
     * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
     *
     * Note: All the test cases in this problem are limited to 3 digit numbers.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= N <= 500
     *
     *
     *
     * Input Format
     *
     * First and only line of input contains an integer N.
     *
     *
     *
     * Output Format
     *
     * Output all the Armstrong numbers in range [1,N] each in a new line.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  5
     * Input 2:
     *
     *  200
     *
     *
     * Example Output
     *
     * Output 1:
     *
     * 1
     * Output 2:
     *
     * 1
     * 153
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     * 1 is an armstrong number.
     * Explanation 2:
     *
     * 1 and 153 are armstrong number under 200.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int temp,d;
        int sum;
        //since range of inputs=[1,500],int will suffice for the sum

        for(int num=1;num<=N;num++)
        {
            temp=num;
            sum=0;//sum=0 per number
            while(temp>0)
            {
                d=temp%10;
                temp/=10;
                sum+=(int)(Math.pow(d,3));
            }
            if(sum==num)
                System.out.println(num);
        }
    }
}
