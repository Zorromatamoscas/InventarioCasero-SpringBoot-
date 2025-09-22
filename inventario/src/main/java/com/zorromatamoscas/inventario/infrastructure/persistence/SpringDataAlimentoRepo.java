package com.zorromatamoscas.inventario.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


public interface  SpringDataAlimentoRepo extends JpaRepository<AlimentoEntity,Long>  {

}
