package empwage;

public class EmpolyeeWage {
	final static float WAGE_PER_HR=20;
	final static float FULL_DAY_HR=8;
	
	public static void main(String[] args) {
		
		float dailywage;
		double emprandom=Math.floor(Math.random() * 10)%2;
		
		if (emprandom == 1) {
			System.out.println("Employee is present");
			dailywage=WAGE_PER_HR*FULL_DAY_HR;
			System.out.println("Dailywage of the Employee="+dailywage);
		}
		else {
			System.out.println("Employee is absent");
			dailywage=0; 
			System.out.println("Dailywage of the Employee="+dailywage);
		}
		
	}

}
