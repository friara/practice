package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.model.Calculations;

@Repository
public interface CalculationsRepository extends JpaRepository<Calculations, String> {

}
