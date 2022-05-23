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

//run GUI to display charts, data, and stats

}
}
