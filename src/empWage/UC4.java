package empWage;

import java.util.Random;

public class UC4 {
	static int random(){
		Random ran = new Random();
		int i = ran.nextInt(3)+1;
		return i;
	}

	static String attendence(){
		String att;
		switch (random) {
		case 1:
			att = "Present";
			break;
		case 2:
			att = "attended Partime";
			break;
		default:
			att = "Absent";
		}
		return att;
	}
	static int hours(){
		int emphrs;
		switch (random){
		case 1 :
			emphrs =8;
			break;
		case 2 :
			emphrs =4;
			break;
		default:
			emphrs=0;
			break;
		}
		return emphrs;
	}

	static int total_wage(){
		int total_wage=hours()*wage_per_hour;
		return total_wage;
	}


	public static final int random = random();
	public static int wage_per_hour =20;

	public static void main(String[] args){
		System.out.println("Employee is "+attendence());
		System.out.println("The total wage of employee is "+total_wage());

	}
}
