package negocio;

import dao.JugadorDAO;
import dto.JugadorDTO;
import entities.JugadorEntity;

public class Jugador {
	/**
	 * Yo soy un objeto de negocio, asi que tengo datos y comportamiento que permite modificar los datos.
	 * */
	
	private String tipo_usuario;
	private String mail;
	private String direccion;
	private String password;
	private String username;
	private String telefono;
	private String usuario_id;
	
	public Jugador(JugadorEntity jugador) {
		this.usuario_id = jugador.getUsuario_id();
		this.tipo_usuario = jugador.getTipo_usuario();
		this.mail = jugador.getMail();
		this.username = jugador.getUsername();
		this.password = jugador.getPassword();
		this.telefono = jugador.getTelefono();
		this.direccion = jugador.getDireccion();
	}
	
	
	public Jugador(String usuario_id, String username, String mail, String telefono, String password, String tipo_usuario, String direccion) {
		super();
		this.tipo_usuario = tipo_usuario;
		this.mail = mail;
		this.direccion = direccion;
		this.password = password;
		this.username = username;
		this.telefono = telefono;
		this.usuario_id = usuario_id;
	}




	public void save(){
		JugadorDAO.getInstance().grabar(this);
	}
	
	public String getUsuario_id() {
		// TODO Auto-generated method stub
		return usuario_id;
	}
	
	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}

	
	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void dummyMetodo()
	{
		System.out.println("Soy un objeto de negocio por lo que tengo comportamiento");
	}
	
	public JugadorDTO toDTO()
	{
		return new JugadorDTO(tipo_usuario, mail, direccion, password, username, 
				telefono, usuario_id);
	}


	
}
