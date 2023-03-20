package PaqG07;

public class Contenedor {

        private int id;
        private int peso;
        private String país;
        private boolean inspeccionado;
        private int prioridad;
        private String descripción;
        private String empresaEmisora;
        private String empresaReceptora;

        public Contenedor(int id, int peso, String pais, boolean inspeccionado, int prioridad, String descripcion, String empresaEmisora, String empresaReceptora){
                this.id = id;
                this.peso = peso;
                this.país = pais;
                this.inspeccionado = inspeccionado;
                this.prioridad = prioridad;
                this.descripción = descripcion;
                this.empresaEmisora = empresaEmisora;
                this.empresaReceptora = empresaReceptora;
        }
        public void setId(int id) {
                this.id = id;
        }

        public void setPeso(int peso) {
                this.peso = peso;
        }

        public void setPaís(String país) {
                this.país = país;
        }

        public void setInspeccionado(boolean inspeccionado) {
                this.inspeccionado = inspeccionado;
        }

        public void setPrioridad(int prioridad) {
                this.prioridad = prioridad;
        }

        public void setDescripción(String descripción) {
                this.descripción = descripción;
        }

        public void setEmpresaEmisora(String empresaEmisora) {
                this.empresaEmisora = empresaEmisora;
        }

        public void setEmpresaReceptora(String empresaReceptora) {
                this.empresaReceptora = empresaReceptora;
        }

        public int getId() {
                return id;
        }

        public int getPeso() {
                return peso;
        }

        public String getPaís() {
                return país;
        }

        public int getPrioridad() {
                return prioridad;
        }

        public String getDescripción() {
                return descripción;
        }

        public String getEmpresaEmisora() {
                return empresaEmisora;
        }

        public String getEmpresaReceptora() {
                return empresaReceptora;
        }

        @Override
        public String toString() {
                return "Contenedor numero "+ id + ":" +
                        "\nPeso: " + peso +
                        "\nPaís: '" + país + '\'' +
                        "\nInspeccionado: " + inspeccionado +
                        "\nPrioridad: " + prioridad +
                        "\nDescripción: '" + descripción + '\'' +
                        "\nEmpresaEmisora: '" + empresaEmisora + '\'' +
                        "\nEmpresaReceptora: '" + empresaReceptora + '\'';
        }
}
