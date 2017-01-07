package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mole.data.entities.MoleUserCredentialsEntity;
import com.mole.data.entities.MoleUserEntity;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManager");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		try{
			txn.begin();
			
			MoleUserEntity userEntity = new MoleUserEntity();
			userEntity.setUserEmailId("santhosh.piduri@gmail.com");
			userEntity.setUserName("Santhosh");
			
			MoleUserCredentialsEntity credentials = new MoleUserCredentialsEntity();
			credentials.setPassword("password");
			
			userEntity.setUserCredentials(credentials);
			
			entityManager.persist(userEntity);
			
			txn.commit();
			
		}catch(Exception e){
			if(txn!=null){
				txn.rollback();
			}
			e.printStackTrace();
		}finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		
		
	}
}
