package controlador;

import negocio.Jugador;

public class Controlador {

	private static Controlador instancia;

	private Controlador() { }
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	/*public JugadorDTO getJugadorByDNI(String usuario_id) throws JugadorException
	{
		return JugadorDAO.getInstance().getJugadorById(usuario_id).toDTO();
	}*/
	
	public void nuevoJugador(String usuario_id, String username, String mail, String telefono, String password, String tipo_usuario, String direccion)
	{
		System.out.println("Controlador: "+ usuario_id);
		Jugador jugador = new Jugador(usuario_id, tipo_usuario, mail, direccion, password, username, telefono);			
		jugador.save();
		
	}
}
