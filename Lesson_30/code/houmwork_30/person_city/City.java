
package houmwork_30.person_city;

class City {
    private String name;
    private int population;
    private double area;

    public City(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', population=" + population + ", area=" + area + '}';
    }
}
