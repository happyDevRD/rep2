package com.greenaall.models.pa.entity;

public class HabitantePK implements java.io.Serializable {

	private static final long serialVersionUID = -7051853318182937214L;
	private Long idHisHabit;
	private Long idHabit;

	public Long getIdHisHabit() {
		return idHisHabit;
	}

	public void setIdHisHabit(Long idHisHabit) {
		this.idHisHabit = idHisHabit;
	}

	public Long getIdHabit() {
		return idHabit;
	}

	public void setIdHabit(Long idHabit) {
		this.idHabit = idHabit;
	}

	public HabitantePK(Long idHisHabit, Long idHabit) {
		super();
		this.idHisHabit = idHisHabit;
		this.idHabit = idHabit;
	}

	public HabitantePK() {
		super();
	}

}
