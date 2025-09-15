package nlc.cMcCaig.member;

import java.text.DecimalFormat;

/**
 * class to represent an adult
 */
public class Adult extends Member {
    private String occupation;
    private double salary;

    /**
     * [DecimalFormat df = new DecimalFormat("#.##");] to keep the salary to £99.99 format
     */
    DecimalFormat df = new DecimalFormat("#.##");

    /**
     * @return the atributes of the adult
     */
    @Override
    public String toString() {
        return "Adult Details " +
                "name '" + getName() + '\'' +
                ", surname '" + getSurname() + '\'' +
                ", D.O.B '" + getDOB() + '\'' +
                ", gender'" + getGender() + '\'' +
                ", contactNumber='" + getContactNumber() + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=£" + df.format(salary) +
                '}';
    }

    /**
     * @param name          of the adult
     * @param surname       of the adult
     * @param DOB           of the adult
     * @param gender        of the adult
     * @param contactNumber of the adult
     * @param occupation    of the adult
     * @param salary        of the adult
     */
    public Adult(String name, String surname, String DOB, char gender, Integer contactNumber, String occupation, double salary) {
        setName(name);
        setSurname(surname);
        setDOB(DOB);
        setGender(gender);
        setContactNumber(contactNumber);
        this.occupation = occupation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getOccupation() {
        return occupation;
    }
}
