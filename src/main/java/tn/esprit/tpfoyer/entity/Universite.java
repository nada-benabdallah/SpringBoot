package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class  Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Foyer foyer;
}
