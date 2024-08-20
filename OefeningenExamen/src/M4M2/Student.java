package M4M2;

public class Student extends Persoon{
    private int studentennummer;
    private String specialisatie;

    public Student(String voornaam, String achternaam, int studentennummer, String specialisatie) {
        super(voornaam, achternaam);
        this.studentennummer = studentennummer;
        this.specialisatie=specialisatie;
    }

    public int getStudentennummer() {
        return studentennummer;
    }
    public void setStudentennummer(int studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }
    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString(){
        return super.toString() + " heeft studentennummer " + studentennummer + " en specialisatie " + specialisatie + ".";
    }
}
