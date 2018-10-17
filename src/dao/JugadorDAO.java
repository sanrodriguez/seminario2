package dao;

import hbt.HibernateUtil;
import negocio.Jugador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import entities.JugadorEntity;
import exceptions.JugadorException;

public class JugadorDAO {

	/** Yo soy un DAO, asi que no tengo estado, mas que las variable que necesito para instanciarme.
	 *  Nunca voy a tener un método de negocio dentro mio
	 * */
	private static JugadorDAO instancia;
	
	private JugadorDAO() {}
	
	public static JugadorDAO getInstance() {
		if(instancia == null)
			instancia = new JugadorDAO();
		return instancia;
	}

	public Jugador getJugadorById(String usuario_id) throws JugadorException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		JugadorEntity je = (JugadorEntity) session.createQuery("from JugadorEntity where usuario_id= ?")					
					.uniqueResult();
		if(je != null)
			return new Jugador(je);
		else 
			throw new JugadorException("El jugador solicitado no existe");
	}
	
	public void grabar(Jugador jugador){
		JugadorEntity je = new JugadorEntity(jugador.getUsuario_id(), jugador.getUsername(), jugador.getPassword(), 
				jugador.getTelefono(), jugador.getMail(),jugador.getDireccion(), jugador.getTipo_usuario());
		System.out.println("Dao: "+ jugador.getUsuario_id());
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(je);
		session.getTransaction().commit();
		session.close();
	}



}
