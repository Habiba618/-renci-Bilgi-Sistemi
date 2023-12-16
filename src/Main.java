public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course matS = new Course("Matematik Sözlü", "MAT102", "MAT-S");
        Course fizikS = new Course("Fizik Sözlü", "FZK102", "FZK-S");
        Course kimyaS = new Course("Kimya Sözlü", "KMY102", "KMY-S");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, matS, fizikS, kimyaS );
        s1.addBulkExamNote(50,67,20, 56, 78, 59);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,
                matS, fizikS, kimyaS );
        s2.addBulkExamNote(100,50,40, 67,99,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,
                matS, fizikS, kimyaS );
        s3.addBulkExamNote(50,20,40, 54,29,43);
        s3.isPass();
    }

}
