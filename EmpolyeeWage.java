package empwage;

public class EmpolyeeWage {
	final static float WAGE_PER_HR=20;
	final static float FULL_DAY_HR=8;
	final static float PART_TIME_HR=4;
	final static float MONTHLY_DAYS=20;
	
	public static void main(String[] args) {
		
		float dailywage;
		double emprandom=Math.floor(Math.random() * 10)%3;
		int emp= (int) emprandom;
		
		switch (emp){
		case 1:
			System.out.println("Employee is Full time present");
			dailywage=WAGE_PER_HR*FULL_DAY_HR*MONTHLY_DAYS;
			System.out.println("Dailywage of the Employee= "+dailywage);
			break;
		
		case 2:
			System.out.println("Employee is Part time Present");
			dailywage=WAGE_PER_HR*PART_TIME_HR*MONTHLY_DAYS;
			System.out.println("Part time wages of the Employee= "+dailywage);
			break;
		
		case 0:
			System.out.println("Employee is absent");
			dailywage=0; 
			System.out.println("Dailywage of the Employee= "+dailywage);
			break;
		
		default:
			System.out.println("Error");
		}
		
	}
}
