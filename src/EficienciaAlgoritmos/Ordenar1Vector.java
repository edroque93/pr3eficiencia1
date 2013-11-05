package EficienciaAlgoritmos;

public class Ordenar1Vector implements OrdenarVector {
    
    public Ordenar1Vector() {
    }
    
    public String nombreMetodo() {
        return "SeleccionIntercambio";
    }
    
    public void ordena(int [] v, DatosEstadisticos de) {
        double tiempo = System.currentTimeMillis();
        int pos;
        int menor;
   
        for (int i=0; i<(v.length -1); i++){
            pos = i;
            menor = v[i];
            for (int j=i+1; j<v.length; j++){
                if (v[j]<menor){
                    pos=j;
                    menor=v[j];
                }
            }
            v[pos]=v[i];
            v[i]=menor;
        }
        
        de.estableceTiempo((float) (System.currentTimeMillis() - tiempo)/1000);
    }
}