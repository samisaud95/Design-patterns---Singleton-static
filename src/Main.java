//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno
// le informazioni e poi si stamperanno a video

public class Main {
    public static void main(String[] args) {
//Creo due oggeti user, dove ho creato un'istanza
        User user1 = new User("Pedro",15);
        User user2= new User("Pablo",12);

        //Continuop a stampare la informazione già ingresatta, ma solatanto la prima

        System.out.println("Informazioni default per user1:");
        user1.stampaUserInformazione();
        System.out.println();
        // aggiungo informazione nuova cerca di user2

        user2.setNome("Ali");
        user2.setEta(20);

        //Stampo le modifica fatta nel user2 per medio a setters
        System.out.println("Informazione modifica User2");
        user2.stampaUserInformazione();
        //Posso vedere a imformazione di prima anche delle aggiornamento dei dati


    }

}