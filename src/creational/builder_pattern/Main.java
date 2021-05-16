package creational.builder_pattern;

/*
* Separate the construction of a complex object
* from its representation so that the same construction process
* can create different representations.
*
* si tengo un objeto que su creacion tiene variaciones
* */
public class Main {

    public static void main (String[] arg){


        //Persona mayor
        new Persona.Builder( "Milu")
                .setMunicipio("Cundinamarca")
                .setMayor(18)
                .setLugarTrabajo("google")
                .build();

        //Persona mmenor
        new Persona.Builder("Rubi")
                .setMunicipio("Cundinamarca")
                .setMenor(18)
                .setColegio("google")
                .build();

    }
}
