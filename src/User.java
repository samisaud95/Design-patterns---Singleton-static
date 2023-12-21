//Creo classe con due parametri privati
public class User {
    private String nome;
    private Integer eta;
    //Faccio getters e setters

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

    User(String nome, Integer eta){
        this.nome=nome;
        this.eta=eta;

    }
    //Creo una funzione che me permette stampare la informazione dichiarata
    public void stampaUserInformazione() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }
}
