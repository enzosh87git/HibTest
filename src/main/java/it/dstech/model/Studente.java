package it.dstech.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Studente {

	@Id
	@GeneratedValue
	private int id;

	private String nome;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "STUD_COR", joinColumns = { @JoinColumn(name = "STUD_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "CORSO_ID") })
	private List<Corso> listCorsi;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COD_FISC_ID")
	private CodFisc codFisc;

	public Studente() {
		listCorsi = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Corso> getListCorsi() {
		return listCorsi;
	}

	public void setListCorsi(List<Corso> listCorsi) {
		this.listCorsi = listCorsi;
	}

	public CodFisc getCodFisc() {
		return codFisc;
	}

	public void setCodFisc(CodFisc codFisc) {
		this.codFisc = codFisc;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", listCorsi=" + listCorsi + ", codFisc=" + codFisc + "]";
	}

}
