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

}
