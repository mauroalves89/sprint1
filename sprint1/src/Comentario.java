class Comentario {
    private String texto;
    private long dataHora;
    private int gostos;

    public Comentario(String texto) {
        this.texto = texto;
        this.dataHora = System.currentTimeMillis(); // Data e hora atual
        this.gostos = 0;
    }

    public Comentario responder() {
        Comentario resposta = new Comentario("");
        return resposta;
    }

    public void gosto() {
        gostos++;
    }

    public void tragosto() {
        if (gostos > 0) {
            gostos--;
        }
    }

    public void display() {
        System.out.println("Texto: " + texto);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Gostos: " + gostos);
    }
}
