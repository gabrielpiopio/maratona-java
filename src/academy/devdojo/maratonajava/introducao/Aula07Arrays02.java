package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char u000
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Pio";
        nomes[1] = "Vargas";
        nomes[2] = "Menocci";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
