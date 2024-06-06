package ru.neoflex.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.practice.model.Calculations;
import ru.neoflex.practice.repository.CalculationsRepository;

import java.util.List;

@Service
public class CalculationsService {
    private final CalculationsRepository repository;
    @Autowired
    public CalculationsService(CalculationsRepository repository) {
        this.repository = repository;
    }

    public List<Calculations> getAll(){
        return repository.findAll();
    }

    public void insert(Calculations calculation){
        repository.save(calculation);
    }
}
