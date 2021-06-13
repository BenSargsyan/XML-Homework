import java.io.Serializable;

public class Computer implements Serializable {
    private String brand;
    private String series;
    private String system;
    private int year;

    public Computer()
    {}

    public Computer(String brand, String series, String system, int year) {
        this.brand = brand;
        this.series = series;
        this.system = system;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", system='" + system + '\'' +
                ", year=" + year +
                '}';
    }

}
