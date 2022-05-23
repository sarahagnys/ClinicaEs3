package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Consulta;
import model.Endereco;
import model.Ficha;
import model.Medico;
import model.Paciente;

import java.util.Properties;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
     if(sessionFactory == null) {
         try {
             Configuration configuration = new Configuration();

             //propriedades da conexão
             Properties prop = new Properties();
             prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
             prop.put(Environment.URL, "jdbc:mysql://localhost:3306/clinica?createDatabaseIfNoExist=true");
             prop.put(Environment.USER, "root");
             prop.put(Environment.PASS, "senha123");
             prop.put(Environment.DIALECT, "org.hibernate.dialect.MYSQLDialect");
             prop.put(Environment.SHOW_SQL, "true");
             prop.put(Environment.HBM2DDL_AUTO, "update");

             configuration.setProperties(prop);
             configuration.addAnnotatedClass(Consulta.class);
             configuration.addAnnotatedClass(Endereco.class);
             configuration.addAnnotatedClass(Ficha.class);
             configuration.addAnnotatedClass(Medico.class);
             configuration.addAnnotatedClass(Paciente.class);

             ServiceRegistry registry = new StandardServiceRegistryBuilder()
                     .applySettings(configuration.getProperties())
                     .build();

             sessionFactory = configuration.buildSessionFactory(registry);
         } catch ( Exception e) {
             e.printStackTrace();
         }
     }
     return sessionFactory;
    }
}
