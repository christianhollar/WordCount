import java.util.*;
/**
 *TreeMap Multi Set Class
 *
 * @ChristianHollar
 * @11/23/20
 */
public class TreeMultiSet
{
    // Key used to represent words
    // Value used to represent counts
    public TreeMap<String,Integer> values;   
    
    public TreeMultiSet()
    {
        values = new TreeMap();
    }
    /**
     * param void
     * return integer value size of TreeMap
     */
    public int getSize()
    {
        return values.size();
    }
    /**
     * Increases Count if Already Contained
     * Else adds new String to TreeMap
     * 
     * param String
     * return void
     */

    public void add(String key)
    {
        if(values.containsKey(key))
        {
            int index = values.get(key);
            values.replace(key,index++);                       
        }
        else
        {
            values.put(key,1);
        }
    }
    /**
     * Checks if String input is already in TreeMap
     * 
     * param String
     * return boolean
     */
    public boolean contains(String key)
    {
        return values.containsKey(key);
    }
    /**
     * Checks how many times String has been input
     * 
     * param String
     * return integer
     */
    
    public int count(String key)
    {
        return values.get(key);
    }
    /**
     * Removes one count of String input
     * If only one input contained
     * Removed in total
     * 
     * param String
     * return boolean
     */
    public boolean removeOne(String key)
    {
        int index = values.get(key);
        if(index<=1)
        values.remove(key);
        else
        {
            values.replace(key,index-1);
        }
        return true;
    }
    /**
     * Resets Count to Zero and removes key
     * 
     * param String
     * return boolean
     */

    public boolean removeAll(String key)
    {
        values.replace(key,0);
        values.remove(key);
        return !values.containsKey(key);
    }
    /**
     * Inserts arr using add function
     * 
     * param String[]
     * return void
     */
    public void toArray(String[] arr)
    {
        for(String element: arr)
        add(element);
    }
    /**
     * Checks if treeMap is empty
     * param void
     * return boolean
     */
    public boolean empty()
    {
        return values.isEmpty();
    }
    /**
     * Converts TreeMap to PriorityQueue
     * 
     * param void
     * return PriorityQueue<WordCount>
     */
    public PriorityQueue convertPQueue()
    {
        PriorityQueue<WordCount> pQueue = new PriorityQueue<WordCount>(new WordCountComparator());
        for(Map.Entry<String,Integer> entry: values.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            WordCount w = new WordCount(key);
            w.setCount(value);
            pQueue.add(w);
        }
        return pQueue;
    }
    
 
}
