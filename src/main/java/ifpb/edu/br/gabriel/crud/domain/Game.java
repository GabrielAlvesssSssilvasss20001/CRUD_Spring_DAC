package ifpb.edu.br.gabriel.crud.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GAME")
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Game's title is necessary")
    private String title;

    @NotNull(message = "Game's summary is necessary")
    private String summary;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Game's genre(s) is(are) necessary")
    private Genre genre;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Game's current plataform is necessary")
    private Plataform plataform;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Game's current rating is necessary")
    private Rating rating;

    @NotNull(message = "Game's average base price is necessary")
    @Min(value = 1, message = "Game's average base price must be greater than 1")
    private BigDecimal averageBasePrice;

    @NotNull(message = "Game's current price is necessary")
    @Min(value = 1, message = "Game's current base price must be greater than 1")
    private BigDecimal price;

    @NotNull(message = "Game's developer name is necessary")
    private String developer;

    @NotNull(message = "Game's publisher name is necessary")
    private String publisher;

    private LocalDateTime releaseDate;
}