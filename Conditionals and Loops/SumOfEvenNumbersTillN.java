import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0, sum = 0;
        while(i <= N)
        {
            sum = sum + i;
            i = i + 2;
        }
		System.out.println(sum);
	}

}
