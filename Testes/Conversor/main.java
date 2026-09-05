import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sistema;

        do {
            exibirMenuInicial();
            sistema = lerInteiro(scanner, "Escolha o sistema: ");

            // Escolha principal usando o if/else solicitado.
            if (sistema == 1) {
                menuConversoesTradicionais(scanner);
            } else if (sistema == 2) {
                menuConversoesAviacao(scanner);
            } else if (sistema == 0) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Digite 0, 1 ou 2.");
            }
        } while (sistema != 0);

        scanner.close();
    }

    private static void exibirMenuInicial() {
        System.out.println("\n========================================");
        System.out.println("       CONVERSOR DE UNIDADES");
        System.out.println("========================================");
        System.out.println("1 - Conversões tradicionais");
        System.out.println("2 - Sistema de conversões de aviação");
        System.out.println("0 - Encerrar");
    }

    private static void menuConversoesTradicionais(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== CONVERSÕES TRADICIONAIS =====");
            System.out.println("1 - Temperatura");
            System.out.println("2 - Distância");
            System.out.println("3 - Massa");
            System.out.println("4 - Velocidade");
            System.out.println("0 - Voltar ao menu inicial");
            opcao = lerInteiro(scanner, "Escolha uma categoria: ");

            switch (opcao) {
                case 1:
                    converterTemperatura(scanner);
                    break;
                case 2:
                    converterDistancia(scanner);
                    break;
                case 3:
                    converterMassa(scanner);
                    break;
                case 4:
                    converterVelocidade(scanner);
                    break;
                case 0:
                    System.out.println("Retornando ao menu inicial...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void converterTemperatura(Scanner scanner) {
        System.out.println("\n===== TEMPERATURA =====");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int opcao = lerInteiro(scanner, "Escolha uma opção: ");

        if (opcao == 1) {
            double valor = lerDouble(scanner, "Digite a temperatura em °C: ");
            double resultado = Conversor.celsiusParaFahrenheit(valor);
            System.out.printf("Resultado: %.2f °C = %.2f °F%n", valor, resultado);
        } else if (opcao == 2) {
            double valor = lerDouble(scanner, "Digite a temperatura em °F: ");
            double resultado = Conversor.fahrenheitParaCelsius(valor);
            System.out.printf("Resultado: %.2f °F = %.2f °C%n", valor, resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void converterDistancia(Scanner scanner) {
        System.out.println("\n===== DISTÂNCIA =====");
        System.out.println("1 - Quilômetros para milhas");
        System.out.println("2 - Milhas para quilômetros");
        int opcao = lerInteiro(scanner, "Escolha uma opção: ");

        if (opcao == 1) {
            double valor = lerNaoNegativo(scanner, "Digite a distância em km: ");
            double resultado = Conversor.quilometrosParaMilhas(valor);
            System.out.printf("Resultado: %.2f km = %.2f mi%n", valor, resultado);
        } else if (opcao == 2) {
            double valor = lerNaoNegativo(scanner, "Digite a distância em milhas: ");
            double resultado = Conversor.milhasParaQuilometros(valor);
            System.out.printf("Resultado: %.2f mi = %.2f km%n", valor, resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void converterMassa(Scanner scanner) {
        System.out.println("\n===== MASSA =====");
        System.out.println("1 - Quilogramas para libras");
        System.out.println("2 - Libras para quilogramas");
        int opcao = lerInteiro(scanner, "Escolha uma opção: ");

        if (opcao == 1) {
            double valor = lerNaoNegativo(scanner, "Digite a massa em kg: ");
            double resultado = Conversor.quilogramasParaLibras(valor);
            System.out.printf("Resultado: %.2f kg = %.2f lb%n", valor, resultado);
        } else if (opcao == 2) {
            double valor = lerNaoNegativo(scanner, "Digite a massa em lb: ");
            double resultado = Conversor.librasParaQuilogramas(valor);
            System.out.printf("Resultado: %.2f lb = %.2f kg%n", valor, resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void converterVelocidade(Scanner scanner) {
        System.out.println("\n===== VELOCIDADE =====");
        System.out.println("1 - km/h para m/s");
        System.out.println("2 - m/s para km/h");
        int opcao = lerInteiro(scanner, "Escolha uma opção: ");

        if (opcao == 1) {
            double valor = lerNaoNegativo(scanner, "Digite a velocidade em km/h: ");
            double resultado = Conversor.quilometrosHoraParaMetrosSegundo(valor);
            System.out.printf("Resultado: %.2f km/h = %.2f m/s%n", valor, resultado);
        } else if (opcao == 2) {
            double valor = lerNaoNegativo(scanner, "Digite a velocidade em m/s: ");
            double resultado = Conversor.metrosSegundoParaQuilometrosHora(valor);
            System.out.printf("Resultado: %.2f m/s = %.2f km/h%n", valor, resultado);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void menuConversoesAviacao(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CONVERSÕES DE AVIAÇÃO =====");
            System.out.println("1 - Nós para km/h");
            System.out.println("2 - km/h para nós");
            System.out.println("3 - Pés para metros");
            System.out.println("4 - Metros para pés");
            System.out.println("5 - Milhas náuticas para quilômetros");
            System.out.println("6 - Quilômetros para milhas náuticas");
            System.out.println("7 - Libras para quilogramas");
            System.out.println("8 - Quilogramas para libras");
            System.out.println("9 - Galões americanos para litros");
            System.out.println("10 - Litros para galões americanos");
            System.out.println("11 - Flight Level para pés");
            System.out.println("12 - Pés para Flight Level");
            System.out.println("13 - Quilogramas de combustível para litros");
            System.out.println("14 - Litros de combustível para quilogramas");
            System.out.println("0 - Voltar ao menu inicial");
            opcao = lerInteiro(scanner, "Escolha uma conversão: ");

            switch (opcao) {
                case 1:
                    converterNosParaKmH(scanner);
                    break;
                case 2:
                    converterKmHParaNos(scanner);
                    break;
                case 3:
                    converterPesParaMetros(scanner);
                    break;
                case 4:
                    converterMetrosParaPes(scanner);
                    break;
                case 5:
                    converterMilhasNauticasParaKm(scanner);
                    break;
                case 6:
                    converterKmParaMilhasNauticas(scanner);
                    break;
                case 7:
                    converterLibrasParaKg(scanner);
                    break;
                case 8:
                    converterKgParaLibras(scanner);
                    break;
                case 9:
                    converterGaloesParaLitros(scanner);
                    break;
                case 10:
                    converterLitrosParaGaloes(scanner);
                    break;
                case 11:
                    converterFlightLevelParaPes(scanner);
                    break;
                case 12:
                    converterPesParaFlightLevel(scanner);
                    break;
                case 13:
                    converterKgCombustivelParaLitros(scanner);
                    break;
                case 14:
                    converterLitrosCombustivelParaKg(scanner);
                    break;
                case 0:
                    System.out.println("Retornando ao menu inicial...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void converterNosParaKmH(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a velocidade em nós: ");
        double resultado = Conversor.nosParaQuilometrosHora(valor);
        System.out.printf("Resultado: %.2f kt = %.2f km/h%n", valor, resultado);
    }

    private static void converterKmHParaNos(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a velocidade em km/h: ");
        double resultado = Conversor.quilometrosHoraParaNos(valor);
        System.out.printf("Resultado: %.2f km/h = %.2f kt%n", valor, resultado);
    }

    private static void converterPesParaMetros(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite o valor em pés: ");
        double resultado = Conversor.pesParaMetros(valor);
        System.out.printf("Resultado: %.2f ft = %.2f m%n", valor, resultado);
    }

    private static void converterMetrosParaPes(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite o valor em metros: ");
        double resultado = Conversor.metrosParaPes(valor);
        System.out.printf("Resultado: %.2f m = %.2f ft%n", valor, resultado);
    }

    private static void converterMilhasNauticasParaKm(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a distância em milhas náuticas: ");
        double resultado = Conversor.milhasNauticasParaQuilometros(valor);
        System.out.printf("Resultado: %.2f NM = %.2f km%n", valor, resultado);
    }

    private static void converterKmParaMilhasNauticas(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a distância em quilômetros: ");
        double resultado = Conversor.quilometrosParaMilhasNauticas(valor);
        System.out.printf("Resultado: %.2f km = %.2f NM%n", valor, resultado);
    }

    private static void converterLibrasParaKg(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a massa em libras: ");
        double resultado = Conversor.librasParaQuilogramas(valor);
        System.out.printf("Resultado: %.2f lb = %.2f kg%n", valor, resultado);
    }

    private static void converterKgParaLibras(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a massa em quilogramas: ");
        double resultado = Conversor.quilogramasParaLibras(valor);
        System.out.printf("Resultado: %.2f kg = %.2f lb%n", valor, resultado);
    }

    private static void converterGaloesParaLitros(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite o volume em galões americanos: ");
        double resultado = Conversor.galoesUsParaLitros(valor);
        System.out.printf("Resultado: %.2f US gal = %.2f L%n", valor, resultado);
    }

    private static void converterLitrosParaGaloes(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite o volume em litros: ");
        double resultado = Conversor.litrosParaGaloesUs(valor);
        System.out.printf("Resultado: %.2f L = %.2f US gal%n", valor, resultado);
    }

    private static void converterFlightLevelParaPes(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite o Flight Level sem 'FL' (ex.: 350): ");
        double resultado = Conversor.flightLevelParaPes(valor);
        System.out.printf("Resultado: FL%.0f = %.0f ft%n", valor, resultado);
        System.out.println("Observação: Flight Level usa altitude de pressão padrão.");
    }

    private static void converterPesParaFlightLevel(Scanner scanner) {
        double valor = lerNaoNegativo(scanner, "Digite a altitude de pressão em pés: ");
        double resultado = Conversor.pesParaFlightLevel(valor);
        System.out.printf("Resultado: %.0f ft = FL%.2f%n", valor, resultado);
        System.out.println("Observação: Flight Level usa altitude de pressão padrão.");
    }

    private static void converterKgCombustivelParaLitros(Scanner scanner) {
        double densidade = escolherDensidadeCombustivel(scanner);
        if (densidade == 0) {
            return;
        }

        double valor = lerNaoNegativo(scanner, "Digite a massa do combustível em kg: ");
        double resultado = Conversor.quilogramasCombustivelParaLitros(valor, densidade);
        System.out.printf("Resultado aproximado: %.2f kg = %.2f L%n", valor, resultado);
        exibirAvisoCombustivel();
    }

    private static void converterLitrosCombustivelParaKg(Scanner scanner) {
        double densidade = escolherDensidadeCombustivel(scanner);
        if (densidade == 0) {
            return;
        }

        double valor = lerNaoNegativo(scanner, "Digite o volume do combustível em litros: ");
        double resultado = Conversor.litrosCombustivelParaQuilogramas(valor, densidade);
        System.out.printf("Resultado aproximado: %.2f L = %.2f kg%n", valor, resultado);
        exibirAvisoCombustivel();
    }

    private static double escolherDensidadeCombustivel(Scanner scanner) {
        System.out.println("\n===== TIPO DE COMBUSTÍVEL =====");
        System.out.println("1 - Jet A/Jet A-1 (densidade aproximada: 0,80 kg/L)");
        System.out.println("2 - AVGAS (densidade aproximada: 0,72 kg/L)");
        System.out.println("3 - Informar outra densidade");
        System.out.println("0 - Cancelar");
        int opcao = lerInteiro(scanner, "Escolha o combustível: ");

        if (opcao == 1) {
            return Conversor.DENSIDADE_JET_A1;
        } else if (opcao == 2) {
            return Conversor.DENSIDADE_AVGAS;
        } else if (opcao == 3) {
            return lerPositivo(scanner, "Digite a densidade em kg/L: ");
        } else if (opcao == 0) {
            System.out.println("Conversão cancelada.");
            return 0;
        } else {
            System.out.println("Opção inválida. Conversão cancelada.");
            return 0;
        }
    }

    private static void exibirAvisoCombustivel() {
        System.out.println("Aviso: a densidade do combustível varia com a temperatura e a");
        System.out.println("especificação. Não use esta estimativa para planejamento real de voo.");
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim().replace(",", ".");

            try {
                double valor = Double.parseDouble(entrada);
                if (Double.isFinite(valor)) {
                    return valor;
                }
                System.out.println("Digite um número finito.");
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    private static double lerNaoNegativo(Scanner scanner, String mensagem) {
        while (true) {
            double valor = lerDouble(scanner, mensagem);
            if (valor >= 0) {
                return valor;
            }
            System.out.println("O valor não pode ser negativo.");
        }
    }

    private static double lerPositivo(Scanner scanner, String mensagem) {
        while (true) {
            double valor = lerDouble(scanner, mensagem);
            if (valor > 0) {
                return valor;
            }
            System.out.println("O valor deve ser maior que zero.");
        }
    }
}
