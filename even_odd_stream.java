import java.util.*;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {
       ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
       a.add(10);
       a.add(14);
       a.add(15);
       a.add(52);
       a.add(19);
       for(int n1:a){
           if(n1%2==0){
               num.add(n1);
              
           }
           System.out.println(num);
       }
        // using stream api
        //even number
       List<Integer> a1=Arrays.asList(12,11,24,78,45);
       a1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        //odd number
        a1.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));
    }
}