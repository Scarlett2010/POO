public class Videojuego {
    public String nombre_j;
    public String n_animal;
    public String caracteristica;
    public String entorno;

    public Videojuego(String nombre_j, String n_animal, String caracteristica, String entorno) {
        this.nombre_j = nombre_j;
        this.n_animal = n_animal;
        this.caracteristica = caracteristica;
        this.entorno = entorno;
    }

    public void proteger() {
        System.out.println("Servira de escudo para Crash");
    }

    public void saltar() {
        System.out.println("Crash salta");
    }

    public static void main(String[] args) {
        Videojuego personaje_p = new Videojuego("Crash Bandicoot N. Sane Trilogy", "Crash Bandicoot", "marsupail", "Isla");
        Videojuego personaje_d = new Videojuego("Crash Bandicoot N. Sane Trilogy", "DoctorVil", "Doctor loco", "Isla");
        Videojuego personaje_m = new Videojuego("Crash Bandicoot N. Sane Trilogy", "Mask", "mascara que sirve de escudo", "Isla");
        System.out.println("-- Bienvenido al juego " + personaje_p.nombre_j);
        System.out.println("Los datos son: nombre " + personaje_p.n_animal + " , caracteristica " + personaje_p.caracteristica);
        System.out.println("Los datos son: nombre " + personaje_d.n_animal + " , caracteristica " + personaje_d.caracteristica);
        System.out.println("Los datos son: nombre " + personaje_m.n_animal + " , caracteristica " + personaje_m.caracteristica);
        personaje_m.proteger();
        personaje_p.saltar();
    }
}