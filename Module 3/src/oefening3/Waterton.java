package oefening3;

public class Waterton {
    private int capaciteit;
    private int inhoud;

    public Waterton(int capaciteit){
        this.capaciteit=capaciteit;
        inhoud=0;
    }
    public Waterton(int capaciteit,int inhoud){
        this.capaciteit=capaciteit;
        this.inhoud=inhoud;
    }
    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public int getInhoud() {
        return inhoud;
    }

    public void setInhoud(int inhoud) {
        this.inhoud = inhoud;
    }

    public boolean opvangenWater(int liter){
        if(capaciteit<(liter+inhoud)){
            inhoud = capaciteit;
            return true;
        }else{
            inhoud+=liter;
            return false;
        }
    }

    public int aftappenWater(int liter){
        if(inhoud -liter<0){
            return inhoud=0;
        }else{
            inhoud-=liter;
            return inhoud;
        }

    }

    public String toString(){
    return "Capaciteit: "+capaciteit+"\nInhoud:"+inhoud;
    }

    public static void main(String[] strgs){
        Waterton waterton=new Waterton(500,250);
        System.out.println(waterton);
        waterton.aftappenWater(300);
        System.out.println(waterton);
        waterton.opvangenWater(600);
        System.out.println(waterton);
    }
}
