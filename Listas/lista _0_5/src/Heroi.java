public class Heroi{
    private int id;
    private String nome;
    private int quantidadeDeOuro;


    public Heroi(){}

    public Heroi(int id, String nome,int quantidadeDeOuro){
        this.id = id;
        this.nome = nome;
        this.quantidadeDeOuro = quantidadeDeOuro;
    }

    public int getid(){
        return this.id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getnome(){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public int getquantidadeDeOuro(){
        return this.quantidadeDeOuro;
    }
    public void setquantidadeDeOuro(int quantidadeDeOuro){
        this.quantidadeDeOuro = quantidadeDeOuro;
    }
}



