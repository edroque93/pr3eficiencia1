package EficienciaAlgoritmos;

public class DatosEstadisticos {

    private float time;

    public DatosEstadisticos() {
    }

    public void añadeTiempo(float f) {
        time += f;
    }

    public void estableceTiempo(float f) {
        time = f;
    }

    public float dameTiempo() {
        return time;
    }

}
