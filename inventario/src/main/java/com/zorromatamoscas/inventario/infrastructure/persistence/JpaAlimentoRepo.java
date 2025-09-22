package com.zorromatamoscas.inventario.infrastructure.persistence;

import org.springframework.stereotype.Repository;

import com.zorromatamoscas.inventario.application.ports.out.AlimentoRepoPort;
import com.zorromatamoscas.inventario.domain.model.Alimento;

@Repository
public class JpaAlimentoRepo implements AlimentoRepoPort  {

    private final SpringDataAlimentoRepo repo;

    
    public JpaAlimentoRepo(SpringDataAlimentoRepo repo) {
        this.repo = repo;
    }


    @Override
    public Alimento save(Alimento alimento) {
        AlimentoEntity entity = new AlimentoEntity(alimento.id(), alimento.name(), alimento.quantityKg());
        final AlimentoEntity saved = this.repo.save(entity); // Esto se hace porque aquí recibe el id supongo.
        return new Alimento(saved.getId(),saved.getName(),saved.getQuantity());
    }

}
