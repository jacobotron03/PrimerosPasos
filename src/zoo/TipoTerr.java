package zoo;

public enum TipoTerr {
	NORMAL(1, ""), DESERTICO(2, ""), TROPICAL(3, ""), NEVADO(4, "");

	private Integer indice;
	private String mensaje;

	private TipoTerr(Integer indice, String mensaje) {
		this.indice = indice;
		this.mensaje = mensaje;
	}

	public Integer getIndice() {
		return indice;
	}

	public String getMensaje() {
		return mensaje;
	}
}