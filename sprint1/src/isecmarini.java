import java.util.ArrayList;
import java.util.List;

// Classe abstrata representando um membro da rede social
abstract class Isecmarini implements MembroRede {
    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String alcunha;
    private String password;
    private List<Isecmarini> marins;
    private List<Pedrada> nhaspedrada;
    private boolean visivel;

    public Isecmarini(String username, String email, String nome, String apelido, String alcunha, String password) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.alcunha = alcunha;
        this.password = password;
        this.marins = new ArrayList<>();
        this.nhaspedrada = new ArrayList<>();
        this.visivel = true;
    }

}


