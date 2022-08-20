package Homework5;

public class College{

    public static void main(String []args){
        Student student = new Student(20,"Delyan","QA");
        student.grade = 5.0;

        Student student2 = new Student(20,"Delyan2","QA");
        student2.grade = 6.0;

        StudentGroup studentGroup = new StudentGroup();

        studentGroup.addStudent(student);
        studentGroup.addStudent(student2);

        String theBestStudent = studentGroup.theBestStudent();

        System.out.println(theBestStudent);
    }
}

class StudentGroup
{
    String groupSubject;
    int freePlaces;
    Student[] students;

    StudentGroup()
    {
        students = new Student[1];
        freePlaces = 5;
    }

    StudentGroup(String subject)
    {
        this.groupSubject = subject;
    }

    void addStudent(Student s)
    {
        if(students.length < 6)
        {
            students[0] = s;
            freePlaces = freePlaces + 1;
        }
    }

    void emptyGroup()
    {
        Student students[] = new Student[5];
    }

    String theBestStudent()
    {
        double maxValue = 0;
        String bestStudent = "";
        for (int i = 0; i < students.length; i++) {
            if(students[i].grade > maxValue) {
                bestStudent = students[i].name;
            }
        }

        return bestStudent;
    }

    void printStudentsInGroup()
    {}
}

class Student {

    String name;
    String subject;
    double grade;
    int yearInCollage;
    int age;
    boolean isDegree;
    double money;

    Student() {
        this.grade = 4.0;
        this.yearInCollage = 1;
        this.isDegree = false;
        this.money = 0;
        this.age = 36;
    }

    Student(int ageParam, String nameParam, String subjectParam) {
        this();
        this.name = nameParam;
        this.age = ageParam;
        this.subject = subjectParam;
    }

    void upYear() {
        if (isDegree) {
            System.out.println("The student has already graduated");
            return;
        }
        yearInCollage++;
        if (yearInCollage == 4) {
            isDegree = true;
        }
    }

    double sumDoubleNumbers(double numOne, double numTwo) {
        double sum = numOne + numTwo;
        return sum;
    }

    double receiveSchollarship(double min, double amount) {
        if (min <= grade && age < 30) {
            this.money = this.money + amount;
        }
        return this.money;
    }

}
