package model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class PrefAtivFisica {
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

	private int PrefAtiv;

	public int getPrefAtiv() {
		return PrefAtiv;
	}

	public void setPrefAtiv(int prefAtiv) {
		PrefAtiv = prefAtiv;
	}
	

}
