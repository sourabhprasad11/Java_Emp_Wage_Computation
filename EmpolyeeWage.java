package empwage;

public class EmpolyeeWage {

	public static void main(String[] args) {
		double emprandom=Math.floor(Math.random() * 10)%2;
		System.out.println(emprandom);
		if (emprandom == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}
