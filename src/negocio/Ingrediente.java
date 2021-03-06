package negocio;


import dao.IngredienteDAO;
import entities.IngredienteEntity;

public class Ingrediente {
	
	private int ingrediente_id;
	private String nombre;
	private String medida;	
	
	public Ingrediente(int Ingrediente_Id, String Nombre, String Medida) {
		ingrediente_id = Ingrediente_Id;
		nombre         = Nombre;
		medida         = Medida;
	}
	
	public Ingrediente(IngredienteEntity ingrediente) {
		ingrediente_id = ingrediente.getIngrediente_id();
		nombre         = ingrediente.getNombre();
		medida         = ingrediente.getMedida();
	}
	
	public void save() {
		//############################ CHEQUEAR ERROR ################
		//IngredienteDAO.getInstancia().grabar();
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
