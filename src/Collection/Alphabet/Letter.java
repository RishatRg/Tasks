package Collection.Alphabet;

/**
 * Created by RishatRg on 18.11.2017.
 */
public class Letter implements Comparable<Letter>
{
    char n;
    int count;

    public Letter(char n, int count) {
        this.n = n;
        this.count = count;
    }

    public char getN() {
        return n;
    }

    public void setN(char n) {
        this.n = n;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Буква :" +n +" число вхождений: " + count;
    }

    public int compareTo(Letter any)
    {return any.n>n ? -1 :any.n<n ? 1 : 0;
    }
}
