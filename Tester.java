import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner fin = null;
		ArrayList<Student> student = new ArrayList<>();
		double mAvg = 0; int countF = 0; int fTotal = 0; int countFA = 0; int countFB = 0; int countFC = 0; int countFD = 0; int countFF = 0;
		double fAvg = 0; int countM = 0; int mTotal = 0; int countMA = 0; int countMB = 0; int countMC = 0; int countMD = 0; int countMF = 0;
		try{
			fin = new Scanner(new File("HW2Student.txt"));
			fin.nextLine();
			while (fin.hasNextLine()){
				Student s = new Student(fin);
				student.add(s);
				if (s.getGender().equals ("Male")){
					countM++;
					mTotal += s.getAvg();
				}
				if (s.getGender().equals ("Female")){
					countF++;
					fTotal += s.getAvg();
				}
				if (s.getGender().equals("Female") && s.getAvg() >= 90){
					countFA++;
				}
				if (s.getGender().equals("Female") && s.getAvg() >= 80){
					countFB++;
				}
				if (s.getGender().equals("Female") && s.getAvg() >= 70){
					countFC++;
				}
				if (s.getGender().equals("Female") && s.getAvg() >= 60){
					countFD++;
				}
				if (s.getGender().equals("Female") && s.getAvg() < 60){
					countFF++;
				}
				if (s.getGender().equals("Male") && s.getAvg() >= 90){
					countMA++;
				}
				if (s.getGender().equals("Male") && s.getAvg() >= 80){
					countMB++;
				}
				if (s.getGender().equals("Male") && s.getAvg() >= 70){
					countMC++;
				}
				if (s.getGender().equals("Male") && s.getAvg() >= 60){
					countMD++;	
				}
				if (s.getGender().equals("Male") && s.getAvg() < 60){
					countMF++;
				}
			}
			mAvg = mTotal / countM;
			fAvg = fTotal / countF;
			System.out.println("Grade       Men     Women");
			System.out.println("-----       ---     -----");
			System.out.println("A           " + countMA + "      " + countFA);
			System.out.println("B           " + countMB + "     " + countFB);
			System.out.println("C           " + countMC + "     " + countFC);
			System.out.println("D           " + countMD + "     " + countFD);
			System.out.println("F           " + countMF + "     " + countFF);
			System.out.println("\nAverage:  " + mAvg + "     " + fAvg);
			//System.out.println("Men\n" + "---\n" + countMA + "\n" + countMB + "\n" + countMC + "\n" + countMD + "\n" + countMF + "\n" + mAvg);
				//for (int i = 0; i < student.size(); i++){
					//System.out.println(student.get(i));
				//}
			
				
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			try{ fin.close();} catch (Exception e) {}
		}

	}

}
