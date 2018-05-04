package Chapter1.Chapter1_2;
//仿照Date来一个SmartDate
//referring to src from https://github.com/jimmysuncpt/Algorithms.git Thanks!
public class SmartDate {
	private final int month;
	private final int day;
	private final int year;
	
	public SmartDate(int m, int d, int y)
	{
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(d>0 && d<=31)
			{
				month = m;
				day = d;
				year = y;
			}
			else
				throw new IllegalArgumentException("IllegalDate");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(d>0 && d<=30)
			{
				month = m;
				day = d;
				year = y;		
			}
			else
				throw new IllegalArgumentException("IllegalDate");
			break;
		case 2:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) 
			{
				if(d>0 && d<=29)
				{
					month = m;
					day = d;
					year = y;	
				}
				else
					throw new IllegalArgumentException("IllegalDate");

			}
			else
			{
				if(d>0 && d<=28)
				{
					month = m;
					day = d;
					year = y;	
				}
				else
					throw new IllegalArgumentException("IllegalDate");
			
			}
			break;
		default:
			throw new IllegalArgumentException("IllegalDate");
	
		}
	}
	
	public int month()
	{return month;}
	
	public int day()
	{return day;}
	
	public int year()
	{return year;}
	

	public String toString()
	{
		return month() + "/" + day() + "/" + year();
	}
	
	public boolean equals(Object x)
	{
		if (this == x) return true;
		if (x == null) return false;
		if( this.getClass() != x.getClass()) return false;
		SmartDate that = (SmartDate) x;
		if (this.day!= that.day) return false;
		if (this.month != that.month) return false;
		if (this.year != that.year) return false;
		return true;
	}
	
	public String dayOfTheWeek()  //returns which day of the week of that date.
	{
		int m = month;
		int d = day;
		int y = year;
		if (m < 3) {
            m += 12;
            --y;
        }
        int w = (d + 1 + 2 * m + 3 * (m + 1) / 5 + y + (y >> 2) - y / 100 + y / 400) % 7;
        switch(w)
        {
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        default: return "Sunday";
        }
		
	}
	
	public static void main(String[] args)
	{
		SmartDate sDate = new SmartDate(5, 26, 2008);
		System.out.println(sDate.month);
		System.out.println(sDate.dayOfTheWeek());
		
		
	}
	

}
