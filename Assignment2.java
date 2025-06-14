import java.io.*;

public class Assignment2 {
    /**
     * Q2. Is It Perfect?
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Given the Number of Test Cases as T,
     * For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.
     *
     * A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
     * A positive proper divisor divides a number without leaving any remainder.
     *
     *
     * Problem Constraints
     *
     * 1 <= T <= 10
     * 1 <= N <= 106
     *
     *
     * Input Format
     *
     * The first line of the input contains a single integer T.
     * Each of the next T lines contains a single integer N.
     *
     *
     * Output Format
     *
     * For each testcase, print YES if the given integer is perfect, else print NO, in a separate line
     *
     *
     * Example Input
     *
     * Input 1:
     * 2
     * 4
     * 6
     * Input 2:
     * 1
     * 3
     *
     *
     * Example Output
     *
     * Output 1:
     * NO
     * YES
     * Output 2:
     * NO
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     * For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
     * For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
     * Explanation 2:
     * For the first test case A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3.
     */
    public static void main(String[] args) throws IOException {
        //REVIEW
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N;
        int sum;

        for(int i=1;i<=T;i++)
        {
            N=Integer.parseInt(br.readLine());
            sum=0;//sum=0 per num

            for(int div=1;div<N;div++)
            {
                if(N%div==0)
                {
                    sum+=div;
                }
            }
            if(N==sum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
