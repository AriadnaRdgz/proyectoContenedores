package PaqG07;

public class Hub {

    private Contenedor[][] hub;

    public int procedentes(String p){

        int hubs=0;

        for(int i=0; i<this.hub.length;i++){
            for(int j=0; j<this.hub[0].length; j++){
                if(this.hub[i][j].getPaís().equals(p)){
                    hubs++;
                }
            }
        }

        return hubs;

    }

    public void AñadirContenedor(Contenedor contenedorañadido){
        Contenedor contenedoraux = contenedorañadido;
        for (int i=0; i<=this.hub.length; i++){
            for (int j=0; j<=this.hub[0].length;j++){
                Contenedor contenedor = hub[i][j];
                if (hub[i][j]==null){
                    hub[i][j]=contenedoraux;
                    break;
                }
                if(hub[i][j].getPrioridad() >= contenedoraux.getPrioridad()){
                    hub[i][j]=contenedoraux;
                    contenedoraux = contenedor;
                }
            }
        }
    }

    public void QuitarContenedor(int columna){

        for (int i=0; i<=this.hub.length; i++){
            if(hub[i][columna]!=null){
                hub[i][columna]=null;
                break;
            }
        }
    }

}
