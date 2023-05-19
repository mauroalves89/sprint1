import java.util.ArrayList;

class NewsFeed {
    private List<Pedrada> pedradas;

    public NewsFeed() {
        this.pedradas = new ArrayList<>();
    }

    public void addPedrada(Pedrada pedrada) {
        pedradas.add(pedrada);
    }

    public void show() {
        for (Pedrada pedrada : pedradas) {
            pedrada.display();
        }
    }
}

