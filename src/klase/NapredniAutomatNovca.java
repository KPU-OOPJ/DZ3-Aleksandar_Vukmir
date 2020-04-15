package klase;

import interfejs.AutomatNovcaInterfejs;


public class NapredniAutomatNovca implements AutomatNovcaInterfejs{

    private double stanje = 20000;
    @Override
    public void uloziNovac(double iznos) {
        if (iznos > 20000){
            System.out.println("Maksimalan iznos za ulaganje novca je 20 000 dinara");
            return;
        }
        if (iznos < 0)
            System.out.println("Greska, iznos je manji od 0!");
        
    }

    @Override
    public void podigniNovac(double iznos) {
        if (iznos > 20000){
            System.out.println("Maksimalan iznos za podizanje novca je 10 000 dinara");
            return;
        }
        if (iznos < 0){
            System.out.println("Greska, iznos je manji od 0!");
            return;
        }
        stanje-=iznos;
        
        
    }
    
    public void ispisi(){
        System.out.println("Trenutno stanje u automatu: "+ stanje);
        
        if (stanje > 10000)
                System.out.println("Maksimalan iznos koji se moze podici u jednoj transakciji je: 10 000 din");
        else 
            System.out.println("Maksimalan iznos koji se moze podici u jednoj transakciji je: " + stanje);
        System.out.println("U jednoj transakciji se moze uplatiti 20 000 din");

    }
}
