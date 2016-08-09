package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class EstilosMusica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rock;
	private int sertanejo;
	private long oid;

	
	

	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public int getRock() {
		return rock;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public int getSertanejo() {
		return sertanejo;
	}
	public void setSertanejo(int sertanejo) {
		this.sertanejo = sertanejo;
	}
	

}
