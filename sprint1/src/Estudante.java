class Estudante extends Isecmarini implements GestorEvento {
    private int codigo;
    private String curso;
    private int anoMatricula;
    private int anoCurso;
    private VidaEstudante status;

    public Estudante(String username, String email, String nome, String apelido, String alcunha, String password,
                     int codigo, String curso, int anoMatricula, int anoCurso, VidaEstudante status) {
        super(username, email, nome, apelido, alcunha, password);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.status = status;
    }

    public void mandaPaTurma() {
        // Implementação do método mandaPaTurma
        System.out.println("Mandando mensagem para a turma...");
    }

    // Implementação dos métodos da interface GestorEvento
    public void novo() {
        // Implementação do método novo
    }

    public void novoRecorrente() {
        // Implementação do método novoRecorrente
    }

    public void convidar() {
        // Implementação do método convidar
    }
}
