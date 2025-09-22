package com.zorromatamoscas.inventario.infrastructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alimentos")
public class AlimentoEntity {
    @Id
    @GeneratedValue
    private final Long id;
    private final String name;
    private final float quantityKg;

    public AlimentoEntity(Long id, String name, float quantityKg)
    {
        this.id = id;
        this.name = name;
        this.quantityKg = quantityKg;
    }

    public Long getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public float getQuantity()
    {
        return this.quantityKg;
    }
}
