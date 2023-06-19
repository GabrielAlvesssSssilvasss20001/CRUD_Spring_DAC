package ifpb.edu.br.gabriel.crud.domain;

public enum Plataform {
    XBOXSERIESX("Xbox Series X"),
    XBOXSERIESS("Xbox Series S"),
    PLAYSTATION5("Playstation 5"),
    PLAYSTATION4("Playstation 4"),
    PC("PC");

    private String plataform;

    Plataform(String plataform){
        this.plataform = plataform;
    }

    public String getPlataform() {
        return plataform;
    }
}