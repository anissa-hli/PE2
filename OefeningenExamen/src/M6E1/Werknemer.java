package M6E1;

import java.util.Set;
import java.util.TreeSet;

public class Werknemer {
    private String voornaam, achternaam;
    Set<String> skills;

    public Werknemer(String voornaam, String achternaam){
        this.voornaam=voornaam;
        this.achternaam=achternaam;
        skills= new TreeSet<>();
    }

    public boolean voegSkillToe(String skill){
      return this.skills.add(skill);
    }

    public boolean verwijderSkill(String skill){
     return this.skills.remove(skill);

    }

    @Override
    public String toString() {
        return voornaam + ' ' + achternaam + " skills zijn " + skills;
    }


    public static void main(String[] args) {
        Werknemer Anissa= new Werknemer("Anissa","Sahli");
        Anissa.voegSkillToe("Kan eten en praten");
        Anissa.voegSkillToe("Kan supersnel lezen");
        Anissa.voegSkillToe("is soms, vaak, hangry");
        Anissa.verwijderSkill("is soms, vaak, hangry");
        System.out.println(Anissa);
    }
}

