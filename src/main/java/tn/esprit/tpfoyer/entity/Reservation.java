package tn.esprit.tpfoyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Reservation {

    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "id_chambre")
    private Chambre chambre;

    @ManyToOne
    @JoinColumn(name = "id_etudiant")
    private Etudiant etudiant;

}
