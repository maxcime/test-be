### Applicazione Test BE ###

L'applicazione è composta 4 classi:

- Product: è l'oggetto prodotto con le proprità: productType(ProductType, isImported(boolean), price(double), name(String), quantity(int)
- ProductType: è un Enum per differenziare i prodotti
- CalculateTaxes: contiene il metodo per calcolare le tasse del prodotto.
- PrintReceipt: contiene il metodo per poter stampare la ricevuta.

App.java contiene un Main in cui si inseriscono i prodotti per i 3 input richiesti e viene lanciata la "stampa" della ricevuta.

Il risultato è un output in cui vengono stampate le ricevute come richieste. 

I calcoli delle tasse sembrano rispecchiare il documento, ad eccezione dell'ultimo prodotto del terzo output:

- 1 box of imported chocolates at 11.25 --> tassa del 5% = 0,5625. Considetanto l'intorno più vicino dello 0,05 il sistema calcola una tassa di 0,55 e non di 0,60 come nel documento.

E' stato creato inoltre un test che esegue le stesse operazioni del Main.

Il progetto è stato pushato su un repository github: https://github.com/maxcime/test-be.git

Questo repository è stato collegato a Travis CI, per poter effetturare i test dell'applicazione, com'è possibile vedere dalla stessa pagina github.

