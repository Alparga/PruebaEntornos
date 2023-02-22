package pkg8.pkg1;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta() {
        super(0, 0);
        this.segundos = 0;
    }

    public HoraExacta(int Horas, int Minutos, int Segundos) {
        super(Horas, Minutos);
        this.segundos = Segundos;
    }

    public boolean setSegundos(int valor) {
        boolean modificado = false;
        if (valor >= 0 && valor <= 59) {
            this.segundos = valor;
            modificado = true;
        }
        return modificado;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc(); //Como lo que hacemos es subir un minuto, llamamos al metodo inc() de la clase padre que realiza esta función.
        }
    }

    @Override
    public String toString() {
        String cadena = super.toString(); //Aprovechamos el metodo de la clase padre, y le añadimos un nuevo elemento.
        cadena += ":" + segundos;
        return cadena;
    }

    
    // Ejercicio 8.3
    @Override
    public boolean equals(Object otraHora) {
        HoraExacta otra = (HoraExacta) otraHora;
        boolean coinciden = false;
        if (this.getHoras() == otra.getHoras()
                && this.getMinutos() == otra.getMinutos()
                && this.segundos == otra.segundos) {
            coinciden = true;
        }
        return coinciden;
    }
}
