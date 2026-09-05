public class Conversor {

    private static final double KM_POR_MILHA = 1.609344;
    private static final double LIBRAS_POR_QUILOGRAMA = 2.2046226218;
    private static final double KM_POR_MILHA_NAUTICA = 1.852;
    private static final double METROS_POR_PE = 0.3048;
    private static final double LITROS_POR_GALAO_US = 3.785411784;

    // Densidades aproximadas em kg/L. Na prática, variam conforme temperatura e lote.
    public static final double DENSIDADE_JET_A1 = 0.80;
    public static final double DENSIDADE_AVGAS = 0.72;

    private Conversor() {
        // Impede a criação de objetos, pois todos os métodos são estáticos.
    }

    // Temperatura
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Distância tradicional
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros / KM_POR_MILHA;
    }

    public static double milhasParaQuilometros(double milhas) {
        return milhas * KM_POR_MILHA;
    }

    // Massa
    public static double quilogramasParaLibras(double quilogramas) {
        return quilogramas * LIBRAS_POR_QUILOGRAMA;
    }

    public static double librasParaQuilogramas(double libras) {
        return libras / LIBRAS_POR_QUILOGRAMA;
    }

    // Velocidade tradicional
    public static double quilometrosHoraParaMetrosSegundo(double velocidade) {
        return velocidade / 3.6;
    }

    public static double metrosSegundoParaQuilometrosHora(double velocidade) {
        return velocidade * 3.6;
    }

    // Velocidade aeronáutica
    public static double nosParaQuilometrosHora(double nos) {
        return nos * KM_POR_MILHA_NAUTICA;
    }

    public static double quilometrosHoraParaNos(double quilometrosHora) {
        return quilometrosHora / KM_POR_MILHA_NAUTICA;
    }

    // Altura e comprimento
    public static double pesParaMetros(double pes) {
        return pes * METROS_POR_PE;
    }

    public static double metrosParaPes(double metros) {
        return metros / METROS_POR_PE;
    }

    // Distância aeronáutica
    public static double milhasNauticasParaQuilometros(double milhasNauticas) {
        return milhasNauticas * KM_POR_MILHA_NAUTICA;
    }

    public static double quilometrosParaMilhasNauticas(double quilometros) {
        return quilometros / KM_POR_MILHA_NAUTICA;
    }

    // Volume
    public static double galoesUsParaLitros(double galoes) {
        return galoes * LITROS_POR_GALAO_US;
    }

    public static double litrosParaGaloesUs(double litros) {
        return litros / LITROS_POR_GALAO_US;
    }

    // Flight Level: FL100 representa 10.000 pés.
    public static double flightLevelParaPes(double flightLevel) {
        return flightLevel * 100.0;
    }

    public static double pesParaFlightLevel(double pes) {
        return pes / 100.0;
    }

    // Combustível: volume = massa / densidade; massa = volume * densidade.
    public static double quilogramasCombustivelParaLitros(double quilogramas,
                                                          double densidade) {
        validarDensidade(densidade);
        return quilogramas / densidade;
    }

    public static double litrosCombustivelParaQuilogramas(double litros,
                                                          double densidade) {
        validarDensidade(densidade);
        return litros * densidade;
    }

    private static void validarDensidade(double densidade) {
        if (densidade <= 0) {
            throw new IllegalArgumentException("A densidade deve ser maior que zero.");
        }
    }
}
