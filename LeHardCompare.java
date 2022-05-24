import java.util.Comparator;

class LeHardCompare implements Comparator<LeHardness> {
  
    
    public int compare(LeHardness s1, LeHardness s2)
    {
        if (s1.getLeHard() == s2.getLeHard())
            return 0;
        else if (s1.getLeHard() > s2.getLeHard())
            return 1;
        else
            return -1;
    }
}