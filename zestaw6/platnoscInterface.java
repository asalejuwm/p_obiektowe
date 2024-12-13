public interface platnoscInterface {
    //gettery
    double getKwota();
    String getStatusPlatnosci();
    //settery
    void setKwota(double kwota);
    void setStatusPlatnosci(String statusPlatnosci);
    //reszta funkcji
    String toString();
    boolean equals(Object obj);
    void zaplac();

}
