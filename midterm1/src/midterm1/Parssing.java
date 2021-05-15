package midterm1;

public class Parssing {
	 public static void main(String[] args) {  int a = 0; int b = 0;  int[] bArr = new int[1]; bArr[0] = b;  inc1(a); inc2(bArr);  System.out.println("a=" + a + " b=" + b + " bArr[0]=" + bArr[0]);     }     public static void inc1(int x) { x++; }     public static void inc2(int[] x) { x[0]++; } 

	 int[] i[] = new int[][] { { 1, 2 }, { 1 }, {}, { 1, 2, 3 } }; 
	  int i1[] = new int[] {1, 2};
	  int i2[][] = new int[][] { {1, 2, 3}, {4, 5, 6} };
	  int i3[][] = { { 1, 2 }, new int[ 2 ] }; 
	  //int i4[4] = { 1, 2, 3, 4 }; 
	  int[] a = new int[2];
	int b[] = new int[2];
	int[] c[] =  {new int[2]};
}
