package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class DictionaryWords {
	
	@Test
	public void test1()
	{
		String s = "leetcode";		
		List<String> wordList = Arrays.asList("leet", "code");
		System.out.println(wordBreak(s,wordList));
	}
	@Test
	public void Test2() {
		String s = "applepenapple";
		List<String> wordList = Arrays.asList("apple", "pen");
		System.out.println(wordBreak(s,wordList));
	}

	@Test
	public void Test3() {
		String s = "catsandog";
		List<String> wordList = Arrays.asList("cats", "dog", "sand", "and", "cat");
		System.out.println(wordBreak(s,wordList));
	}
	
	
	/*assign the dictionary lists in hash set list 
	 *  get the each string permutation and compare with the set	 *  
	 *  if it contains get the substring of the word and set the  word flag as true
	 * 
	 * 
	 */
	

	 public boolean wordBreak(String s, List<String> wordList) {
	        boolean[] dp = new boolean[s.length() + 1];
	        Set<String> set = new HashSet<>();
	        for (String word : wordList) {
	            set.add(word);
	        }
	        dp[0] = true;
	        for (int i = 0; i <= s.length(); i++) {
	            for (int j = 0; j < i; j++) {
	                if (dp[j] && set.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }
	        return dp[s.length()];
	    }
	 
	 
	 
}
