package tn.esprit.tp_foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
