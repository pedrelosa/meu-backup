package aulaIwTraining;

public class Ex07 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random()*19+1);
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = (int) Math.pow(a[i], 2);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("O quadrado de " + a[i] + " é: " + b[i]);
        }

    }
}
