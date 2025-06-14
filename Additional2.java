import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Additional2 {
    /**
     * Q2. Multiplication Table!
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Take a number A as input, print its multiplication table having the first 10 multiples.
     *
     *
     * Problem Constraints
     *
     * 1 <= A <= 1000
     *
     *
     *
     * Input Format
     *
     * First line contains a single integer A.
     *
     *
     *
     * Output Format
     *
     * Print 10 lines, ith line containing ith multiple.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  2
     * Input 2:
     *
     *  3
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  2 * 1 = 2
     *  2 * 2 = 4
     *  2 * 3 = 6
     *  2 * 4 = 8
     *  2 * 5 = 10
     *  2 * 6 = 12
     *  2 * 7 = 14
     *  2 * 8 = 16
     *  2 * 9 = 18
     *  2 * 10 = 20
     * Output 2:
     *
     *  3 * 1 = 3
     *  3 * 2 = 6
     *  3 * 3 = 9
     *  3 * 4 = 12
     *  3 * 5 = 15
     *  3 * 6 = 18
     *  3 * 7 = 21
     *  3 * 8 = 24
     *  3 * 9 = 27
     *  3 * 10 = 30
     *
     *
     * Example Explanation
     *
     * Explanantion 1:
     *
     *  For A = 2, First 10 multiples of 2 are 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
     * Explanation 2:
     *
     *  For A = 3, First 10 multiples of 3 are 3, 6, 9, 12, 15, 18, 21, 24, 27, 30
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        for(int i=1;i<=10;i++)
        {
            System.out.println(A+" * "+i+" = "+A*i);
        }
    }
}
