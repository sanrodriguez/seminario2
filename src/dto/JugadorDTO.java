package dto;

import java.io.Serializable;

public class JugadorDTO implements Serializable{

	/**
	 * Yo soy un DTO, asi que tengo solo estado, no tengo comportamiento de ningun tipo, solo acciones asociadas a la presentacion y/o trasferencia de datos
	 * */
	private static final long serialVersionUID = 9142896418624834351L;
	private String tipo_usuario;
	private String mail;
	private String direccion;
	private String password;
	private String username;
	private String telefono;
	private String usuario_id;
	
	public JugadorDTO() {}
	
	
	public JugadorDTO(String tipo_usuario, String mail, String direccion, String password, String username,
			String telefono, String usuario_id) {
		super();
		this.tipo_usuario = tipo_usuario;
		this.mail = mail;
		this.direccion = direccion;
		this.password = password;
		this.username = username;
		this.telefono = telefono;
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


	public String getUsuario_id() {
		return usuario_id;
	}


	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String toString(){
		return username + " " + mail + " " + direccion;
	}
}
