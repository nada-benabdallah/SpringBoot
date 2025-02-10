package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @ManyToOne
    @JoinColumn(name = "bloc_id")
    private Bloc bloc;
}
