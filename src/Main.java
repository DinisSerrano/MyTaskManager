import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

            if(opcao == 'v') opcao = 'V';
            else if(opcao == 'm') opcao = 'M';
            else if(opcao == 'e') opcao = 'E';
            else if(opcao == 's') opcao = 'S';


            switch (opcao) {
                case 'V':
                    menuVisualizar();
                    break;

                case 'M':
                    System.out.println("\n(M)arcar)\n");
                    break;

                case 'E':
                    menuEditar();
                    break;

                case 'S':
                    System.out.println("\nAté logo!");
                    menu.close();
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
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

            if(opcao == 't') opcao = 'T';
            else if(opcao == 'd') opcao = 'D';
            else if(opcao == 'a') opcao = 'A';
            else if(opcao == 'p') opcao = 'P';
            else if(opcao == 'f') opcao = 'F';
            else if(opcao == 'l') opcao = 'L';
            else if(opcao == 'v') opcao = 'V';


            switch (opcao) {
                case 'T':
                    System.out.println("\n(V)isualizar todas");
                    break;

                case 'D':
                    System.out.println("\n(M)arcar)\n");
                    break;

                case 'A':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'P':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'F':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'L':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'V':
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
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

            if(opcao == 'a') opcao = 'A';
            else if(opcao == 't') opcao = 'T';
            else if(opcao == 'p') opcao = 'P';
            else if(opcao == 'f') opcao = 'F';
            else if(opcao == 'j') opcao = 'J';
            else if(opcao == 'e') opcao = 'E';
            else if(opcao == 'v') opcao = 'V';


            switch (opcao) {
                case 'A':
                    System.out.println("\n(V)isualizar");
                    break;

                case 'T':
                    System.out.println("\n(M)arcar)\n");
                    break;

                case 'P':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'F':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'J':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'E':
                    System.out.println("\n(E)ditar\n");
                    break;

                case 'V':
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while (opcao != 'V');
    }



    public static void main(String[] args) {
        System.out.println("Bem vindo ao Task Manager!");
        menu();
    }

}