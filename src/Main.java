import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static char maiuscula(char opcao) {
        if (opcao >= 'a' && opcao <= 'z') {
            opcao = (char) (opcao - 32);
        }
        return opcao;
    }

    public static void menu(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][], int nTarefas) {
        Scanner menu = new Scanner(System.in);

        char opcao = ' ';
        do {
            System.out.println("\n|MY TASK MANAGER|");
            System.out.println("|(V)isualizar|");
            System.out.println("|(M)arcar)|");
            System.out.println("|(E)ditar|");
            System.out.println("|(S)air|");
            System.out.println("Digite uma opção: ");

            opcao = menu.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'V':
                    menuVisualizar();
                    break;
                case 'M':
                    menuMarcar();
                    ;
                    break;
                case 'E':
                    menuEditar(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'S':
                    System.out.println("\nAté logo!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 'S');
    }

    // METODO PARA VISUALIZAR AS TAREFAS TODAS
    /*
     * public static void visualizarTarefas(String [] tarefa, boolean [] temPrazo,
     * boolean [] foiFeita, boolean [], int [][] data) {
     * System.out.printf("%-6s %-40s %-15s %-10s\n", "", "Tarefa", "Data", "Feita");
     * for (int i = 0; i < nTarefas; i++) {
     * // Imprime o número e o nome da tarefa com os dois pontos
     * System.out.printf("%-5d: %-40s ", (i + 1), tarefa[i]);
     * 
     * // Imprime a data ou "Sem prazo" se não tiver data
     * if (temPrazo[i]) {
     * System.out.printf("%-15s", data[i][0] + "/" + data[i][1] + "/" + data[i][2]);
     * } else {
     * System.out.printf("%-15s", "--/--/----");
     * }
     * 
     * // Indica se a tarefa foi feita ou não
     * if (foiFeita[i]) {
     * System.out.printf(" ✔\n");
     * } else {
     * System.out.printf(" X\n");
     * }
     * }
     * }
     * //METODO PARA VISUALIZAR NO DIA (D)
     * public static void visualizarTarefasPorData(int dia, int mes, int ano) {
     * boolean encontrouTarefa = false;
     * 
     * 
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.
     * println("Digite a data para visualizar as tarefas (dia, mês, ano):");
     * System.out.print("Dia: ");
     * dia = scanner.nextInt();
     * 
     * System.out.print("Mês: ");
     * mes = scanner.nextInt();
     * 
     * System.out.print("Ano: ");
     * ano = scanner.nextInt();
     * 
     * System.out.printf("%-6s %-40s %-15s %-10s\n", "", "Tarefa", "Data", "Feita");
     * 
     * for(int i = 0; i < nTarefas; i++){
     * // Verifica se a tarefa tem prazo e se o prazo corresponde à data fornecida
     * if (temPrazo[i] && data[i][0] == dia && data[i][1] == mes && data[i][2] ==
     * ano) {
     * // Imprime o número e nome da tarefa
     * System.out.printf("%-5d: %-40s ", (i + 1), tarefa[i]);
     * 
     * // Imprime a data
     * System.out.printf("%-15s", data[i][0] + "/" + data[i][1] + "/" + data[i][2]);
     * 
     * // Indica se a tarefa foi feita ou não
     * if (foiFeita[i]) {
     * System.out.printf("✔\n");
     * } else {
     * System.out.printf("X\n");
     * }
     * 
     * // Marca que encontrou uma tarefa com a data fornecida
     * encontrouTarefa = true;
     * }
     * }
     * 
     * // Se não encontrar tarefas para a data informada, exibe uma mensagem
     * if (!encontrouTarefa) {
     * System.out.println("Nenhuma tarefa encontrada para esta data.");
     * }
     * }
     */

    public static void menuVisualizar() {
        Scanner menuVisualizar = new Scanner(System.in);

        char opcao = ' ';
        do {
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
        } while (opcao != 'V');
    }

    public static void menuMarcar() {
        Scanner menuMarcar = new Scanner(System.in);

        char opcao = ' ';
        do {
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
        } while (opcao != 'V');
    }

    public static void menuEditar(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][], int nTarefas) {
        Scanner menuEditar = new Scanner(System.in);

        char opcao = ' ';
        do {
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
                    nTarefas = adicionarTarefa(tarefa, temPrazo, foiFeita, data, nTarefas); // Atualiza nTarefas
                    break;
                case 'T':
                    nTarefas = adicionarTarefaPosicaoN(tarefa, temPrazo, foiFeita, data, nTarefas);
                    ;
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
        } while (opcao != 'V');
    }

    public static int adicionarTarefa(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][], int nTarefas) {
        Scanner adicionarTarefa = new Scanner(System.in);
        if (nTarefas >= tarefa.length) {
            System.out.println("Não é possível adicionar mais tarefas. Lista cheia!");
            return nTarefas;
        }
    
        System.out.print("Qual o nome da tarefa? ");
        String nomeTarefa = adicionarTarefa.nextLine();
        System.out.print("Tem prazo? (Digite no formato dd/mm/aaaa ou pressione Enter para sem prazo): ");
        String prazo = adicionarTarefa.nextLine();
    
        tarefa[nTarefas] = nomeTarefa;
        foiFeita[nTarefas] = false;
    
        if (!prazo.isEmpty()) {
            String[] partesData = prazo.split("/");
            if (partesData.length == 3) {
                int dia = Integer.parseInt(partesData[0]);
                int mes = Integer.parseInt(partesData[1]);
                int ano = Integer.parseInt(partesData[2]);
                if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 2024) {
                    temPrazo[nTarefas] = true;
                    data[nTarefas][0] = dia;
                    data[nTarefas][1] = mes;
                    data[nTarefas][2] = ano;
                } else {
                    System.out.println("Data inválida! A tarefa será cadastrada sem prazo.");
                    temPrazo[nTarefas] = false;
                }
            } else {
                System.out.println("Data inválida! A tarefa será cadastrada sem prazo.");
                temPrazo[nTarefas] = false;
            }
        } else {
            temPrazo[nTarefas] = false;
        }
    
        nTarefas++; // Incrementa o número de tarefas
    
        // Exibe as tarefas após a alteração
        System.out.println("\nLista atualizada de tarefas:");
        for (int i = 0; i < nTarefas; i++) {
            if (tarefa[i] != null) {
                System.out.print("Tarefa " + (i + 1) + ": " + tarefa[i]);
                if (temPrazo[i]) {
                    System.out.println(" | Prazo: " + data[i][0] + "/" + data[i][1] + "/" + data[i][2]);
                } else {
                    System.out.println(" | Sem prazo");
                }
            }
        }
        return nTarefas; // Retorna o número atualizado de tarefas
    }
    

    public static int adicionarTarefaPosicaoN(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][], int nTarefas) {
        Scanner adicionarTarefaPosicaoN = new Scanner(System.in);

        System.out.print("Em qual posição deseja modificar a tarefa? ");
        int n = adicionarTarefaPosicaoN.nextInt();
        adicionarTarefaPosicaoN.nextLine(); // Limpa o buffer após nextInt()

        // Desloca as tarefas a partir da posição `n` para frente
        for (int i = tarefa.length - 2; i >= n; i--) {
            tarefa[i] = tarefa[i - 1];
            temPrazo[i] = temPrazo[i - 1];
            foiFeita[i] = foiFeita[i - 1];
            data[i][0] = data[i - 1][0];
            data[i][1] = data[i - 1][1];
            data[i][2] = data[i - 1][2];
        }

        // Captura os dados da nova tarefa
        System.out.print("Qual o nome da tarefa? ");
        String nomeTarefa = adicionarTarefaPosicaoN.nextLine();
        System.out.print("Tem prazo? (Digite no formato dd/mm/aaaa ou pressione Enter para sem prazo): ");
        String prazo = adicionarTarefaPosicaoN.nextLine();

        // Substitui a tarefa na posição n
        tarefa[n - 1] = nomeTarefa;
        foiFeita[n - 1] = false;

        if (!prazo.isEmpty()) {
            String[] partesData = prazo.split("/");
            if (partesData.length == 3) {
                int dia = Integer.parseInt(partesData[0]);
                int mes = Integer.parseInt(partesData[1]);
                int ano = Integer.parseInt(partesData[2]);

                if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 2024) {
                    temPrazo[n - 1] = true;
                    data[n - 1][0] = dia;
                    data[n - 1][1] = mes;
                    data[n - 1][2] = ano;
                } else {
                    System.out.println("Data inválida! A tarefa será cadastrada sem prazo.");
                    temPrazo[n - 1] = false;
                }
            } else {
                System.out.println("Formato de data inválido! A tarefa será cadastrada sem prazo.");
                temPrazo[n - 1] = false;
            }
        } else {
            temPrazo[n - 1] = false;
        }

        nTarefas++;

        // Exibe as tarefas após a alteração
        System.out.println("\nLista atualizada de tarefas:");
        for (int i = 0; i < nTarefas; i++) {
            if (tarefa[i] != null) {
                System.out.print("Tarefa " + (i + 1) + ": " + tarefa[i]);
                if (temPrazo[i]) {
                    System.out.println(" | Prazo: " + data[i][0] + "/" + data[i][1] + "/" + data[i][2]);
                } else {
                    System.out.println(" | Sem prazo");
                }
            }
        }
        return nTarefas;
    }

    public static void ApagarTarefaPosicaoN(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner ApagarTarefaPosicaoN = new Scanner(System.in);

        System.out.print("Qual a posição da tarefa que deseja apagar? ");
        int n = ApagarTarefaPosicaoN.nextInt();
        ApagarTarefaPosicaoN.nextLine(); // Limpa o buffer após nextInt()
    }

    public static void main(String[] args) {

        int tamMax = 100;
        String[] tarefa = new String[tamMax];
        boolean[] temPrazo = new boolean[tamMax];
        boolean[] foiFeita = new boolean[tamMax];
        int[][] data = new int[tamMax][3];
        int nTarefas = 0;

        tarefa[0] = "Ir ao dentista";
        temPrazo[0] = true;
        foiFeita[0] = false;
        data[0][0] = 17;
        data[0][1] = 12;
        data[0][2] = 2024;
        tarefa[1] = "Teste de Programação";
        temPrazo[1] = true;
        foiFeita[1] = true;
        data[1][0] = 14;
        data[1][1] = 12;
        data[1][2] = 2024;
        tarefa[2] = "Corrigir testes";
        temPrazo[2] = false;
        foiFeita[2] = false;
        tarefa[3] = "Frequência de Programação";
        temPrazo[3] = true;
        foiFeita[3] = false;
        data[3][0] = 13;
        data[3][1] = 1;
        data[3][2] = 2024;
        tarefa[4] = "Presentes!!!";
        temPrazo[4] = true;
        foiFeita[4] = false;
        data[4][0] = 25;
        data[4][1] = 12;
        data[4][2] = 2024;
        nTarefas = 5;

        menu(tarefa, temPrazo, foiFeita, data, nTarefas);

    }

}