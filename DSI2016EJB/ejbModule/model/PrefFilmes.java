package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PrefFilmes {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long oid;
@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH})
	public long getOid() {
	return oid;
}

public void setOid(long oid) {
	this.oid = oid;
}

	private int PrefFilmes;

	public int getPrefFilmes() {
		return PrefFilmes;
	}

	public void setPrefFilmes(int prefFilmes) {
		PrefFilmes = prefFilmes;
	}
	
}
