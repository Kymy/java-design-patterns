public class BuilderPattern {

    public static void main(String args[]) {
        Student student = new Student("Kim", "Becerril", 26, Gender.FEMALE, "direccion", null, false);
        System.out.println(student);

        try {
            Student student2 = new StudentBuilder()
                        .withName("Kim")
                        .withLastname("Becerril")
                        .withAge(26)
                        .withFemaleGender()
                        .buildStudent();
            System.out.println(student2);
        } catch (Exception e) {
            System.out.println("Incorrect state of student");
        }
        
    }

}