import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3 {
    /**
     * Q3. Summation Game
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
     *
     *
     * Problem Constraints
     *
     * 1 <= N <= 1000
     *
     *
     *
     * Input Format
     *
     * A single line representing N
     *
     *
     *
     * Output Format
     *
     * A single integer showing sum of all Natural numbers from 1 to N
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *
     * 5
     * Input 2:
     *
     *
     * 10
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *
     * 15
     * Output 2:
     *
     * 55
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
