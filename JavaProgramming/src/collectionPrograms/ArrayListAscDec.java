package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListAscDec {

	public static void main(String[] args) {
		int[] arr= { 10, 3, 20, 5, 22, 7,10, 3, 20, 5,};
		ArrayList<Integer> al=new ArrayList<>();
		HashSet<Integer>  hs=new HashSet<>();
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0; i< arr.length ; i++)
		{
			al.add(arr[i]);
		}
		Collections.sort(al);
		System.out.println(" Ascending Order :" + al);
		Collections.reverse(al);
		System.out.println("Decending Order : " + al);
	
		for(int k : al)
		{
			if(k%2==0)
			{
				hs.add(k);
			}
			else
				ts.add(k);
		}
	
		System.out.println(hs);
		System.out.println(ts);
		
	}

}
