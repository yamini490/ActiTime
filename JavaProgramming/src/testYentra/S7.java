package testYentra;
class S7  
{
	public static void main(String[] args) 
	{
		String str1  = "hello" ; 
		String str2 = "hello"  ; 
		System.out.println( str1 ) ; // hello 
		System.out.println( str2 ) ; // hello 
		System.out.println( str1.equals( str2 )  ) ; // true 
		System.out.println( str1 == str2   ) ; // false 
		System.out.println( str1.hashCode() ) ;
		System.out.println( str2.hashCode() ) ;
	}
}
