public class TipoVaraiveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500.33;
       float pi = 3.14F; // Precisa ser terminado com um F para representar que é um float e não um long
       long cpf = 98765432109L; // Precisa ser terminado com um L para representar que é um long e não um int

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal;

       int numero = 5;
       numero = 10;

       System.out.println(numero);

        // classe Operadores.java
        String nomeCompleto = "Felipe" + " Abrantes";

        System.out.println(nomeCompleto);
    }
}
