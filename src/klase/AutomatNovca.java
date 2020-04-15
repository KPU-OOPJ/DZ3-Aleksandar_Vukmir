package klase;

import interfejs.AutomatNovcaInterfejs;


public class AutomatNovca implements AutomatNovcaInterfejs{

    private double stanje = 5000;
    @Override
    public void uloziNovac(double iznos) {
        if (iznos > 0)
            stanje += iznos;
        else 
            System.out.println("Greska, iznos mora biti veci od 0!");
    }

    @Override
    public void podigniNovac(double iznos) {
    if (iznos > 0 && stanje >= iznos)
            stanje -= iznos;
        else if (iznos < 0)
            System.out.println("Greska, iznos mora biti veci od 0!");
        else 
            System.out.println("Greska, nema dovoljno novca u automatu!");
    }
    
    public void ispisi(){
        System.out.println("Trenutno stanje u automatu: "+ stanje);
    }
}
