import java.util.Comparator;

class LePHCompare implements Comparator<LeHardness> {
  
    
    public int compare(LeHardness s1, LeHardness s2)
    {
        if (s1.getLePH() == s2.getLePH())
            return 0;
        else if (s1.getLePH() > s2.getLePH())
            return 1;
        else
            return -1;
    }
}