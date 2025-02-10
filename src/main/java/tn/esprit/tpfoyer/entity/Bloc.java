package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "id_foyer")
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;

}
