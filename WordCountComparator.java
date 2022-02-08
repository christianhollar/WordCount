import java.util.*;
/**
 * Comparator to Sort PriorityQueue
 *
 * @ChristianHollar
 * @11/23/20
 */
public class WordCountComparator implements Comparator<WordCount>
{
    
    public int compare(WordCount w1, WordCount w2)
    {
        if(w1.getCount()>w2.getCount())
        return 1;
        if(w1.getCount()<w2.getCount())
        return -1;
        else
        return 0;
    }
}
