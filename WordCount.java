
/**
 * WordCount holds a word and its indvidual count
 *
 * @ChristianHollar
 * @11/23/20
 */
public class WordCount
{
    int count;
    String word;

    public WordCount(String word)
    {
        this.word = word;
        this.count=1;
    }
    
    public String getWord()
    {
        return this.word;
    }
    
    public int getCount()
    {
        return this.count;
    }
    
    public void setCount(int count)
    {
        this.count = count;
    }
    
}
