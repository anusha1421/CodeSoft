import java.sql.SQLOutput;
import java.util.ArrayList;

public class Simple {
        public static void main(String[] args){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(3);
            list.add(4);
            int sum = 0;
            int avg=0;

            for(int i = 0; i<list.size(); i++){
                sum = sum+list.get(i);
                avg = sum/ list.size();
                System.out.println(avg);

            }


           /*System.out.println(a++);
           System.out.println(a);*/



        }
}
