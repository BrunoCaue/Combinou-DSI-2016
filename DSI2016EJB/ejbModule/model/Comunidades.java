package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Comunidades {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	private int comunidade;

	public int getComunidade() {
		return comunidade;
	}

	public void setComunidade(int comunidade) {
		this.comunidade = comunidade;
	}
	

}
