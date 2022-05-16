package Practica_semanal_semana4;

public abstract class Voladores {

        private Integer velocidad;
        private Integer peso;
        private Integer altura;
        private String nombreVolador;
        private String tipoMotor;
        private String clase;
        private boolean aterrizajeVertical;

        public Integer getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(Integer velocidad) {
            this.velocidad = velocidad;
        }

        public Integer getAltura() {
            return altura;
        }
        public void setAltura(Integer altura) {
            this.altura = altura;
        }

        public Integer getPeso() {
            return peso;
        }

        public void setPeso(Integer peso) {
            this.peso = peso;
        }

        public Voladores() {
        }

        public Voladores(String nombreVolador, String tipoMotor, boolean aterrizajeVertical) {
            this.nombreVolador = nombreVolador;
            this.tipoMotor = tipoMotor;
            this.aterrizajeVertical = aterrizajeVertical;
        }

        public String getNombreVolador() {
            return nombreVolador;
        }

        public void setNombreVolador() {
            this.nombreVolador = nombreVolador;
        }

        public String isTipoMotor() {
            return tipoMotor;
        }

        public void setTipoMotor(String tipoMotor) {
            this.tipoMotor = tipoMotor;
        }

        public String getClase() {
            return clase;
        }

        public void setClase() {
            this.clase = clase;
        }

        public boolean isAterrizajeVertical() {
            return aterrizajeVertical;
        }

        public void setAterrizajeVertical(boolean aterrizajeVertical) {
            this.aterrizajeVertical = aterrizajeVertical;
        }
}