public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = teacher;

    }

    void addTeacher(Teacher teacher) {
        if (this.teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders Uyuşmamaktadır!");
        }

    }

    void printTeacherİnfo() {
        this.teacher.print();

    }
}
