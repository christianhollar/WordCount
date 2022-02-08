import java.util.*;
/**
 * Creates a PriorityQueue and LinkedList from TreeMultiSet
 *
 * @ChristianHollar
 * @11/23/20
 */
public class WordFreqs extends PriorityQueue<WordCount>
{
    PriorityQueue<WordCount> p = new PriorityQueue<WordCount>(new WordCountComparator());

    /**
     * Creates PriorityQueue using TreeMultiSet function
     * 
     */
    public WordFreqs(TreeMultiSet values)
    {
        PriorityQueue<WordCount> pQueue = values.convertPQueue();
        this.p = pQueue;  
    }

    /**
     * Prints top n elements from priorityQueue
     *
     * @param  integer 
     * @return  LinkedList<WordCount
     */
    public LinkedList<WordCount> mostCommon(int n)
    {
        LinkedList<WordCount> l = new LinkedList<WordCount>();
        for(int i = 0; i<p.size(); i++)
        {
            WordCount temp = p.poll();
            l.add(temp);
        }
        return l;
    }
   
}
