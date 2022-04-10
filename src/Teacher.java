public class Teacher {

    String name;
    String mpho;
    String branch;

    Teacher(String name, String mpho, String branch) {
        this.name = name;
        this.branch = branch;
        this.mpho = mpho;
    }
    void print (){

        System.out.println("Adı     : " + this.name);
        System.out.println("Bölümü  : " + this.branch);
        System.out.println("Telefon : " + this.mpho);
    }



}
