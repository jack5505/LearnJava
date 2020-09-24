// import org.graalvm.compiler.lir.LIR;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    static long n , k;
    static long binar(long l , long r){
        if(l == r){
            return l;
        }
        long m = (l + r) / 2;
        if(m - m / n >= k) return binar(l,m);
        return binar(m + 1, r);
    }

    public static void main(String[] args) {
            //Person person = new Person("Alex",35);
            //Person alex = new SuperPerson("Alex",35,"Bob");
            //System.out.println(person.equals(alex));
            int d = 9999;
            System.out.println(d % 10 + " " + (d % 100)/10 + " " + (d % 1000)/100 + " " + (d % 10000)/1000);
            int cnt = 0;
            int test = 0;
            for(int i = 1000;i <= d;i ++)
            {
                test++;
                if(i % 10 == (i % 100) / 10 || (i % 100) / 10 == (i % 1000) / 100 || (i % 1000)/100 == (i % 10000)/1000){
                        cnt ++;
                        System.out.println(i);
                }
            }
        System.out.println("total"+test);
        System.out.println(cnt);
        System.out.println(test - cnt);
    }
}
