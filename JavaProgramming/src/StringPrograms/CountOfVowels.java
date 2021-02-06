package StringPrograms;

import java.util.HashMap;

public class CountOfVowels {

	public static void main(String[] args) {
		String str="i live in bangalore";
	char[]	ch=str.toCharArray();
	int aCount=0, eCount=0, iCount=0, oCount=0, uCount=0;

HashMap<Character, Integer> hm=new HashMap<>();
hm.put('a', aCount );
hm.put('e', eCount );
hm.put('i', iCount );
hm.put('o', oCount );
hm.put('u', uCount );


for(int i=0; i<ch.length ; i++)
{
	switch(ch[i])
	{
	case 'a':
		aCount++;
		hm.put('a', aCount);
	case 'e' :
		eCount++;
		hm.put('e', eCount);
	case 'i':
		iCount++;
		hm.put('i', iCount);
	case 'o' :
		oCount++;
		hm.put('o', oCount);
	case 'u':
		uCount++;
		hm.put('u', uCount);
	}	
}

System.out.println(hm);

//	System.out.println("a " + aCount);
//	System.out.println("e " + eCount);
//	System.out.println("i " + iCount);
//	System.out.println("o " + oCount);
//	System.out.println("u " + uCount);
	
	
	}

}
