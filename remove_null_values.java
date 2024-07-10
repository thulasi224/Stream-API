import java.util.*;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {

       List<String> a1=Arrays.asList("LATHA",null,"thulasi",null,"archana","uday");
        List<String> a2=new ArrayList<>();
        a2=a1.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(a2);
        System.out.println("------");
       a1.stream().filter(n->n!=null).forEach(n->System.out.println(n));

    }
}