package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // EXERCICIO DEVDOJO
        // dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo
        byte dia = 7;

        switch (dia){
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
