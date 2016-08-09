package model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class PrefMusical {
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

	public int getPrefMusica() {
		return PrefMusica;
	}

	public void setPrefMusica(int prefMusica) {
		PrefMusica = prefMusica;
	}

	private int PrefMusica;

}
