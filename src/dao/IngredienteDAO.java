package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.IngredienteEntity;
import exceptions.IngredienteException;
import hbt.HibernateUtil;
import negocio.Ingrediente;


public class IngredienteDAO {

	private static IngredienteDAO instancia;
	
	private IngredienteDAO () {}
	
	public static Object getInstancia() {
		if (instancia==null) {
			instancia = new IngredienteDAO();
		}
		return instancia;
	}
	
	public Ingrediente getIngredienteById(String ingredinte_id) throws IngredienteException {		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		IngredienteEntity ie = (IngredienteEntity) session.createQuery("from IngredienteEntity where ingrediente_id= ?")					
					.uniqueResult();
		if(ie != null)
			return new Ingrediente(ie);
		else 
			throw new IngredienteException("El ingrediente solicitado no existe");
	}
	
	
	public void grabar(Ingrediente ingrediente){
		IngredienteEntity ie = new IngredienteEntity(ingrediente.getIngrediente_id(),ingrediente.getNombre(),ingrediente.getMedida());
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(ie);
		session.getTransaction().commit();
		session.close();
	}

}
