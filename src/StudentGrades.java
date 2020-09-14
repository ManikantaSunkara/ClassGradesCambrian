import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentGrades {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter student name");

		BufferedReader reader =  
				new BufferedReader(new InputStreamReader(System.in));
		String input =   reader.readLine();


		System.out.println("Enter grade ");
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		String input1 =   reader1.readLine();
		double dnum = Double.parseDouble(input1);

		String grade =  getStudentGrade(dnum);

		System.out.println(grade);

	}

	private static String getStudentGrade(double dnum) {

		if(dnum>=80 && dnum<=100)

			return  " The letter grade for " + dnum+ "% is A";

		if(dnum <=79.9 && dnum>=70)

			return " The letter grade for \" + dnum+ \"% is B";


		if(dnum<=69.9 && dnum>=60)

			return " The letter grade for \" + dnum+ \"% is C";

		if(dnum<=59.9 && dnum>=50)

			return " The letter grade for \" + dnum+ \"% is D";

		 else if (dnum <0 | dnum >100)
		{
			return "Please enter values from 0 to 100";
		}
		return "F";

	}

}
