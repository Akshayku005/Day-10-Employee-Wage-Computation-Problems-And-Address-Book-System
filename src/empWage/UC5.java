package empWage;

import java.util.Random;

public class UC5 {
	static int random(){
        Random ran = new Random();
        int i = ran.nextInt(1)+1;
        return i;
    }

    static String attendence(){
        String att;
        switch (random) {
            case 1:
                att = "Present";
                break;
            default:
                att = "Absent";
        }
        return att;
}
    static int days(){
        while (days <= 19) {
        switch (random) {
                case 1:
                    days++;
                    break;
                default:
                    break;
            }
        }
        return days;
    }

    static int total_wage(){
        int total_wage=0;
            total_wage = days() * wage_per_hour*emphrs;
        return total_wage;
    }


    public static final int random = random();
    public static int wage_per_hour =20;
    public static int emphrs =8;
    static int days=0;

    public static void main(String[] args){
        System.out.println("No of days Employee Present is "+days());
        System.out.println("The total wage of employee is "+total_wage());

    }
}
