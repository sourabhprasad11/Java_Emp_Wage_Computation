package empwage;

class Emprst{
	
	float WAGE_PER_HR=20;
	float FULL_DAY_HR=8;
	float PART_TIME_HR=4;
	float MONTHLY_DAYS=20;
	float working_day=0;
	float working_hr=0;
	float max_hr=100;
	float num_working_days=20;
	float dailywage;
	float emphr;
	

	void checkval() { 
		while (working_hr <= max_hr && working_day <= num_working_days) {
			working_day++;
			
			double emprandom=Math.floor(Math.random() * 10)%3;
			int emp= (int) emprandom;
			switch (emp){
			case 1:
				emphr=8;
				break;
	
			case 2:
				emphr=4;
				break;
	
			case 0:
				emphr=0;
				break;
	
			default:
				System.out.println("Error");
	
			}
		working_hr=working_hr+emphr;
		}
	float wage=working_hr*WAGE_PER_HR;
	System.out.println("Wages= "+wage);
	}
}

public class EmpolyeeWage {
		
	public static void main(String[] args) {
		
		Emprst e1= new Emprst();
		Emprst e2= new Emprst();
		e1.checkval();
		e2.checkval();
	}
}
