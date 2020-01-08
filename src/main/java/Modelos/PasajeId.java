package Modelos;
// Generated 08-ene-2020 19:14:15 by Hibernate Tools 4.3.1.Final

/**
 * PasajeId generated by hbm2java
 */
public class PasajeId implements java.io.Serializable {

	private short pasajeroCod;
	private String identificador;

	public PasajeId() {
	}

	public PasajeId(short pasajeroCod, String identificador) {
		this.pasajeroCod = pasajeroCod;
		this.identificador = identificador;
	}

	public short getPasajeroCod() {
		return this.pasajeroCod;
	}

	public void setPasajeroCod(short pasajeroCod) {
		this.pasajeroCod = pasajeroCod;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PasajeId))
			return false;
		PasajeId castOther = (PasajeId) other;

		return (this.getPasajeroCod() == castOther.getPasajeroCod())
				&& ((this.getIdentificador() == castOther.getIdentificador())
						|| (this.getIdentificador() != null && castOther.getIdentificador() != null
								&& this.getIdentificador().equals(castOther.getIdentificador())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPasajeroCod();
		result = 37 * result + (getIdentificador() == null ? 0 : this.getIdentificador().hashCode());
		return result;
	}

}
