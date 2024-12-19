import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static char maiuscula(char opcao){
        if(opcao >= 'a' && opcao <= 'z'){
            opcao = (char) (opcao -32);
        }
        return opcao;
    }

    public static void menu(){
        Scanner menu = new Scanner (System.in);

        char opcao = ' ';
        do{
            System.out.println("\n|MY TASK MANAGER|");
            System.out.println("|(V)isualizar|");
            System.out.println("|(M)arcar)|");
            System.out.println("|(E)ditar|");
            System.out.println("|(S)air|");
            System.out.println("Digite uma opção: ");

            opcao = menu.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'V': menuVisualizar(); break;
                case 'M': menuMarcar();; break;
                case 'E': menuEditar(); break;
                case 'S': System.out.println("\nAté logo!"); break;
                default: System.out.println("Opção Inválida!"); break;
            }
        }while(opcao != 'S');
    }

    public static void menuVisualizar(){
        Scanner menuVisualizar = new Scanner (System.in);

        char opcao = ' ';
        do{
            System.out.println("\n|VISUALIZAR|");
            System.out.println("|Visualizar (t)odas|");
            System.out.println("|Visualizar (d)ia d|");
            System.out.println("|Visualizar (a)té dia d|");
            System.out.println("|Visualizar (p)or fazer|");
            System.out.println("|Visualizar (f)eitas|");
            System.out.println("|Visualizar por pa(l)avra p)|");
            System.out.println("|(V)oltar|");
            System.out.println("Digite uma opção: ");

            opcao = menuVisualizar.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'T': System.out.println("\n(V)isualizar todas"); break;
                case 'D': System.out.println("\n(M)arcar)\n"); break;
                case 'A': System.out.println("\n(E)ditar\n"); break;
                case 'P': System.out.println("\n(E)ditar\n"); break;
                case 'F': System.out.println("\n(E)ditar\n"); break;
                case 'L': System.out.println("\n(E)ditar\n"); break;
                case 'V': break;
                default: System.out.println("Opção Inválida!"); break;
            }
        }while (opcao != 'V');
    }

    public static void menuMarcar(){
        Scanner menuMarcar = new Scanner (System.in);

        char opcao = ' ';
        do{
            System.out.println("\n|MARCAR|");
            System.out.println("|Marcar como (f)eita por número |");
            System.out.println("|Marcar como feita por (t)exto |");
            System.out.println("|(D)esmarcar última feita |");
            System.out.println("|Marcar todas (n)o dia d|");
            System.out.println("|(V)oltar|");
            System.out.println("Digite uma opção: ");

            opcao = menuMarcar.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'T': System.out.println("\n(V)isualizar todas"); break;
                case 'D': System.out.println("\n(M)arcar)\n"); break;
                case 'A': System.out.println("\n(E)ditar\n"); break;
                case 'P': System.out.println("\n(E)ditar\n"); break;
                case 'F': System.out.println("\n(E)ditar\n"); break;
                case 'L': System.out.println("\n(E)ditar\n"); break;
                case 'V': break;
                default: System.out.println("Opção Inválida!"); break;
            }
        }while (opcao != 'V');
    }

    public static void menuEditar(){
        Scanner menuEditar = new Scanner (System.in);

        char opcao = ' ';
        do{
            System.out.println("\n|Editar|");
            System.out.println("|(A)dicionar tarefa|");
            System.out.println("|Adicionar (t)arefa na posição n|");
            System.out.println("|Apagar tarefa na (p)osição n|");
            System.out.println("|Apagar (f)eitas|");
            System.out.println("|(J)untar tarefas");
            System.out.println("|(E)ditar tarefa|");
            System.out.println("|(V)oltar|");
            System.out.println("Digite uma opção: ");

            opcao = menuEditar.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'A':
                    System.out.println("\n(V)isualizar");
                    break;
                case 'T': System.out.println("\n(M)arcar)\n"); break;
                case 'P': System.out.println("\n(E)ditar\n"); break;
                case 'F': System.out.println("\n(E)ditar\n"); break;
                case 'J': System.out.println("\n(E)ditar\n"); break;
                case 'E': System.out.println("\n(E)ditar\n"); break;
                case 'V': break;
                default: System.out.println("Opção Inválida!"); break;
            }
        }while (opcao != 'V');
    }

    public static void adicionarTarefa(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[]){


    }


    public static void main(String[] args) {

        int tamMax=100;
        String [] tarefa = new String[tamMax];
        boolean [] temPrazo = new boolean[tamMax];
        boolean [] foiFeita = new boolean[tamMax];
        int [][] data = new int[tamMax][3];
        int nTarefas = 0;

        tarefa[0]="Ir ao dentista"; temPrazo[0]=true; foiFeita[0]=false; data[0][0]=17; data[0][1]=12;
        data[0][2]=2024;
        tarefa[1]="Teste de Programação"; temPrazo[1]=true; foiFeita[1]=true; data[1][0]=14; data[1][1]=12;
        data[1][2]=2024;
        tarefa[2]="Corrigir testes"; temPrazo[2]=false; foiFeita[2]=false;
        tarefa[3]="Frequência de Programação"; temPrazo[3]=true; foiFeita[3]=false; data[3][0]=13;
        data[3][1]=1; data[3][2]=2024;
        tarefa[4]="Presentes!!!"; temPrazo[4]=true; foiFeita[4]=false; data[4][0]=25; data[4][1]=12;
        data[4][2]=2024;
        nTarefas=5;

        menu();
        
    }

}