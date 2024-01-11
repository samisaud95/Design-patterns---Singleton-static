//Creo classe con due parametri privati
public class User {
    private String nome;
    private Integer eta;
    private static User user;

    private User(){}

    public static User getInstance(){
        if(user == null){
            user= new User();
        }
        return user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        User.user = user;
    }

    //Creo una funzione che me permette stampare la informazione dichiarata
    public void stampaUserInformazione() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }
}
