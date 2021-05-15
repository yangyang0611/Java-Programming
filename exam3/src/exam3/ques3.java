package exam3;

public class ques3 {	
		public static void main(String[] args) 
		{ 
			if(args.length == 1) {
				if(args[0].length() <=50) {
					int n = args[0].length(); 
					ques3 permutation = new ques3(); 
					permutation.permute(args[0], 0, n - 1);
				}
			} 
			else
				return;
		}

		private void permute(String str, int l, int r) 
		{ 
			if (l == r) 
				System.out.println(str); 
			else { 
				for (int i = l; i <= r; i++) { 
					str = swap(str, i, l); 
					permute(str, l + 1, r); 
					str = swap(str, i, l); 
					str = swap(str, i, l); 
				} 
			} 
		} 

		
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

