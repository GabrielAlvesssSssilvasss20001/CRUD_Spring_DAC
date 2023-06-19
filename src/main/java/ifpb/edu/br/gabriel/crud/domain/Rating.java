package ifpb.edu.br.gabriel.crud.domain;

public enum Rating {
    EC("Early Childhood"),
    E("Everyone"),
    E10PLUS("Everyone 10+"),
    T("Teen"),
    M("Mature"),
    RP("Rating Pending"),
    AO("Adults Only");

    private String rating;

    Rating(String rating){
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}