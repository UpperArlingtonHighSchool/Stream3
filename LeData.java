import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeData{
	public static void main(String[] args) throws FileNotFoundException {
		LeMethod();
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
		for(LeHardness i: LeHard) {
			System.out.println(i);
		}
		return LeHard;

	}
}