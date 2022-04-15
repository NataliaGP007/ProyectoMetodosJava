package ProyectoMetodos;
/*
Desarrollar un algoritmo que pida el nombre del usuario, el día, mes y año actual y el día, mes y año de nacimiento
del usuario. En base a esos datos el algoritmo indica el signo zodiacal, la edad en horas y el número de la suerte
del usuario.

Autor: Natalia Gutiérrez Pineda.
 */

//Clase puclica
public class Metodos {
    //Esta clase indica  la edad, signo sodiacal y numero de la suerte del usuario.
    private int anioNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioActual;
    private int mesActual;
    private int diaActual;
    private int edad;
    private String signoZodiacal;       //Para el tipo de datos string se pone -String-\
    private int numeroSuerte;

    //Sobrecarga de constructores

    //Primer metodo constructor con 3 parametros
    public Metodos(int anioNacimiento, int mesNacimiento, int diaNacimiento) {
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.identificarSignoZodiacal();
        this.calcularNumeroSuerte();
    }

    //Segundo metodo contructor con 6 parametros
    public Metodos(int anioNacimiento, int mesNacimiento, int diaNacimiento, int anioActual, int mesActual, int diaActual) {
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioActual = anioActual;
        this.mesActual = mesActual;
        this.diaActual = diaActual;
        this.identificarSignoZodiacal();
        this.calcularNumeroSuerte();
        this.calcularEdad(2003, 7, 27, 2022, 4, 10);
    }

    //Getters
    public int getedad() { return edad; }

    public String getsignoZodiacal() { return signoZodiacal; }

    public int getnumeroSuerte() { return numeroSuerte; }

    //Metodos de instancia
    public void calcularEdad(int anioNacimiento, int mesNacimiento, int diaNacimiento, int anioActual, int mesActual, int diaActual){
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioActual = anioActual;
        this.mesActual = mesActual;
        this.diaActual = diaActual;
        this.edad = this.anioActual - this.anioNacimiento;
        if ((this.mesActual < this.mesNacimiento) || (this.mesActual == this.mesNacimiento && this.diaActual < this.diaNacimiento)){
            this.edad = this.edad - 1;
        }
        this.edad = this.edad * 8760;
    }

