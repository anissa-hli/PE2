package M3M1;

public class Adres {
  private String straatnaam;
  private int huisnummer;
  private String bus;
  private int postcode;
  private String woonplaats;

 public Adres(String straatnaam,int huisnummer, String bus, int postcode, String woonplaats){
     this.straatnaam=straatnaam;
     this.huisnummer=huisnummer;
     this.bus=bus;
     setPostcode(postcode);
     this.woonplaats=woonplaats;
 }

    public void setPostcode(int postcode) {
     if(postcode >999 && postcode < 10000){
         this.postcode = postcode;
     }else{
         this.postcode=9999;
     }
    }

    public String toString(){
     return woonplaats + " " + postcode + " " + straatnaam + " " + huisnummer + " " + bus;
 }

 public static void main(String[] strgs){
     Adres adres1=new Adres("Oostendestraat",119,"3D",1080,"Brussel");
     System.out.println(adres1);
 }



}
