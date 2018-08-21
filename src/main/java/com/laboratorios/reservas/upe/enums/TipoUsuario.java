package com.laboratorios.reservas.upe.enums;

public enum TipoUsuario {
	
	ADIMININSTRADOR(1, "Adimininstrador"),
	MONITOR(2, "Monitor"),
	PROFESSOR(3, "Professor");
	
	private int cod;
	private String desc;
	
	private TipoUsuario(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
	
	public static TipoUsuario toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoUsuario x : TipoUsuario.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+cod);
	}
}
