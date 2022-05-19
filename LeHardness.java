
public class LeHardness {
	String LeName;
	String LeDate;
	double LePH;
	double LeHard;

	public LeHardness(String LeName, String LeDate, double LePH, double LeHard) {
		this.LeName = LeName;
		this.LeDate = LeDate;
		this.LePH = LePH;
		this.LeHard = LeHard;
	}
	
	public String getLeName() {
		return LeName;
	}
	public String getLeDate() {
		return LeDate;
	}
	public double getLePH() {
		return LePH;
	}
	public double getLeHard(){
		return LeHard;
	}
	public String toString() {
		return "Name: " + getLeName() + " Date: " + getLeDate() + " PH: " + getLePH() + " Hardness: " + getLeHard();
	}

	
}
