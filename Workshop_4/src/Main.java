import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int option;
        int count = 0;

        Song[] songs = new Song[8];

        do{
            System.out.println("\n Biblioteca de canciones");
            System.out.println("1. agregar una cancion");
            System.out.println("2. mostrar biblioteca de canciones");
            System.out.println("3. filtrar por genero");
            System.out.println("4. filtrar por anio");
            System.out.println("5. crear playList");
            System.out.println("Digite una opcion");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Registro de canciones");
                    songs[count] = new Song();
                    songs[count].setId(count);

                    System.out.println("title:");
                    songs[count].setTitle(sc.next());

                    System.out.println("Duration:");
                    songs[count].setDuration(sc.next());

                    System.out.println("Gender:");
                    songs[count].setGender(sc.next());

                    System.out.println("description:");
                    songs[count].setDescription(sc.next());

                    System.out.println("Cover:");
                    songs[count].setCover(sc.next());

                    System.out.println("Anio:");
                    songs[count].setAnio(sc.next());

                    count = count + 1;
                }
                case 2 -> {
                    System.out.println("Biblioteca de canciones");
                    System.out.println("");
                    for (int i = 0; i < count; i++) {
                        System.out.println("*" + songs[i].getTitle());
                    }
                    System.out.println("No hay canciones");
                }
                case 3 -> {
                    System.out.println("Buscar cancion");
                    String gender = sc.next();

                    for (int i = 0; i < count; i++) {
                        if( gender == songs[i].getGender()){
                            System.out.println(songs[i].getTitle());
                            System.out.println(songs[i].getGender());
                        }
                        else {
                            System.out.println("No hay canciones de ese genero");
                        }
                    }
                }
            }
        }while(option != 3);
    }
}
