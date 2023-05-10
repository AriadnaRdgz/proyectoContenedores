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
                if(this.hub[i][j] != null){
                    if(this.hub[i][j].getPaís().equals(p)){
                        hubs++;
                    }
                }
            }
        }

        return hubs;

    }
    protected int fila, columna;
    public int MostrarDatos(int id){ //Recorremos la matriz hasta encontrar el contenedor con la id solicitada. Entonces devolvemos su toString
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(this.hub[i][j] != null){
                    if(this.hub[i][j].getId() == id){
                        fila = i; columna = j;
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public int AñadirContenedor(Contenedor contenedorañadido){

        if (!(this.MostrarDatos(contenedorañadido.getId()) == 1)){
            return 2;
        }

        for (int i=this.hub.length-1; i>=0; i--){
            if (contenedorañadido.getPrioridad()==1){
                if (this.hub[i][0]==null){
                    this.hub[i][0]=contenedorañadido;
                    return 0;
                }
            }else if (contenedorañadido.getPrioridad()==2){
                if (this.hub[i][1]==null){
                    this.hub[i][1]=contenedorañadido;
                    return 0;
                }
            } else  {
                for (int j=2; j<this.hub[i].length;j++){
                    Contenedor contenedor = this.hub[i][j];
                    if (this.hub[i][j]==null){
                        this.hub[i][j]=contenedorañadido;
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public int QuitarContenedor(int columna){

        for (int i=0; i<this.hub.length; i++){
            if(this.hub[i][columna-1]!=null){
                this.hub[i][columna-1]=null;
                return 0;
            }
        }
        return 1;
    }



    @Override
    public String toString() { //Recorremos la matriz. Si hay un contenedor mostramos "C" y si está vacío mostramos "X"
        StringBuilder salida = new StringBuilder("Mapa del hub:\n");
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(this.hub[i][j] == null){
                    salida.append("| X |\t");
                }else{
                    salida.append("| C |\t");
                }
            }
            salida.append("\n");
        }
        return salida.toString();
    }
}
