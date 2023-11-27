package com.grupoutn.tpintegrador;

import java.util.Date;
import com.grupoutn.tpintegrador.patronesEstado.EstadoIncidente;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incidente_id_seq")
    @SequenceGenerator(name = "incidente_id_seq", sequenceName = "incidente_id_seq", allocationSize = 1)
    private long id;
    private Date fechaPosibleResolucion;
    private String descripcion;
    private Especialidad especialidad;
    private EstadoIncidente estado;
    @ManyToOne(targetEntity = Cliente.class, cascade= CascadeType.ALL, fetch= FetchType.LAZY )
    private Cliente cliente;

    @ManyToOne(targetEntity = Tecnico.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Tecnico tecnico;
    public Incidente (){
    }
    public Incidente(Cliente cliente) {
        this.setCliente(cliente);
    }
}
