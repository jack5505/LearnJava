import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 *
 *  @A Sabirov Jakhongir
 *
 */
public class CollectionUtils {
    public static<T extends Comparable>  T findMax(List<T> list)
    {
        T max = list.get(0);
        for(T i : list){
            if(max.compareTo(i)  < 0){
                max = i;
            }
        }
        return  max;
    }

    public void start(){
        List<? extends Number> list = new ArrayList<>();
        List<? super   Number> list1 = new ArrayList<>();
        List<? super   Number> list2 = new ArrayList<>();
        list1.add(32);
        list1.add(3.32);
    }




    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,4235,436,13);

        List<SuperPerson> list1 = Arrays.asList(
                new SuperPerson("Jack",23),
                new SuperPerson("Salom",12),
                new SuperPerson("Anvar",12),
                new SuperPerson("Telegram bot",12)
        );
        
        System.out.println(findMax(list));




    }

}
