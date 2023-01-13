package aulaIwTraining;

public class Ex04 {
    public static void main(String[] args) {
        int[] a = {1, 0, 5, -2, -5, 7};
        int soma = 0;

        soma = a[0] + a[1] + a[5];

        a[4] = 100;

        for (int n :
                a) {
            System.out.println(n);
            ;
        }


    }
}
