package nlc.cMcCaig.member;

/**
 * class to repreent household child
 */
public class Child extends Member {
    private String schoolName;
    private int grade;

    /**
     * @return the attributes of the child
     */
    @Override
    public String toString() {
        return "Child Details: " +
                "name '" + getName() + '\'' +
                ", surname '" + getSurname() + '\'' +
                ", D.O.B '" + getDOB() + '\'' +
                ", gender '" + getGender() + '\'' +
                ", contactNumber '" + getContactNumber() + '\'' +
                ", schoolName '" + schoolName + '\'' +
                ", grade '" + grade + '\'';
    }

    /**
     * @param name          of child
     * @param surname       of child
     * @param DOB           of child
     * @param gender        of child
     * @param contactNumber of child
     * @param schoolName    of child
     * @param grade         of child
     */
    public Child(String name, String surname, String DOB, char gender, Integer contactNumber, String schoolName, int grade) {
        setName(name);
        setSurname(surname);
        setDOB(DOB);
        setGender(gender);
        setContactNumber(contactNumber);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }
}
