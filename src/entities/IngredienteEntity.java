package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingredientes")
public class IngredienteEntity {

	@Id
	private int ingrediente_id;
	private String nombre;
	private String medida;
	
	public IngredienteEntity() {}
	
	public IngredienteEntity(int Ingrediente_Id, String Nombre, String Medida) {
		ingrediente_id = Ingrediente_Id;
		nombre         = Nombre;
		medida         = Medida;
	}

	public int getIngrediente_id() {
		return ingrediente_id;
	}

	public void setIngrediente_id(int ingrediente_id) {
		this.ingrediente_id = ingrediente_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	
	

}
