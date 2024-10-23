package Classwork_18.inheritance.people.model;

public class Human {

    // Поля
    private boolean gender; // модификатор по умолчанию не присутствует
    private double height;
    private double weight;
    private String race;
    private String country;
    private String eyeColor;

    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
