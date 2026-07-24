package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.gf.entity.GfNotificacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_notificacion")
public class ExNotificacion implements Serializable{

	private static final long serialVersionUID = -3346089532852738763L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name = "tareaTramiteExpediente", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TareaTramiteExpediente tareaTramiteExpediente;
    
    @JoinColumn(name = "interesado", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Interesado interesado;

    @JoinColumn(name = "notificacion", referencedColumnName = "id_notif")
    @OneToOne(optional=false, fetch=FetchType.LAZY)
    private GfNotificacion gfNotificacion;
    
    @Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

    public ExNotificacion(Long id) {
        this.id = id;
    }

}
