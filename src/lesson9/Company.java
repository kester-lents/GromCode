package lesson9;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class Company {
    String name;
    String countryFounded;

    protected String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
