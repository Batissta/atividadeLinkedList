import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Francinaldo", 0001, "Sistemas");
        Aluno aluno2 = new Aluno("Pablo", 0002, "Sistemas");
        Aluno aluno3 = new Aluno("Talles", 0003, "Direito");
        Aluno aluno4 = new Aluno("Ademario", 0004, "Educação Física");
        Aluno aluno5 = new Aluno("Gabryell", 0004, "Moda");

        FilaBanco fila1 = new FilaBanco(null, null, 0);
        FilaBanco fila2 = new FilaBanco(null, null, 0);
        FilaBanco fila3 = new FilaBanco(null, null, 0);

        fila1.addLast(aluno1);
        fila1.addLast(aluno2);
        fila1.addLast(aluno1);

        fila2.addLast(aluno3);
        fila2.addLast(aluno4);
        fila2.addLast(aluno5);

        // Exercicío 01
        System.out.printf("A fila1 é palíndromo? %b \n\n", fila1.isPalindromo(fila1));

        // Exercicío 02
        fila3.print(); // Fila 3 começa vazia
        System.out.println("___________________________________");
        System.out.println("Fila 1: ");
        fila1.print();
        System.out.println("___________________________________");
        System.out.println("Fila 2: ");
        fila2.print();
        System.out.println("___________________________________");
        fila3 = fila3.concatenar(fila1, fila2);
        System.out.println("Fila 3: ");
        fila3.print();
        System.out.println("___________________________________");

    }
}