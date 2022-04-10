public class Main1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Euler", "5355555555", "MAT");
        Teacher t2 = new Teacher("Heredot", "5354444444", "TRH");
        Teacher t3 = new Teacher("Pasteur", "5353333333", "BİO");


        Course matematik = new Course("Matematik", "101", "MAT", t1);
        matematik.addTeacher(t1);

        Course matematikVerable = new Course("Matematik", "101", "MAT", t1);
        matematikVerable.addTeacher(t1);

        Course tarih = new Course("Tarih", "101", "TRH", t2);
        tarih.addTeacher(t2);

        Course tarihVerable = new Course("Tarih", "101", "TRH", t2);
        tarihVerable.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BİO", t3);
        biyoloji.addTeacher(t3);

        Course biyolojiVerable = new Course("Biyoloji", "101", "BİO", t3);
        biyolojiVerable.addTeacher(t3);

        Student s1 = new Student("Damat FERİT", "21", "Hababam", matematik, tarih, biyoloji, matematikVerable, tarihVerable, biyolojiVerable);
        s1.addBulkExamNote(100, 80, 55, 90, 90, 80);
        s1.isPass();
        System.out.println("=================");

        Student s2 = new Student("Hayta İSMAİL", "22", "Hababam", matematik, tarih, biyoloji, matematikVerable, tarihVerable, biyolojiVerable);
        s2.addBulkExamNote(90, 85, 65, 78, 95, 100);
        s2.isPass();


    }
}
