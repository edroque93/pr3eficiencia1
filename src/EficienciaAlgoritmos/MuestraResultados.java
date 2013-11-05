package EficienciaAlgoritmos;

public class MuestraResultados {

    public static void main(String[] args) {
        System.out.println("         Tiempo del vector en orden inverso   Tiempo del vector en orden aleatorio");
        CalculadorEstadisticas calculador = new CalculadorEstadisticas();
        int[] vector_tam = new int[]{1000, 2000, 4000, 8000, 16000, 32000};
        DatosEstadisticos[][] array = calculador.estadisticasOrdenaVectores(
                new Ordenar1Vector(), vector_tam);
        for (int i = 0; i < vector_tam.length; i++)
            System.out.printf("%6d %36.6f %38.6f\n", vector_tam[i],
                    array[i][0].dameTiempo(),
                    array[i][1].dameTiempo());

        System.out.println("Fin de programa");
    }

}
