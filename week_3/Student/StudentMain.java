class Student {
    String name;
    double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double calculateAverage() {
        double amount = 0.0;
        for (double grade : grades) {
            amount += grade;
        }
        return amount/grades.length;
    }
}

class StudentMain {
    public static void main(String[] args) {
        double[] grades = {3, 4, 5, 3.2};
        Student diak = new Student("Alice", grades);
        System.out.println("Name: " + diak.name);
        System.out.println("Average: " + diak.calculateAverage());
    }
}