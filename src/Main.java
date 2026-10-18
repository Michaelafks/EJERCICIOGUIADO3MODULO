//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Modulo modulo1 = new Modulo();
    Modulo modulo2 = new Modulo();
    Modulo modulo3 = new Modulo();

    modulo1.nombre = "Login";
    modulo1.version = "1.0";
    modulo1.lenguaje = "Python";
    modulo1.terminado = false;

    modulo2.nombre = "Inventario";
    modulo2.version = "2.0";
    modulo2.lenguaje = "c++";
    modulo2.terminado = true;

    modulo3.nombre = "Reportes";
    modulo3.version = "2.0";
    modulo3.lenguaje = "Java";
    modulo2.terminado = false;

    modulo2.mostrarInformacion();
    modulo2.mostrarVersion();
    modulo2.mostrarEstado();
    modulo2.marcarTerminado();

}
