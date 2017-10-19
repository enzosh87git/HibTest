package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CodFisc {

	@Id
	@GeneratedValue
	private int id;

	private String cod;

	@OneToOne(mappedBy = "codFisc")
	private Studente studente;

	public CodFisc() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	@Override
	public String toString() {
		return "CodFisc [id=" + id + ", cod=" + cod + ", studente=" + studente + "]";
	}

}
