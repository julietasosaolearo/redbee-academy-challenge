package com.redbee.academy.challenge;

import java.io.*;
import java.util.*;
class arrays
{
	
	static void maximizeTheFirstArray(int[] A, int[] B,int n)
	{
	
	
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		for(int i : A)
		{
			temp1.add(i);
		}
		for(int i:B)
		{
			temp2.add(i);
		}
		Collections.sort(temp1, Collections.reverseOrder());
		Collections.sort(temp2, Collections.reverseOrder());
		
		
		Map<Integer,Integer> m = new HashMap<>();
		int i = 0, j = 0;
		while (m.size() < n)
		{
			if (temp1.get(i) >= temp2.get(j))
			{
				if(m.containsKey(temp1.get(i)))
				{
					m.put(temp1.get(i), m.get(temp1.get(i)) + 1);
				}
				else
				{
					m.put(temp1.get(i), 1);
				}
				i++;
			}
			else
			{
				if(m.containsKey(temp2.get(j)))
				{
					m.put(temp2.get(j), m.get(temp2.get(j)) + 1);
				}
				else
				{
					m.put(temp2.get(j), 1);
				}
				j++;
			}
		}
		

		ArrayList<Integer> res = new ArrayList<Integer>();
		for (i = 0; i < n; i++)
			if (m.containsKey(A[i]))
			res.add(A[i]);
	
		
		for (i = 0; i < n; i++)
			if (m.containsKey(B[i]) && m.get(B[i]) == 1)
			res.add(B[i]);
	
		
		for (i = 0; i < n; i++)
			System.out.print(res.get(i)+" ");
	}
	
	
	public static void main (String[] args)
	{
		int A[] = { 9, 7, 2, 3, 6 };
		int B[] = { 7, 4, 8, 0, 1 };
		int n = A.length;
		maximizeTheFirstArray(A, B, n);
	}
}

