public class Subject {
    private String name;
    private double point;

    public Subject(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public Subject() {
        this.name = "";
        this.point = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
