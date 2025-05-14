public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String newFirstname) {
        this.firstname = newFirstname;
    }

    public void setLastname(String newLastname) {
        this.lastname = newLastname;
    }

    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    public void addSibling(Person newSiblings) {
        Person[] newSibling = new Person[this.siblings.length + 1];
        for (int i = 0; i < siblings.length; i++) {
            newSibling[i] = siblings[i];
        }
        newSibling[newSibling.length - 1] = newSiblings.clone();
        this.siblings = newSibling;
        numberOfSiblings++;
    }

    @Override
    public Person clone() {
        return new Person(this.firstname, this.lastname, this.birthDay, this.birthMonth, this.birthYear, this.ssn);
    }

    public Person[] getSiblings() {
        return this.siblings;
    }
    
}