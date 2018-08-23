public class Student {

    private String name;
    private String lastname;
    private int age;
    private Gender gender;
    private String address;
    private String accountNumber;
    private boolean isForeign;

    public Student() { }

    public Student(String name, String lastname, int age, Gender gender, String address,
    String accountNumber, boolean isForeign) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender; 
        this.address = address;
        this.accountNumber = accountNumber;
        this.isForeign = isForeign;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAsAMale() {
        this.gender = Gender.MALE;
    }

    public void setAsAFemale() {
        this.gender = Gender.FEMALE;
    }

    public void setAsForeign() {
        this.isForeign = true;
    }

    public void setAsLocal() {
        this.isForeign = false;
    }

    public boolean validState() {
        return (this.name!= null) && (this.lastname!=null);
    }

    public String toString() {
        return this.name + ", " + this.lastname + ", " + this.accountNumber;
    }
    
}