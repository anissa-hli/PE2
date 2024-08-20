package oefening1;

public class Cirkel {
        private double straal =0;

        private String kleur = "wit";

        public double getStraal(){
            return straal; // or return this.straal?
        }
        public void setStraal(double straal) { this.straal = straal;
        }
        public Cirkel(double straal){
            this.straal=straal;
        }

        public Cirkel(String kleur) {
            this.kleur=kleur;
        }

        public Cirkel(){
            this.straal=0;
            this.kleur="wit";
        }

    public Cirkel(double straal, String kleur){
        this.straal=straal;
        this.kleur=kleur;
    }

    public Cirkel (Cirkel cirkel) {
        this.straal = cirkel.getStraal();
        this.kleur = cirkel.getKleur();
    }



        public String getKleur(){
            return kleur;
        }

        public void setKleur(String kleur){
            kleur=kleur.toLowerCase();
            if(kleur.equals("wit") || kleur.equals("geel")|| kleur.equals("zwart") || kleur.equals("groen")) {
                this.kleur = kleur;
            }
        }

        public String toString() {
            return "Kleur:" + getKleur() + ",Straal:" + getStraal();
        }


        public double geefOmtrek(){
            return (Math.PI * getStraal() * 2);
        }

        public double geefOppervlakte(){
            return (Math.PI * getStraal()*getStraal());
        }

    public static void main(String[] strgs) { //wat is hier het nut van?
        Cirkel cirkel = new Cirkel(1,"zwart");
        System.out.println(cirkel);

        System.out.println("omtrek: " + cirkel.geefOmtrek());

        System.out.println("oppervlakte: " + cirkel.geefOppervlakte());
        System.out.println("afgeronde oppervlakte: " + String.format("%.2f", cirkel.geefOppervlakte()));
    }



    }






