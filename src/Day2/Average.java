package Day2;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated metd stub
		Scanner sc= new Scanner(System.in);
		double eng, phy, chem, maths, bio;
		System.out.println("Enter marks of student: ");
	    eng=sc.nextDouble();
	    phy=sc.nextDouble();
	    chem=sc.nextDouble();
	    maths=sc.nextDouble();
	    bio=sc.nextDouble();
	    double summ= (eng+maths+bio+phy+chem);
	    double average=summ/5;
	    System.out.println("The total marks obtained by the students are: "+summ);
	    System.out.println("The average percentage of the student is: "+average);
		
	}

}
