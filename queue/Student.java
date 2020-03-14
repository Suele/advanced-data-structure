public class Student {

    private String name;
    private String graduation;

    public String insertName(String name) {
        return this.name = name;
    }

    public String insertGraduation(String graduation) {
        return this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " - " + "Graduação: " + this.graduation;
    }
}