package com.restaurante.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "combo", schema = "localnuevo")
public class Combo {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "idComida")
    private UUID idComida;

    @Column(name = "totalDelCombo")
    private Double totalDelCombo;
}
