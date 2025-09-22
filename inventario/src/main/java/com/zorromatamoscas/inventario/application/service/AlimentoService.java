package com.zorromatamoscas.inventario.application.service;

import org.springframework.stereotype.Service;

import com.zorromatamoscas.inventario.application.ports.in.CreateAlimentoUseCase;
import com.zorromatamoscas.inventario.application.ports.out.AlimentoRepoPort;
import com.zorromatamoscas.inventario.domain.model.Alimento;

@Service
public class AlimentoService implements CreateAlimentoUseCase {

    private final AlimentoRepoPort repo;

    public AlimentoService (AlimentoRepoPort repo)
    {
        this.repo = repo;
    }

    @Override
    public Alimento createAlimento(Alimento alimento) {
        return repo.save(alimento);
    }

}
