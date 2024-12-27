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
                    menuMarcar(tarefa, temPrazo, foiFeita, data, nTarefas);
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

    public static void menuMarcar(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][], int nTarefas) {
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
                case 'F':
                    System.out.println("\n(V)isualizar todas");
                    break;
                case 'T':
                    System.out.println("\n(M)arcar)\n");
                    break;
                case 'D':
                    desmarcarUltimaFeita(foiFeita, opcao);
                    break;
                case 'N':
                    marcarTodasDiaD(foiFeita, nTarefas, data, tarefa);
                    break;
                case 'V':
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 'V');
    }

    public static void desmarcarUltimaFeita(boolean[] foiFeita, int nTarefas) {
        for (int i = nTarefas - 1; i >= 0; i--) {
            if (foiFeita[i]) {
                foiFeita[i] = false;
                System.out.println("Tarefa " + (i + 1) + " desmarcada como feita.");
                return;
            }
        }
        System.out.println("Nenhuma tarefa está marcada como feita.");
    }

    public static void marcarTodasDiaD(boolean[] foiFeita, int nTarefas, int[][] data, String[] tarefa) {
        Scanner marcarTodasDiaD = new Scanner(System.in);
        System.out.print("Qual data deseja marcar como feita? ");
        String marcarData = marcarTodasDiaD.nextLine();

        String[] partesData = marcarData.split("/");
        if (partesData.length == 3) {
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);
            for(int i = 1; i <= nTarefas; i++){
                if(dia == data[i-1][0] && mes == data[i-1][1] && ano == data[i-1][2]){
                    foiFeita[i-1] = true;
                    System.out.println("A tarefa " + tarefa[i-1] + " foi feita");
                }
            }
        } else {
            System.out.println("Formato de data inválido! A tarefa será cadastrada sem prazo.");
        }
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
                    nTarefas = adicionarTarefa(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'T':
                    nTarefas = adicionarTarefaPosicaoN(tarefa, temPrazo, foiFeita, data, nTarefas);
                    ;
                    break;
                case 'P':
                    nTarefas = apagarTarefaPosicaoN(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'F':
                    nTarefas = apagarFeitas(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'J':
                    nTarefas = juntarTarefas(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'E':
                    menuEditarTarefa(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'V':
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 'V');
    }

    public static int adicionarTarefa(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
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

        nTarefas++;
        return nTarefas;
    }

    public static int adicionarTarefaPosicaoN(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner adicionarTarefaPosicaoN = new Scanner(System.in);

        System.out.print("\nEm qual posição deseja adicionar/modificar a tarefa? ");
        int n = adicionarTarefaPosicaoN.nextInt();
        adicionarTarefaPosicaoN.nextLine(); // Limpar o buffer após nextInt()

        if (n < 1 || n > nTarefas + 1) {
            System.out.println("Posição inválida! A tarefa não foi adicionada.");
            return nTarefas;
        }

        // Deslocar as tarefas a partir da posição `n` para frente
        for (int i = nTarefas; i >= n; i--) {
            tarefa[i] = tarefa[i - 1];
            temPrazo[i] = temPrazo[i - 1];
            foiFeita[i] = foiFeita[i - 1];
            data[i][0] = data[i - 1][0];
            data[i][1] = data[i - 1][1];
            data[i][2] = data[i - 1][2];
        }

        System.out.print("Qual o nome da tarefa? ");
        String nomeTarefa = adicionarTarefaPosicaoN.nextLine();
        System.out.print("Tem prazo? (Digite no formato dd/mm/aaaa ou pressione Enter para sem prazo): ");
        String prazo = adicionarTarefaPosicaoN.nextLine();

        // Adicionar a nova tarefa na posição `n`
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
        return nTarefas;
    }

    public static int apagarTarefaPosicaoN(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner ApagarTarefaPosicaoN = new Scanner(System.in);
        System.out.print("Qual a posição da tarefa que deseja apagar? ");
        int n = ApagarTarefaPosicaoN.nextInt();

        if (n >= 0 && n <= nTarefas) {
            for (int i = n - 1; i < nTarefas - 1; i++) {
                tarefa[i] = tarefa[i + 1];
                temPrazo[i] = temPrazo[i + 1];
                foiFeita[i] = foiFeita[i + 1];
                data[i][0] = data[i + 1][0];
                data[i][1] = data[i + 1][1];
                data[i][2] = data[i + 1][2];
            }
            // Limpar a última posição, que agora está vazia
            tarefa[nTarefas - 1] = null;
            temPrazo[nTarefas - 1] = false;
            foiFeita[nTarefas - 1] = false;
            data[nTarefas - 1][0] = 0;
            data[nTarefas - 1][1] = 0;
            data[nTarefas - 1][2] = 0;

            // Atualizar o número total de tarefas
            nTarefas--;
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Essa tarefa não existe");
        }
        return nTarefas;
    }

    public static int apagarFeitas(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {

        int tarefasApagadas = 0;

        for (int i = 0; i < nTarefas; i++) {
            if (foiFeita[i]) {
                for (int j = i; j < nTarefas - 1; j++) {
                    tarefa[j] = tarefa[j + 1];
                    temPrazo[j] = temPrazo[j + 1];
                    foiFeita[j] = foiFeita[j + 1];
                    data[j][0] = data[j + 1][0];
                    data[j][1] = data[j + 1][1];
                    data[j][2] = data[j + 1][2];
                }

                tarefa[nTarefas - 1] = null;
                temPrazo[nTarefas - 1] = false;
                foiFeita[nTarefas - 1] = false;
                data[nTarefas - 1][0] = 0;
                data[nTarefas - 1][1] = 0;
                data[nTarefas - 1][2] = 0;

                nTarefas--;
                i--;
                tarefasApagadas++;
            }
        }

        if (tarefasApagadas == 0) {
            System.out.println("Não existem tarefas feitas.");
        } else {
            System.out.println("Tarefas feitas apagadas com sucesso.");
        }

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

    public static int juntarTarefas(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner juntarTarefas = new Scanner(System.in);
        System.out.print("Introduz a primeira tarefa: ");
        int tarefa1 = juntarTarefas.nextInt();
        tarefa1 -= 1;
        System.out.print("Introduz a segunda tarefa tarefa: ");
        int tarefa2 = juntarTarefas.nextInt();
        tarefa2 -= 1;

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

        if (tarefa1 >= 0 && tarefa1 <= nTarefas && tarefa2 >= 0 && tarefa2 <= nTarefas) {
            tarefa[tarefa1] = tarefa[tarefa1] + ", " + tarefa[tarefa2];

            if (data[tarefa1][0] > 0 && data[tarefa2][0] > 0)
                data[tarefa1][0] = (data[tarefa1][0] + data[tarefa2][0]) / 2;
            else if (data[tarefa1][0] == 0 && data[tarefa2][0] > 0)
                data[tarefa1][0] = (data[tarefa2][0]);

            if (data[tarefa1][1] > 0 && data[tarefa2][1] > 0)
                data[tarefa1][1] = (data[tarefa1][1] + data[tarefa2][1]) / 2;
            else if (data[tarefa1][1] == 0 && data[tarefa2][1] > 0)
                data[tarefa1][1] = (data[tarefa2][1]);

            if (data[tarefa1][2] > 0 && data[tarefa2][2] > 0)
                data[tarefa1][2] = (data[tarefa1][2] + data[tarefa2][2]) / 2;
            else if (data[tarefa1][2] == 0 && data[tarefa2][2] > 0)
                data[tarefa1][2] = (data[tarefa2][2]);

            for (int i = tarefa2; i <= nTarefas - 1; i++) {
                tarefa[i] = tarefa[i + 1];
                temPrazo[i] = temPrazo[i + 1];
                foiFeita[i] = foiFeita[i + 1];
                data[i][0] = data[i + 1][0];
                data[i][1] = data[i + 1][1];
                data[i][2] = data[i + 1][2];
            }
            // Limpar a última posição, que agora está vazia
            tarefa[nTarefas - 1] = null;
            temPrazo[nTarefas - 1] = false;
            foiFeita[nTarefas - 1] = false;
            data[nTarefas - 1][0] = 0;
            data[nTarefas - 1][1] = 0;
            data[nTarefas - 1][2] = 0;

            // Atualizar o número total de tarefas
            nTarefas--;
            System.out.println("Tarefa removida com sucesso.");
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

        } else {
            System.out.println("Essas tarefas não existem");
        }

        return nTarefas;
    }

    public static void menuEditarTarefa(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner menuEditarTarefa = new Scanner(System.in);

        char opcao = ' ';
        do {
            System.out.println("\n|Editar Tarefa|");
            System.out.println("|(E)ditar texto|");
            System.out.println("|(R)emover/Adicionar data|");
            System.out.println("Digite uma opção: ");

            opcao = menuEditarTarefa.nextLine().charAt(0);

            opcao = maiuscula(opcao);
            switch (opcao) {
                case 'E':
                    editarTexto(tarefa, temPrazo, foiFeita, data, nTarefas);
                    break;
                case 'R':
                    adicionarRemoverData(tarefa, temPrazo, foiFeita, data, nTarefas);
                    ;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 'V');
    }

    public static void editarTexto(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner editarTexto = new Scanner(System.in);
        int posicao = 0;
        System.out.print("Introduza a posição da tarefa: ");
        posicao = editarTexto.nextInt();
        editarTexto.nextLine(); // Limpar o buffer após nextInt()

        System.out.print("introduza o novo texto: ");
        String texto = editarTexto.nextLine();

        tarefa[posicao - 1] = texto;
        System.out.print("Texto alterado com sucesso!");

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
    }

    public static void adicionarRemoverData(String tarefa[], boolean temPrazo[], boolean foiFeita[], int data[][],
            int nTarefas) {
        Scanner AdicionarRemoverrData = new Scanner(System.in);
        System.out.print("Introduza a posição da tarefa: ");
        int posicao = AdicionarRemoverrData.nextInt();
        AdicionarRemoverrData.nextLine(); // Limpar o buffer após nextInt()

        if (temPrazo[posicao - 1]) {
            data[posicao - 1][0] = 0;
            data[posicao - 1][1] = 0;
            data[posicao - 1][2] = 0;
            temPrazo[posicao - 1] = false;
            System.out.print("Data eliminada com sucesso!");
        } else {
            System.out.print("Introduza a data (Digite no formato dd/mm/aaaa): ");
            String prazo = AdicionarRemoverrData.nextLine();
            String[] partesData = prazo.split("/");
            if (partesData.length == 3) {
                int dia = Integer.parseInt(partesData[0]);
                int mes = Integer.parseInt(partesData[1]);
                int ano = Integer.parseInt(partesData[2]);

                if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 2024) {
                    temPrazo[posicao - 1] = true;
                    data[posicao - 1][0] = dia;
                    data[posicao - 1][1] = mes;
                    data[posicao - 1][2] = ano;
                } else {
                    System.out.println("Data inválida! A tarefa será introduzida sem prazo.");
                    temPrazo[posicao - 1] = false;
                }
            } else {
                System.out.println("Formato de data inválido! A tarefa será introduzida sem prazo.");
                temPrazo[posicao - 1] = false;
            }

        }

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