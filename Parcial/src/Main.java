import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static ArrayList<Pet> pets = new ArrayList<Pet>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int opcion = 0;
        while(loop){
            Menu();
            try{
                opcion = sc.nextInt(); sc.nextLine();

            switch (opcion){
                case 1:
                    AgregarMacota();
                    break;
                case 2:
                    EliminarMascota();
                    break;
                case 3:
                    VerMascotas();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            }catch (Exception e){
                sc.nextLine();
                System.out.println("Ingrese una opcion valida");
            }

        }

    }

    private static void Menu(){
        System.out.println("Bienvenido a MacoHealth");
        System.out.println("1.Agregar Macota\n2.Eliminar mascota\n3.Ver mascotas en clinica\n4.Salir");
        System.out.println("Ingrese una opcion ");
    }

    private static void AgregarMacota(){
        Pet pet = null;
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre;
        String especie;
        String raza;
        System.out.println("1.Ingrese el nombre"); nombre = sc.nextLine();
        System.out.println("2.Ingrese la especie"); especie = sc.nextLine();
        System.out.println("3.Ingrese la raza"); raza = sc.nextLine();
        System.out.println("Seleccione el tipo de mascota\n1.Gato\n2.Camaleon"); opcion = sc.nextInt(); sc.nextLine();
        switch (opcion){
            case 1:
                String pelo;
                boolean castrado;
                System.out.println("Ingrese el tipo de pelo");
                pelo = sc.nextLine();
                System.out.println("Ingrese true si esta castrado y false si no"); castrado =sc.nextBoolean(); sc.nextLine();
                pet = new Cat(nombre,especie,raza,pelo,castrado);
                break;
            case 2:
                String tipo;
                System.out.println("Ingrese el tipo de camaleon"); tipo = sc.nextLine();
                pet = new Chameleon(nombre,especie,raza,tipo);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        pets.add(pet);
        System.out.println("Se ha agregado exitosamente a " + pet.getName());
    }
    private static void EliminarMascota() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la mascota a eliminar");
        String nombre = sc.nextLine();

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName().equals(nombre)) {
                pets.remove(i);
                System.out.println("Se ha eliminado a la mascota con exito...");
                return;
            }
        }
        System.out.println("No se encontro la mascota");
    }

    private static void VerMascotas(){
        System.out.println("---------");
        int i = 1;
        for(Pet pet : pets){

            System.out.println(i);
            System.out.println(pet.toString());
            System.out.println("-----------");
            i++;
        }
        i = 0;
    }
}