/*
 *
 *  @A Sabirov Jakhongir
 *
 */
public class Other {
    public static void main(String[] args) {
        int d = 999;
        System.out.println((d % 10) + " " + (d % 100) / 10 + " " + (d % 1000) / 100);
        int cnt = 0;
        int test = 0;
        int different = 0;
        for(int i = 100;i <= 999;i ++)
        {
            test++;
            if(i % 10 == (i % 100) / 10 || (i % 100) / 10 == (i % 1000) / 100  ){
                cnt ++;
                System.out.println(i);
            }else{
                different++;
            }
        }
        // 100
        // 998
        System.out.println("different: "+different);
        System.out.println("total"+test);
        System.out.println(cnt);
        System.out.println(test - cnt);
        // 9 -> 99 -  9 same




    }
}
