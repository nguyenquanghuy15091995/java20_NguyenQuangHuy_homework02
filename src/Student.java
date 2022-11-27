import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;
    private String stuCode;
    private String name;
    private List<Subject> subjects;
    private double averagePoint;
    private String ranking;

    public Student(int id, String stuCode, String name, List<Subject> subjects) {
        this.id = id;
        this.stuCode = stuCode;
        this.name = name;
        this.subjects = subjects;
    }

    public Student() {
        this.subjects = new ArrayList<Subject>();
    }

    public void initStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        this.id = scanner.nextInt();
        System.out.print("Student code: ");
        this.stuCode = scanner.next();
        System.out.print("Name: ");
        this.name = scanner.next();
        System.out.println("Choose your step: ");
        System.out.println("0. No subject ");
        System.out.println("1. Input subject ");
        int step = scanner.nextInt();
        while (step == 1) {
            Subject subj = new Subject();
            System.out.println("Enter your subject: ");
            System.out.print("Subject name: ");
            subj.setName(scanner.next());
            System.out.print("Subject point: ");
            subj.setPoint(scanner.nextDouble());

            this.subjects.add(subj);

            System.out.println("Choose your step: ");
            System.out.println("0. No subject ");
            System.out.println("1. Input subject ");
            step = scanner.nextInt();
        }

        this.calculateAverage();
        this.rankingFromPoint();
    }

    public void showStudentInfo() {
        System.out.println("Student info: ");
        System.out.println(this.stuCode + " - " + this.name + " - " + this.averagePoint + " - " + this.ranking);
    }

    public void calculateAverage() {
        for (Subject item :
                this.subjects) {
            this.averagePoint += item.getPoint();
        }

        this.averagePoint /= this.subjects.size();
    }

    public void rankingFromPoint() {
        if (this.averagePoint >= 8) {
            this.ranking = "Gioi";
            return;
        }
        if (this.averagePoint >= 6.5) {
            this.ranking = "Kha";
            return;
        }
        if (this.averagePoint >= 4) {
            this.ranking = "Trung binh";
            return;
        }
        this.ranking = "Yeu kem";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
