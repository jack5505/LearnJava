import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 *  @A Sabirov Jakhongir
 *
 */
public class Prinsip {
    public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int n;
            n = cin.nextInt();
            HashMap<String,Boolean> positive = new HashMap<>();
            HashMap<String,Boolean> negative = new HashMap<>();
            // System.out.println(n);
            for(int i = 1 ; i <= n ;i ++)
            {
                positive.put(cin.next(),true);
            }
            // System.out.println("exised");
            int x = cin.nextInt();
            for(int i = 1 ; i <= x ;i ++)
            {
                negative.put(cin.next(),true);
            }
            // System.out.println("existed");
            int pos,neg;
            pos = neg = 0;
            int w = cin.nextInt();
            for(int i = 1 ; i <= w ; i ++)
            {
                String s = cin.next();
                if(positive.containsKey(s)){
                 //   System.out.println(s + " Positive");
                    pos++;
                }
                if(negative.containsKey(s)){
                 //   System.out.println(s + " Negative");
                    neg++;
                }
            }

            System.out.println(pos > neg ? "Positive" : (pos == neg ? "Neutral" : "Negative"));
    }
}
