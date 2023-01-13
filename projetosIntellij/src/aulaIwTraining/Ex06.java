package aulaIwTraining;

public class Ex06 {
    public static void main(String[] args) {
        int[] numeros = {5,6,8,3,4};
        int cach=0;

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]<numeros[i]){
                    cach = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = cach;
                }
            }
        }

        for (int n :
                numeros) {
            System.out.println(n);
        }

    }
}