    public void identificarSignoZodiacal(){
        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 22) || (this.mesNacimiento == 1 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Capricornio";}
        if ((this.mesNacimiento == 1 && this.diaNacimiento >= 22) || (this.mesNacimiento == 2 && this.diaNacimiento <= 19)){
            this.signoZodiacal = "Acuario";}
        if ((this.mesNacimiento == 2 && this.diaNacimiento >= 20) || (this.mesNacimiento == 3 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Piscis";}
        if ((this.mesNacimiento == 3 && this.diaNacimiento >= 21) || (this.mesNacimiento == 4 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Aries";}
        if ((this.mesNacimiento == 4 && this.diaNacimiento >= 21) || (this.mesNacimiento == 5 && this.diaNacimiento <= 20)){
            this.signoZodiacal = "Tauro";}
        if ((this.mesNacimiento == 5 && this.diaNacimiento >= 21) || (this.mesNacimiento == 6 && this.diaNacimiento <= 21)){
            this.signoZodiacal = "Géminis";}
        if ((this.mesNacimiento == 6 && this.diaNacimiento >= 22) || (this.mesNacimiento == 7 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Cáncer";}
        if ((this.mesNacimiento == 7 && this.diaNacimiento >= 23) || (this.mesNacimiento == 8 && this.diaNacimiento <= 23)){
            this.signoZodiacal = "Leo";}
        if ((this.mesNacimiento == 8 && this.diaNacimiento >= 24) || (this.mesNacimiento == 9 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Virgo";}
        if ((this.mesNacimiento == 9 && this.diaNacimiento >= 23) || (this.mesNacimiento == 10 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Libra";}
        if ((this.mesNacimiento == 10 && this.diaNacimiento >= 23) || (this.mesNacimiento == 11 && this.diaNacimiento <= 22)){
            this.signoZodiacal = "Escorpio";}
        if ((this.mesNacimiento == 11 && this.diaNacimiento >= 23) || (this.mesNacimiento == 12 && this.diaNacimiento <= 21)){
            this.signoZodiacal = "Sagitario";}
    }

    public void calcularNumeroSuerte(){
        while (this.anioNacimiento > 0) {
            this.numeroSuerte = this.numeroSuerte + this.anioNacimiento % 10;
            this.anioNacimiento = this.anioNacimiento / 10;
        }

        while (this.numeroSuerte > 9) {
            this.numeroSuerte = this.numeroSuerte - 9;
        }
    }

    //Metodos de clase
    public static int calcularEdadMC(int anioNacimiento, int mesNacimiento, int diaNacimiento, int anioActual, int mesActual, int diaActual){
        int edad = anioActual - anioNacimiento;
        if ((mesActual < mesNacimiento) || (mesActual == mesNacimiento && diaActual < diaNacimiento)){
            edad = edad - 1;
        }
        return edad * 8760;
    }

    public static String identificarSignoZodiacalMC(int mesNacimiento, int diaNacimiento){
        //Este metodo identificará el signo zodiacal del usuario.
        String signoZodiacal = " ";
        if ((mesNacimiento == 12 && diaNacimiento >= 22) || (mesNacimiento == 1 && diaNacimiento <= 20)){
            signoZodiacal = "Capricornio";}
        if ((mesNacimiento == 1 && diaNacimiento >= 22) || (mesNacimiento == 2 && diaNacimiento <= 19)){
            signoZodiacal = "Acuario";}
        if ((mesNacimiento == 2 && diaNacimiento >= 20) || (mesNacimiento == 3 && diaNacimiento <= 20)){
            signoZodiacal = "Piscis";}
        if ((mesNacimiento == 3 && diaNacimiento >= 21) || (mesNacimiento == 4 && diaNacimiento <= 20)){
            signoZodiacal = "Aries";}
        if ((mesNacimiento == 4 && diaNacimiento >= 21) || (mesNacimiento == 5 && diaNacimiento <= 20)){
            signoZodiacal = "Tauro";}
        if ((mesNacimiento == 5 && diaNacimiento >= 21) || (mesNacimiento == 6 && diaNacimiento <= 21)){
            signoZodiacal = "Géminis";}
        if ((mesNacimiento == 6 && diaNacimiento >= 22) || (mesNacimiento == 7 && diaNacimiento <= 22)){
            signoZodiacal = "Cáncer";}
        if ((mesNacimiento == 7 && diaNacimiento >= 23) || (mesNacimiento == 8 && diaNacimiento <= 23)){
            signoZodiacal = "Leo";}
        if ((mesNacimiento == 8 && diaNacimiento >= 24) || (mesNacimiento == 9 && diaNacimiento <= 22)){
            signoZodiacal = "Virgo";}
        if ((mesNacimiento == 9 && diaNacimiento >= 23) || (mesNacimiento == 10 && diaNacimiento <= 22)){
            signoZodiacal = "Libra";}
        if ((mesNacimiento == 10 && diaNacimiento >= 23) || (mesNacimiento == 11 && diaNacimiento <= 22)){
            signoZodiacal = "Escorpio";}
        if ((mesNacimiento == 11 && diaNacimiento >= 23) || (mesNacimiento == 12 && diaNacimiento <= 21)){
            signoZodiacal = "Sagitario";}

        return signoZodiacal;
    }

    public static int calcularNumeroSuerteMC (int anioNacimiento){
        //Este metodo calculará el numero de la suerte del usuario.
        int numeroSuerte = 0;
        while (anioNacimiento > 0){
            numeroSuerte = numeroSuerte + anioNacimiento % 10;
            anioNacimiento = anioNacimiento / 10;}

        while (numeroSuerte > 9){
            numeroSuerte = numeroSuerte - 9;}

        return numeroSuerte;
    }

}
