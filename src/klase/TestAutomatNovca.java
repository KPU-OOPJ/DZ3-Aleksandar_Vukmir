package klase;


public class TestAutomatNovca {
    public static void main(String[] args) {
        AutomatNovca an = new AutomatNovca();
        NapredniAutomatNovca nat = new NapredniAutomatNovca();
        an.uloziNovac(3000);
        an.ispisi();
        
        nat.podigniNovac(9999);
        nat.ispisi();
    }
}
