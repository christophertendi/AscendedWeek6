import java.util.ArrayList;
public class Ascended
{
    public static void main (String[] args)
    {
        System.out.println(PrimeSearch(1,500));

    }
    public static ArrayList<Integer> PrimeSearch(int start, int end)
    {
        ArrayList<Integer> xList = new ArrayList <Integer>();
        for(int x = start; x < end; x++)
        {
            boolean prime = true;

            int i = 2;
            while(i <= x/2)
            {
                if(x % i == 0)
                {
                    prime = false;
                    break;

                }
                i++;
            }
            if(prime)
            {
                xList.add(x);
            }
        }
        return xList;

    }
}
