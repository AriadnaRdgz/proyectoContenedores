package PaqG07;

public class Puerto {

    Hub[] hubs;

    public Puerto(){
        for (int i = 0; i < 3; i++) {
            hubs[i] = new Hub();
        }
    }

    public Hub mostrar(int i){
        return hubs[i];
    }

    public int apilar(Contenedor cont){
        for (int i = 0; i < 3; i++) {
            if(hubs[i].AñadirContenedor(cont) == 0){
                return 0;
            }else if(hubs[i].AñadirContenedor(cont) == 2){
                return 2;
            }
        }
        return 1;
    }

    public int desapilar(int columna){
        for (int i = 2; i >= 0; i--) {
            if(hubs[i].QuitarContenedor(columna) == 0){
                return 0;
            }
        }
        return 1;
    }

    public int paises(String p){
        int c = 0;
        for (int i = 0; i < 3; i++) {
            c = c + hubs[i].procedentes(p);
        }
    }

}
