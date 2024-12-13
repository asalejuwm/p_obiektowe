public interface adresInterface {
//gettery
String getUlica();
int getNumerDomu();
int getNumerMieszkania();
String getMiasto();
String getKodPocztowy();
//settery
void setUlica(String ulica);
void setNumerDomu(int numerDomu);
void setNumerMieszkania(int numerMieszkania);
void setMiasto(String miasto);
void setKodPocztowy(String kodPocztowy);
//reszta funkcji
String toString();
boolean przed(Adres adres);
}
