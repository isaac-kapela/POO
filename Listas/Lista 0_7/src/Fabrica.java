import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<Operario> operarios;

    public Fabrica(){
        this.operarios = new ArrayList<>();
    }
    public List<Operario> getOperarios() {
        return operarios;
    }
    public void adicionarOperario(Operario operario){
        this.operarios.add(operario);
    }
    public void iniarExpediente(){
        for (Operario operario : this.operarios){
            operario.trabalhar();
        }
    }
}
