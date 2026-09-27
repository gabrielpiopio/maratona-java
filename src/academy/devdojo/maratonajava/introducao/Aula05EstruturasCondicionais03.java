package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 3000;
        // (condicao) ? verdadeiro : falso;

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Não vou doar 500 pro DevDojo";
        System.out.println(resultado);
    }
}
