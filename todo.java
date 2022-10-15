import java.util.*;
class week{
	void work()

	{System.out.println("Days are auto-fed, use commas and enter for feed");}
}	
	//MONDAY
	class monday extends week
	{
		void day1() {
		
		Scanner ob= new Scanner(System.in);
		String m1 = ob.nextLine();
		System.out.println("Tasks for monday- "+m1);

	}
	}
	// TUESDY
	class tuesday extends week
	{
		void day2() {
		
		Scanner ob= new Scanner(System.in);
		String t1 = ob.nextLine();
		System.out.println("Tasks for tuesday- "+t1);

	}
	}
	// wedd
	class wednesday extends week
	{
		void day3() {
		
		Scanner ob= new Scanner(System.in);
		String w1 = ob.nextLine();
		System.out.println("Tasks for wednesday- "+w1);

	}
	}
	// thursday 
	class thursday extends week
	{
		void day4() {
		
		Scanner ob= new Scanner(System.in);
		String th1 = ob.nextLine();
		System.out.println("Tasks for thurday- "+th1);

	}
	}
	//friday
	class friday extends week
	{
		void day5() {
		
		Scanner ob= new Scanner(System.in);
		String f1 = ob.nextLine();
		System.out.println("Tasks for friday- "+f1);

	}
	}

public class todo {
	public static void main(String args[])
	{
		System.out.println("Enter your tasks for the week");
		monday m = new monday();
		m.work();
		m.day1();
		
		
		tuesday t = new tuesday();
		t.day2();
		wednesday w = new wednesday();
		w.day3();
		
		thursday thur = new thursday();
		thur.day4();
		
		friday f = new friday();
		f.day5();
		
			
		
		
	}
}
