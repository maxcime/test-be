### Applicazione Test BE ###

App.java contiene un main in cui si inseriscono i prodotti per i 3 input richiesti e viene lanciata la "stampa" della ricevuta.

Il risultato è un output in cui vengono stampate le ricevute come richieste. 
I calcoli delle tasse sembrano rispecchiare il documento, ad eccezione dell'ultimo prodotto del terzo output:

1 box of imported chocolates at 11.25 --> tassa del 5% = 0,5625. Considetanto l'intorno più vicino dello 0,05 il sistema calcola una tassa di 0,55 e non di 0,60 come nel documento.

