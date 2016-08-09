package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class PermissaoUsuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long oid;
	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	private int idPermissao;

	public int getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(int idPermissao) {
		this.idPermissao = idPermissao;
	}
	
	
}
