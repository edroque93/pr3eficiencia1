package EficienciaAlgoritmos;

public class CalculadorEstadisticas {
    
    public CalculadorEstadisticas() {
    }
        
    public DatosEstadisticos[] estadisticaOrdenaVector(Ordenar1Vector m, int tam_vector) {
        DatosEstadisticos[] array = new DatosEstadisticos[2];
        
        array[0] = new DatosEstadisticos();
        array[1] = new DatosEstadisticos();
        array[1].estableceTiempo(0f);
        
        int [] array_v = GeneraCaso.generaVector(tam_vector, false);
        m.ordena(array_v, array[0]);
        
        DatosEstadisticos aux = new DatosEstadisticos();
        for (int i=0; i<10; i++){
             m.ordena(GeneraCaso.generaVector(tam_vector, true), aux);     
             array[1].añadeTiempo(aux.dameTiempo()/10);
        }
        
        return array;   
    }
    
    public DatosEstadisticos[][] estadisticasOrdenaVectores(Ordenar1Vector m, int[] tam_vectores) {
        DatosEstadisticos[][] array = new DatosEstadisticos[tam_vectores.length][2];
        
        for (int i=0; i<tam_vectores.length; i++) {
            array[i] = estadisticaOrdenaVector(m, tam_vectores[i]);
        }
        
        return array;   
    }

}