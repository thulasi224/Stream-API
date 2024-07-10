package pack;

import java.util.*;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {

       List<String> a1=Arrays.asList("GEETHA","SEETHA","TINA","MINA","LATHA","thulasi","archana","uday");
       a1.stream().filter(n->n.length()>=2 && n.length()<=3).forEach(n->System.out.println(n));

    }
}