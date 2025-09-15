package nlc.cMcCaig.member;

/**
 * @author 30202291
 */
public class Member {
    private String name;
    private String surname;
    private String DOB;
    private char gender;
    private int contactNumber;

    /**
     * @return members first name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return members surname
     */
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return members date of birth
     */
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return members gender
     */
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return members contact number
     */
    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

}
