package ifpb.edu.br.gabriel.crud.domain;

public enum Genre {
    RPG("Role Playing Game"),
    ACTION_ADVENTURE("Adventure"),
    OPEN_WORLD("Open World"),
    SOUS_LIKE("Sous Like");

    private String genre;

    Genre(String genre){
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
