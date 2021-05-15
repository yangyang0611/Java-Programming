package fianl2;

public class ques3 {	
	// Java program to print all permutations of a 
	// given string. 
		public static void main(String[] args) 
		{ 
			//String str = "ABC"; 
			if(args.length ==1) {
				if(args[0].length() <=50) {
					int n = args[0].length(); 
					ques3 permutation = new ques3(); 
					permutation.permute(args[0], 0, n - 1);
				}
			} 
			else
				return;
		}

		/** 
		* permutation function 
		* @param str string to calculate permutation for 
		* @param l starting index 
		* @param r end index 
		*/
		private void permute(String str, int l, int r) 
		{ 
			if (l == r) 
				System.out.println(str); 
			else { 
				for (int i = l; i <= r; i++) { 
					str = swap(str, l, i); 
					permute(str, l + 1, r); 
					str = swap(str, l, i); 
				} 
			} 
		} 

		/** 
		* Swap Characters at position 
		* @param a string value 
		* @param i position 1 
		* @param j position 2 
		* @return swapped string 
		*/
		public String swap(String a, int i, int j) 
		{ 
			char temp; 
			char[] charArray = a.toCharArray(); 
			temp = charArray[i]; 
			charArray[i] = charArray[j]; 
			charArray[j] = temp; 
			return String.valueOf(charArray); 
		} 
	} 

	// This code is contributed by Mihir Joshi 

