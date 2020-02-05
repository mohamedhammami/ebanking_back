package com.online.banking.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AssuranceImmobilier extends  Asurance {




	String housevalue;
	String adress;

	/*@OneToOne
	@JoinColumn(name = "Iddemande", referencedColumnName = "Id")
	@JsonBackReference(value ="demandeCredit1" )
	private DemandeCredit demandeCredit;

	public DemandeCredit getDemandeCredit() {
		return demandeCredit;
	}

	public void setDemandeCredit(DemandeCredit demandeCredit) {
		this.demandeCredit = demandeCredit;
	}
*/
	public AssuranceImmobilier() {
	}
}
