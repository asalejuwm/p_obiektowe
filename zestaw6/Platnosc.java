public class Platnosc implements platnoscInterface {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(){
        this.kwota = 0;
        this.statusPlatnosci = "Nieoplacone";
    }
    public Platnosc(Zamowienie z, String status){
        this.kwota = z.getKoszykZakupowy().obliczCalkowitaWartosc();
        this.statusPlatnosci = status;
    }
    //gettery
    public double getKwota(){
        return this.kwota;
    }
    public String getStatusPlatnosci(){
        return this.statusPlatnosci;
    }
    //settery
    public void setKwota(double kwota){
        if(kwota<0){throw new IllegalArgumentException("Nie wolno");}
        this.kwota=kwota;
    }
    public void setStatusPlatnosci(String statusPlatnosci){
        if(statusPlatnosci==null){throw new IllegalArgumentException("Nie wolno");}
        this.statusPlatnosci=statusPlatnosci;
    }
    @Override
    public String toString(){
        return "kwota='"+kwota+"', status platnosci='"+statusPlatnosci+"'";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Platnosc other = (Platnosc) obj;
        return Double.compare(kwota, other.kwota) == 0
                && (statusPlatnosci != null ? statusPlatnosci.equals(other.statusPlatnosci) : other.statusPlatnosci == null);
    }

    public void zaplac(){
        this.statusPlatnosci = "Oplacone";
        this.kwota = 0;
    }

}

