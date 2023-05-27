import java.util.ArrayList;
public class Grupo{
    private   ArrayList<Heroi>heroi;
    private int totalMoedsDeOuro;

    public  Grupo(){
        this.heroi = new ArrayList<>();
    }



    public void adicionarHeroi(Heroi heroi){
        this.heroi.add(heroi);
        this.totalMoedsDeOuro = this.totalMoedsDeOuro + heroi.getquantidadeDeOuro();
        System.out.println("o heroi" + heroi.getnome() + " ao grupo!");

    }
    public void removeHeroi(int idHeroi){
        for (int i = 0; i < heroi.size(); i++){
            this.totalMoedsDeOuro = this.totalMoedsDeOuro - heroi.get(i).getquantidadeDeOuro();
            System.out.println("Heroi" + heroi.get(i).getnome() +" removido com sucesso! " );
            heroi.remove(i);
            return;
        }
        System.out.println(" o heroi solicitado esta ocupado...");
    }
    public int getTotalMoedsDeOuro(){
        return this.totalMoedsDeOuro;
    }
    public void setTotalMoedsDeOuro(int id){
        this.totalMoedsDeOuro = totalMoedsDeOuro;
    }

    public ArrayList<Heroi> getHeroi() {
        return heroi;
    }
    public Void setHeroi(ArrayList<Heroi> heroi){
        this.heroi = heroi;
    }
}





