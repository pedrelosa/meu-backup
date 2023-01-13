package aulaIwTraining;

public class Ex01 {

    public static void main(String[] args) {
        double[] altura = new double[15];
        double menorAltura = 0, maiorAltura = 0;

        for (Integer i = 1; i < 5; i++) {
            altura[i-1] = EntradaESaidaGrafico.converssaoDouble(0,3,"qual a altura da pessoa " + i.toString());
            if (menorAltura == 0) menorAltura = altura[i-1];

            if(altura[i-1] < menorAltura) menorAltura = altura[i-1];

            if(altura[i-1]> maiorAltura) maiorAltura = altura[i-1];
        }


        System.out.println(menorAltura);
        System.out.println(maiorAltura);

    }

}
