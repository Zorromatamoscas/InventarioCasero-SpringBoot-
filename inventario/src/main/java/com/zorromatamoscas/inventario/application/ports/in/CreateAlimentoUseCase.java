package com.zorromatamoscas.inventario.application.ports.in;

import com.zorromatamoscas.inventario.domain.model.Alimento;

public interface CreateAlimentoUseCase {
    
    Alimento createAlimento(Alimento alimento);
}
