package main;

public class LevenshteinDistance {
	public static int distance(String a, String b)
	{
		int m = a.length();
		int n = b.length();
		
		if(m==0) return n;
		if(n==0) return m;
		
		int[][] distance = new int[m+1][n+1];
		
		for(int i=0; i<m; i++)
			distance[i][0] = i;
		for(int j=0; j<n; j++)
			distance[0][j] = j;
		
		// Solving subproblems
		for(int i=1; i<m+1; i++)
		{
			for(int j=1; j<n+1; j++)
			{
				int cost = a.charAt(i-1) == b.charAt(j-1) ? 0 : 1;
				distance[i][j] = Math.min(Math.min(distance[i-1][j]+1, distance[i][j-1]+1), distance[i-1][j-1]+cost);
				
				if(j>1 && i>1 && a.charAt(i-1) == b.charAt(j-2) && a.charAt(i-2) == b.charAt(j-1))
				{
					distance[i][j] = Math.min(distance[i][j], distance[i-2][j-2]+cost);
				}
			}
		}
		// Return value has to be the value of the last element
		return distance[m][n];
	}
	
	
	// Testing 
	public static void main(String[] args)
	{
		String s1 = "Petar";
		String s2 = "Postar";
		System.out.println("Distance between " +"\"" + s1 +"\"" + " and "+"\"" + s2+"\"" +" is: " + distance(s1,s2));
		
	}
}
