import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        BusquedaPelicula buscar = new BusquedaPelicula();
        System.out.println("Escriba el numero de la pelicula a elegir");
        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = buscar.consultaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado " + e.getMessage());
        }
        catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando el programa");
        }



    }

}
