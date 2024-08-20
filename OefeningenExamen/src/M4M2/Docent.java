package M4M2;

public class Docent extends Bediende{
    private String specialisatie;
    private Student[] lijststudenten;
    private int aantalStudenten;

    public Docent(String voornaam, String achternaam, Lokaal lokaal, String specialisatie) {
        super(voornaam, achternaam, lokaal);
        this.specialisatie=specialisatie;
        lijststudenten = new Student[100];
        aantalStudenten=0;
    }


    public String getSpecialisatie() {
        return specialisatie;
    }
    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public void voegStudentToe(Student student){
        lijststudenten[aantalStudenten]=student;
        aantalStudenten++;
    }

    @Override
    public String toString(){
        return super.toString() + " en specialisatie " + specialisatie + ".";
    }
}
