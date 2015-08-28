package concept.model;

public class Spacecraft extends SpaceObject {
    private String founderCompany;
    private String ownsCountry;
    private int yearOfCreating;

    public String getFounderCompany() {
        return founderCompany;
    }

    public void setFounderCompany(String founderCompany) {
        this.founderCompany = founderCompany;
    }

    public String getOwnsCountry() {
        return ownsCountry;
    }

    public void setOwnsCountry(String ownsCountry) {
        this.ownsCountry = ownsCountry;
    }

    public int getYearOfCreating() {
        return yearOfCreating;
    }

    public void setYearOfCreating(int yearOfCreating) {
        this.yearOfCreating = yearOfCreating;
    }
}
