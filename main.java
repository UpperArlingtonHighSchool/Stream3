public class streamProj

{
public static void main(String[] args) throws FileNotFoundException
{
//call TJ's data method
LeData default = new LeData();
ArrayList <LeHardness> uaData = default.LeMethod();

//call Jim's data method
WebScraper jData = new Webscraper();
ArrayList <Integer> jData = jData.hardness();

//input data into Ceci's charts

//run GUI to display charts and data
 JFrame frame = new JFrame("Input Dialog");

 //for loop to display TJ's data
  uaString = "";
 for(int x = 0, x < uaData.length() ,x++)
 {
  uaString += uaData.get(x).toString()) + "\n";
 }
  JOptionPane.showMessageDialog(frame, "Hardness and pH data from UA streams\n" + uaString);
  
}
  
 //for loop to display Jim's data
  jString = "";
  for(int y = 0, y < jData.length(), y++)
  {
   jString += jData.get(x).hardness() + " ";
  }
  
   JOptionPane.showMessageDialog(frame, "Hardness data from Ohio streams\n" + jString);
}
