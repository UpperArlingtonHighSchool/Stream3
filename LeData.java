import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeData{
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(LeStats());
	}

	public static ArrayList<LeHardness> LeMethod() throws FileNotFoundException {

		Scanner LeIn = new Scanner(System.in);
		File LeFile = new File("src/AllTheDataCorrected.txt");
		LeIn = new Scanner(LeFile);
		ArrayList<LeHardness> LeHard = new ArrayList<LeHardness>();
		while (LeIn.hasNextLine()) {
			String LeLine = LeIn.nextLine();
			String[] LeStrArr = LeLine.split(" ");
			LeHard.add(new LeHardness(LeStrArr[0], LeStrArr[1], Double.parseDouble(LeStrArr[12]), Double.parseDouble(LeStrArr[8])));

		}
		
		return LeHard;

	}
	public static String LeStats() throws FileNotFoundException {
		ArrayList<LeHardness> LeHard = LeMethod();
		double[] a = LeRangePH(LeHard);
		double[] b = LeRangeHard(LeHard);
		for(LeHardness i : LeHard) {
			System.out.println(i);
		}
		String LeString = "";
		LeString += "\n	Average PH: " + LeAveragePH(LeHard);
		LeString +="\nAverage Hard: " + LeAverageHard(LeHard);
		LeString +="\nThe Largest PH in the data set is: " + a[1] + " and the smallest is " + a[0] ;
		LeString +="\nThe Largest Hardness in the data set is: " + b[1] + " and the smallest is " + b[0] ;
		return LeString;
	}
	public static double LeAveragePH(ArrayList<LeHardness> LeList){
		double count = 0;
		for(LeHardness i : LeList) {
			count += i.getLePH();
		}
		return count/LeList.size();
	}
	public static double LeAverageHard(ArrayList<LeHardness> LeList){
		double count = 0;
		for(LeHardness i : LeList) {
			count += i.getLeHard();
		}
		return count/LeList.size();
	}
	public static double[] LeRangePH(ArrayList<LeHardness> LeList) {
		Collections.sort(LeList, new LePHCompare());
		double[] a = {LeList.get(0).getLePH(), LeList.get(LeList.size()-1).getLePH()};
		return a;
	}
	public static double[] LeRangeHard(ArrayList<LeHardness> LeList) {
		Collections.sort(LeList, new LeHardCompare());
		double[] a = {LeList.get(0).getLeHard(), LeList.get(LeList.size()-1).getLeHard()};
		return a;
	}
}