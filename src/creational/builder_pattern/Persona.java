package creational.builder_pattern;

public class Persona {
    private String nombre;
    private Integer edad;
    private String municipio;
    private String colegio;
    private String lugarTrabajo;

    private Persona() {}

    public static class Builder {
        private Persona persona;

        public Builder(String nombre) {
            persona = new Persona();
            persona.nombre = nombre;
        }

        public Builder setMunicipio(String municipio) {
            persona.municipio = municipio;
            return this;
        }

        public BuilderMayor setMayor(Integer edad) {
            persona.edad = edad;
            return new Persona.BuilderMayor(persona);
        }

        public BuilderMenor setMenor(Integer edad) {
            persona.edad = edad;
            return new Persona.BuilderMenor(persona);
        }

        public Persona build() {
            return persona;
        }
    }

    public static class BuilderMayor {
        private Persona persona;

        public BuilderMayor setLugarTrabajo(String lugarTrabajo) {
            this.persona.lugarTrabajo = lugarTrabajo;
            return this;
        }

        private BuilderMayor(Persona persona) {
            this.persona = persona;
        }

        public Persona build() {
            return persona;
        }
    }

    public static class BuilderMenor {
        private Persona persona;

        public BuilderMenor setColegio(String colegio) {
            persona.colegio = colegio;
            return this;
        }

        private BuilderMenor(Persona persona) {
            this.persona = persona;
        }

        public Persona build() {
            return persona;
        }
    }
}
