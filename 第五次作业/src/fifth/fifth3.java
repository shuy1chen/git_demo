package fifth;

public class fifth3 {
	  public static int[][] matrix(int a[][], int b[][]) {
	       
	        if (a[0].length != b.length)
	            return null;
	      
	        int y = a.length;
	        int x = b[0].length;
	        int c[][] = new int[y][x];
	        for (int i = 0; i < y; i++)
	            for (int j = 0; j < x; j++)
	                
	                for (int k = 0; k < b.length; k++)
	                    c[i][j] += a[i][k] * b[k][j];
	        return c;
	    
	  }
	  public static void main(String[] args) {
		
	}
}
