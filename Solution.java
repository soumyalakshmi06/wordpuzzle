package word_Break_Puzzle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	
		 public boolean canBreak(String s, Set<String> wordDict) {
			 
			 int n = s.length();
			 boolean[] dp =new boolean[n+1];
			 
			 dp[0]= true;
			 
			 for (int i =1; i<=n ; i++) {
				 for(int j =0;j<i;j++) {
					 if (dp[j] && wordDict.contains(s.substring(j, i))) {
						 dp[i]=true;
						 break;
					 }
				 }
			 }
			 
			return dp[n];
		    }

		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the String: ");
			
			String s = scanner.nextLine();
			
			System.out.println("Enter the No of wor ds in the dict");
			int dictSize = scanner.nextInt();
			scanner.nextLine();
			
			Set<String>dictWord = new HashSet<>();
			
			System.out.println(" Enter the Dict Words");
			
			for (int i=0;i<dictSize;i++) {
				dictWord.add(scanner.nextLine());
			}
			
			Solution solution = new Solution();
			
			boolean result = solution.canBreak(s, dictWord);
			System.out.println(result);
		}

	

}
