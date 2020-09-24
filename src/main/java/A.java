import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 *  @A Tony Stark
 *
 */
public class A {

    public static void main(String[] args)
    {
     List<Integer> list =   createElements();
     printAll(list);
     List<Long> list1 = new ArrayList<>();
     list1.add((long) 32);
     list1.add((long) 324);
     list1.add((long) 31);
     printAll(list1);


    }

    private static void printAll(List<? extends Number> list)
    {
        System.out.println("Here we come");
        for(Number integer : list)
        {
            System.out.print(integer + " ");
        }

    }

    private static List<Integer> createElements() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(21);
        list.add(234);
        return list;
    }


}
