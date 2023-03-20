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
