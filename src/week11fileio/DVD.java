package week11fileio;

public class DVD {

    private String title, director;
    private double cost;

    public DVD() {
        this.title = "";
        this.director = "";
        this.cost = 0.0;
    }

    public DVD(String name, String singer, double price) {
        this.title = name;
        this.director = singer;
        this.cost = price;
    }

    public String getName() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {

        String description;

        description = "Cost: " + String.format("€%,.2f",getCost()) + "\n" + "Title: " + getName() + "\n"
                + "Director: " + getDirector();
        description += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~";

        return description;
    }

}
