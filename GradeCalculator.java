package fall2023;
public class GradeCalculator {
    String name;
    int score;
    char grade;

    // Default constructor
    public GradeCalculator() {
        this.name = "";
        this.score = 0;
        this.grade = ' ';
    }

    // Parameterized constructor
    public GradeCalculator(String name, int score) {
        this.name = name;
        this.score = score;
        calculateGrade();
    }

    void calculateGrade() {
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayGrade() {
        System.out.println("The grade of " + name + " is: " + grade);
    }
}


