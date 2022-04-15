package ProyectoMetodos;

public class Main {
    public static void main(String[] args){
        //Instancia para el primer metodo constructor
        Metodos metodos = new Metodos(2003, 7, 27);
        System.out.println(metodos.getsignoZodiacal());
        System.out.println(metodos.getnumeroSuerte());
        //Instancia para el segundo metodo constructor
        Metodos metodos2 = new Metodos(2003, 7, 27, 2022, 4, 10);
        System.out.println(metodos2.getedad());
        System.out.println(metodos2.getsignoZodiacal());
        System.out.println(metodos2.getnumeroSuerte());
        //Llamado de metodos de clase
        System.out.println(Metodos.calcularEdadMC(2003, 7,27, 2022, 4, 10));
        System.out.println(Metodos.identificarSignoZodiacalMC(7, 27));
        System.out.println(Metodos.calcularNumeroSuerteMC(2003));
    }
}
