import java.util.ArrayList;

class Pedrada {
    private static int nextId = 1; // Chave primária auto incrementada
    private int id;
    private String username;
    private long carimboTempo;
    private int gostos;
    private List<Comentario> comentarios;

    public Pedrada(String username) {
        this.id = nextId++;
        this.username = username;
        this.carimboTempo = System.currentTimeMillis(); // Carimbo de tempo atual
        this.gostos = 0;
        this.comentarios = new ArrayList<>();
    }

    public void gosto() {
        gostos++;
    }

    public void tragosto() {
        if (gostos > 0) {
            gostos--;
        }
    }

    public Comentario masriola() {
        Comentario comentario = new Comentario();
        comentarios.add(comentario);
        return comentario;
    }

    public long getCarimboTempo() {
        return carimboTempo;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Carimbo de Tempo: " + carimboTempo);
        System.out.println("Gostos: " + gostos);
        System.out.println("Comentários:");
        for (Comentario comentario : comentarios) {
            comentario.display();
        }
        System.out.println();
    }
}
