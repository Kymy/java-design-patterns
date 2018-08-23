public class StudentBuilder {
    
    private Student student; //here the composition

    public StudentBuilder() {
        this.student = new Student();
    }

    public StudentBuilder withName(String name) {
        this.student.setName(name);
        return this;
    }

    public StudentBuilder withLastname(String lastname) {
        this.student.setLastname(lastname);
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.student.setAge(age);
        return this;
    }

    public StudentBuilder withAccountNumber(String accountNumber) {
        this.student.setAccountNumber(accountNumber);
        return this;
    }
    
    public StudentBuilder withMaleGender() {
        this.student.setAsAMale();
        return this;
    }

    public StudentBuilder withFemaleGender() {
        this.student.setAsAFemale();
        return this;
    }

    public Student buildStudent() throws Exception {
        if (!this.student.validState()) {
            throw new Exception("Invalid user state");
        }
        return this.student;
    }

}