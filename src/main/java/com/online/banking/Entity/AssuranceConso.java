package com.online.banking.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class AssuranceConso extends Asurance {

	/*@OneToOne
	@JoinColumn(name = "Iddemande", referencedColumnName = "Id")
	@JsonBackReference(value ="demandeCredit" )
	private DemandeCredit demandeCredit;

	public DemandeCredit getDemandeCredit() {
		return demandeCredit;
	}

	public void setDemandeCredit(DemandeCredit demandeCredit) {
		this.demandeCredit = demandeCredit;
	}
*/
	public AssuranceConso() {

	}

	@Override
	public String toString() {
		return "AssuranceConso [ idassurance=" + idassurance + ", prime=" + prime
				+ ", label=" + label + ", type=" + type + "]";
	}
	
}
