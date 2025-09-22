package com.zorromatamoscas.inventario.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zorromatamoscas.inventario.application.ports.in.CreateAlimentoUseCase;
import com.zorromatamoscas.inventario.domain.model.Alimento;
import com.zorromatamoscas.inventario.infrastructure.controller.dto.AlimentoRequest;



@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    private final CreateAlimentoUseCase createAlimentoUseCase;

    public AlimentoController(CreateAlimentoUseCase createAlimentoUseCase)
    {
        this.createAlimentoUseCase = createAlimentoUseCase;
    }

    @PostMapping
    public void createAlimento(@RequestBody AlimentoRequest alimento) {
        
        Alimento newAlimento = new Alimento(null,alimento.name(),alimento.quantityKg());
        this.createAlimentoUseCase.createAlimento(newAlimento);
    }
    
}
