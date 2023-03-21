package PaqG07;

public class Hub {

    private Contenedor[][] hub;

    public Hub(){
        hub = new Contenedor[10][12];
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                hub[i][j] = null;
            }
        }
    }

    public void setHub(Contenedor[][] hub) {
        this.hub = hub;
    }

    public Contenedor[][] getHub() {
        return hub;
    }

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
        for (int i=hub.length; i>0; i--){
            if (contenedoraux.getPrioridad()==1){
                if (hub[i][1]==null){
                    hub[i][1]=contenedoraux;
                }
            }else if (contenedoraux.getPrioridad()==2){
                if (hub[i][2]==null){
                    hub[i][2]=contenedoraux;
                }
            } else  {
                for (int j=3; j<=this.hub[0].length;j++){
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
    }

    public void QuitarContenedor(int columna){

        for (int i=0; i<=hub.length; i++){
            if(hub[i][columna]!=null){
                hub[i][columna]=null;
                break;
            }
        }
    }

    public String MostrarDatos(int id){
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(hub[i][j].getId() == id){
                    return hub[i][j].toString();
                }
            }
        }
        return String ="No existe el contenedor con ID " + id;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder("Mapa del hub:\n");
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(hub[i][j] == null){
                    salida.append("| C |\t");
                }else{
                    salida.append("| X |\t");
                }
            }
            salida.append("\n");
        }
        return salida.toString();
    }
}
