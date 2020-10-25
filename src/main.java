
public class main {


    public interface IConsumidores {void mostrarUno (String m); }
    public interface IBiConsumidores {void mostrarDos (String m, int v); }
    public interface IMultipleConsumidores {void mostrar (String m, int v, float f); }
    public interface IProveedores {double calc (); }
    public interface IFunciones {double calc (int a); }
    public interface IBiFunciones {Personas crear (String n, int d); }
    public interface IFuncionesUnarios {String minusculas(String str);}
    public interface IBiFuncionesBinarios {String concatenar(String strIni, String strFin);}
    public interface IPredicados {boolean esLargo(String str);}
    public interface IBiPredicados {boolean hayFile (String dir, String fil);}

    public static void main(String[] args) {

        IConsumidores ejCons = mensaje -> System.out.println(mensaje);

        ejCons.mostrarUno("Ejemplo expresión consumidora");

        ejCons.mostrarUno("Otro ejemplo expresión consumidora");

        IBiConsumidores ejBiCons =  (String mensaje, int valor) -> {System.out.println (mensaje + " " + valor);};

        ejBiCons.mostrarDos("Expresión Consumidora con valor: ", 123);

        IMultipleConsumidores ejMultConsumidor = (String mensaje, int valor, float otroValor) -> {System.out.println (mensaje + " " + valor + " Otro Valor " + otroValor);};

        ejMultConsumidor.mostrar("Consumidora Múltiple: ", 123, 455.78F); IProveedores prov =  () -> {return (1+2+3);};

        double x=prov.calc(); System.out.println("Proveedores: " + x);

        IFunciones func =  (int dato) -> {return ((double) dato/2);}; System.out.println("Funciones: " + func.calc(5));

        IBiFunciones funcDos =  (String nom, int doc) -> {return new Personas(nom, doc);};

        System.out.println("Funciones –Nombre Persona: " + funcDos.crear("Juan", 21122).getNombre());
        // sin el GET muestra posiciones de memoria

        funcDos =  (String nom, int doc) -> new Personas(nom, doc);

        System.out.println("Funciones -Documento: " + funcDos.crear("Juan", 21122).getNroDocumento());

        IBiFuncionesBinarios funcBina =  (String mensaje, String otroMensaje) -> mensaje.concat(otroMensaje);

        System.out.println("Mensajes concatenados: " + funcBina.concatenar("Hola ", "Mundo"));

        IPredicados pred =  (String mensaje) -> mensaje.length()>50;

        System.out.println ( ( ( pred.esLargo("Hola a todos ")) ? "Mensaje Largo " :  "Mensaje Corto"));

        IFuncionesUnarios funcUnario =  (String mensaje) -> mensaje.toLowerCase();

        System.out.println("Mensaje en minusculas: " + funcUnario.minusculas("MENSaje En MinUSCULA"));

        IBiPredicados biPred =  (path, arch) -> path.contains("temp") && arch.endsWith("js");

        System.out.println( ( ( biPred.hayFile("c:\\temp", "xxx.js")) ? "Es JavaScript en dir.Temp" : "O no es JavaScript o no está en Temp") );

    }

    }