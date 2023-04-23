package PaqG07;

public class Hub {

    private Contenedor[][] hub;

    public Hub(){ //Llenamos el hub con nulls
        this.hub = new Contenedor[10][12];
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                this.hub[i][j] = null;
            }
        }
    }

    //Setters y getters
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
        for (int i=0; i<this.hub.length; i++){
            if (contenedoraux.getPrioridad()==1){
                if (this.hub[i][0]==null){
                    this.hub[i][0]=contenedoraux;
                }
            }else if (contenedoraux.getPrioridad()==2){
                if (this.hub[i][1]==null){
                    this.hub[i][1]=contenedoraux;
                }
            } else  {
                for (int j=2; j<this.hub[i].length;j++){
                    Contenedor contenedor = this.hub[i][j];
                    if (this.hub[i][j]==null){
                        this.hub[i][j]=contenedoraux;
                        break;
                    }
                    if(this.hub[i][j].getPrioridad() >= contenedoraux.getPrioridad()){
                        this.hub[i][j]=contenedoraux;
                        contenedoraux = contenedor;
                    }
                }

            }
        }
    }

    public void QuitarContenedor(int columna){

        for (int i=this.hub.length-1; i>=0; i--){
            if(this.hub[i][columna]!=null){
                this.hub[i][columna]=null;
                break;
            }
        }
    }

    public String MostrarDatos(int id){ //Recorremos la matriz hasta encontrar el contenedor con la id solicitada. Entonces devolvemos su toString
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(this.hub[i][j].getId() == id){
                    return this.hub[i][j].toString();
                }
            }
        }
        return "No existe el contenedor con ID " + id;
    }

    @Override
    public String toString() { //Recorremos la matriz. Si hay un contenedor mostramos "C" y si está vacío mostramos "X"
        StringBuilder salida = new StringBuilder("Mapa del hub:\n");
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(this.hub[i][j] == null){
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
