public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course c4;
    Course c5;
    Course c6;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3, Course c4, Course c5, Course c6) {

        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int note4, int note5, int note6) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
        if (note4 >= 0 && note4 <= 100) {
            c4.note = note4;
        }
        if (note5 >= 0 && note5 <= 100) {
            c5.note = note5;
        }
        if (note6 >= 0 && note6 <= 100) {
            c6.note = note6;
        }

    }

    void isPass() {
        this.avarage = ((this.c1.note * 0.8) + (this.c2.note * 0.8) + (this.c3.note * 0.8) + (this.c4.note * 0.2) + (this.c5.note * 0.2) + (this.c6.note * 0.2)) / 6.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Başarılı Şekilde Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız.");
        }
        printNote();
    }


    void printNote() {
        System.out.println(c1.name + "\t" + ":" + c1.note);
        System.out.println(c2.name + "\t" + "\t" + ":" + c2.note);
        System.out.println(c3.name + "\t" + ":" + c3.note);
        System.out.println(c4.name + "\t" + ":" + c4.note);
        System.out.println(c5.name + "\t" + "\t" + ":" + c5.note);
        System.out.println(c6.name + "\t" + ":" + c6.note);
        System.out.println("Ortalamanız : " + this.avarage);


    }
}
