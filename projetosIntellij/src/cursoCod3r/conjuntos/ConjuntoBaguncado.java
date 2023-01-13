package cursoCod3r.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.4);
        conjunto.add(true);
        conjunto.add(4);
        conjunto.add("texto");
        conjunto.add('d');

        System.out.println("Tamanho é: "+conjunto.size());

        conjunto.add(4);
        conjunto.add("texto");

        System.out.println("Tamanho é: "+conjunto.size());

        System.out.println(conjunto.remove('s'));
        System.out.println(conjunto.remove('d'));

        System.out.println("Tamanho é: "+conjunto.size());

        System.out.println(conjunto.contains('d'));
        System.out.println(conjunto.contains(4));



        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);
        System.out.println(conjunto);

//        System.out.println(conjunto.addAll(nums));//União entre dois conjuntos
//        System.out.println(conjunto);

        System.out.println(conjunto.retainAll(nums));//Intercessão entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }

}
