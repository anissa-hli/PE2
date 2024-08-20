package M4M2;

public class Persoon {
    private String voornaam;
    private String achternaam;


    public Persoon(String voornaam, String achternaam){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
    }

    @Override
    public String toString(){
        return voornaam+" "+achternaam;
    }


    public static void main (String[] strgs){
        Student student1=new Student("Anissa","Sahli",489,"Multimedia");
        System.out.println(student1);
    }
}
