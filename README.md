**Napravite klase AutomatNovcaInterfejs, AutomatNovca, NapredniAutomatNovca i TestAutomatNovca sa sledećim uslovima:**

a)	Interfejs AutomatNovcaInterfejs koji ima: 
-	Metodu uloziNovac koja ne vraća ništa, a ima kao ulazni argument iznos koji se želi uneti (npr. 123,45 din). 
-	Metodu podigniNovac koja ne vraća ništa, a ima kao ulazni argument iznos koji se želi podići (npr. 123,45 din). 

b)	Klasa AutomatNovca koja implementira interfejs AutomatNovcaInterfejs i ima: 
-	Atribut stanje koji predstavlja količinu novca koja se nalazi u automatu. Početno stanje je 5000.0 din. 
-	Implementiranu metodu uloziNovac. Ova metoda vrši ulaganje tj. dodavanje unetog iznosa na trenutno stanje samo ako je uneti iznos veći od nule. U suprotnom, ispisuje se poruka o grešci. 
-	Implementiranu metodu podigniNovac. Ova metoda vrši podizanje željenog iznosa tj, smanjivanje stanja samo ako je uneti iznos veći od nule i ako u automatu ima dovoljno novca. U suprotnom, ispisuje se poruka o grešci. 
-	Metodu ispisi koja ispisuje koliko još novca ima u automatu. 

c)	Klasa NapredniAutomatNovca koja implementira interfejs AutomatNovcaInterfejs i ima: 
-	Atribut stanje koji predstavlja količinu novca koja se nalazi u automatu. Početno stanje je 20000.0 din. 
-	Implementiranu metodu uloziNovac. Ova metoda vrši ulaganje tj. dodavanje unetog iznosa na trenutno stanje. Maksimalni iznos koji se može uplatiti je 20.000 dinara. Ako se ovaj iznos prekorači, potrebno je ispisati poruku o tome da je maksimalni iznos koji se može uplatiti 20.000 dinara. Ako je uneta vrednost za iznos manja od nule ispisuje se poruka o grešci. 
-	Implementiranu metodu podigniNovac. Ova metoda vrši podizanje željenog iznosa tj, smanjivanje stanja. Maksimalni iznos koji se može podići je 10.000 dinara. Ako se ovaj iznos prekorači, potrebno je ispisati poruku o tome da je maksimalni iznos koji se može podići 10.000 dinara. Ako je uneta vrednost za iznos manja od nule ispisuje se poruka o grešci. 
-	Metodu ispisi koja ispisuje koliko još novca ima u automatu i koji su maksimalni iznosi koji se mogu uplaiti tj. podići u jednoj transakciji. 

d)	Klasa TestAutomatNovca koja pravi po jedan objekat klase AutomatNovca i NapredniAutomatNovca i ulaže u prvi 3000 din, a iz drugog podiže 9.999 dinara. Ispisati stanje svakog automata novca. 
