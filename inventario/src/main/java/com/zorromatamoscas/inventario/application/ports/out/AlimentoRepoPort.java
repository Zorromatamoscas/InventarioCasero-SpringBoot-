package com.zorromatamoscas.inventario.application.ports.out;
import com.zorromatamoscas.inventario.domain.model.Alimento;
public interface  AlimentoRepoPort {

    Alimento save (Alimento alimento);
}
