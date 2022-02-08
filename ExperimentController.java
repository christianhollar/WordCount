import java.util.*;
import java.io.*;
/**
 * Returns Most Used Words
 *
 * @ChristianHollar
 * @11/23/20
 */
public class ExperimentController
{
    TreeMultiSet t = new TreeMultiSet();
    WordFreqs w;
    public ExperimentController()
    {
        loadIt();
        
        LinkedList<WordCount> mostCommon = w.mostCommon(10);
        for(int i = 0; i<10; i++)
        {
            WordCount w = mostCommon.poll();
            System.out.println("Word is: "+w.getWord()+" Count is: "+w.getCount());
        }
        
        
    }
    /**
     * Loads in file
     * Converst to String
     * Creates TreeMap
     * Add to TreeMap
     * param void
     * return void
     */
    public void loadIt()
    {
        File filename = new File("/Users/christianhollar/Downloads/hamlet.txt");
        TreeMultiSet t = new TreeMultiSet();
        try{
            Scanner s = new Scanner(filename);
            while(s.hasNextLine())
            {
                
                String x = s.next();
                String temp1 = x.replaceAll("./;:,!$%&","");
                String temp2 =temp1.toLowerCase();
                t.add(temp2);
 
            }
            s.close();
        }catch(Exception e)
        {
            System.out.println("Insertion error");
        }
        this.w = new WordFreqs(t);
    }
    
    
}
