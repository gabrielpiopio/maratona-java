package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        // melhor usar "double" do que int, se caso for divisão que não dará numero inteiro, o int nao funcionará

        System.out.println("Valor " +(numero2+numero1));
        System.out.println("Valor " +resultado);


        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > menor ou maior
        // <= >= menor igual ou maior igual

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);

        // Operadores Lógicos
        // && (AND)  || (or)  !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean idDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("idDentroDaLeiMenorQueTrinta "+idDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++; // mesma coisa
        System.out.println(contador);
    }
}
