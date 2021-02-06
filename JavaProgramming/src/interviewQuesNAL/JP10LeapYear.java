package interviewQuesNAL;

// Leap number - divisible by 4 for all the century years -- ending with 00.
// century year is leap year only when its perfectly divisible by 400.
// 1900 is not leap year because it not divisible by 4
//2012 is leap yr
public class JP10LeapYear {

	public static void main(String[] args) {

		int year = 2012;

		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			}
			else { // if it is not century year then it is leap yr
				leap=true;
			}
		}
		else
		{
			leap=false;
		}
if(leap)
{
	System.out.println("leap yr:"+ year);
	
}
else
{
	System.out.println(" not a leap yr :" + year);
}
	}
	

}
