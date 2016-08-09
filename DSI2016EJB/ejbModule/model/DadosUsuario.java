package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DadosUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dados;
	private long oid;

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public int getDados() {
		return dados;
	}

	public void setDados(int dados) {
		this.dados = dados;
	}
	

}
