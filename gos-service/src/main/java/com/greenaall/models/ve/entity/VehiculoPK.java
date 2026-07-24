package com.greenaall.models.ve.entity;

public class VehiculoPK implements java.io.Serializable {

	private static final long serialVersionUID = 7723581072164637632L;
	private Long idHisVehic;
	private Long idVehic;

	public Long getIdHisVehic() {
		return idHisVehic;
	}

	public void setIdHisVehic(Long idHisVehic) {
		this.idHisVehic = idHisVehic;
	}

	public Long getIdVehic() {
		return idVehic;
	}

	public void setIdVehic(Long idVehic) {
		this.idVehic = idVehic;
	}

	public VehiculoPK(Long idHisVehic, Long idVehic) {
		super();
		this.idHisVehic = idHisVehic;
		this.idVehic = idVehic;
	}

	public VehiculoPK() {
		super();
	}

}
