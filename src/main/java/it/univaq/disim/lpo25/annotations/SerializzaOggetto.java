package it.univaq.disim.lpo25.annotations;

import it.univaq.disim.lpo25.annotations.model.Person;

import java.util.logging.Logger;

import it.univaq.disim.lpo25.annotations.model.Corso;

public class SerializzaOggetto {

private static Logger logger = Logger.getLogger(SerializzaOggetto.class.getName());

    private static String serializza (Person person){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"personFirstName\": \"").append(person.getFirstName()).append("\", ");
        //sb.append("\"personLastName\": \"").append(person.getLastName()).append("\", ");
        sb.append("\"personAge\": \"").append(person.getAge()).append("\"");
        sb.append("}");
        return sb.toString();
    }

    private static String serializza (Corso person){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"corsoName\": \"").append(person.getName()).append("\", ");
        sb.append("\"corsoCredit\": \"").append(person.getCredit()).append("\"");
        sb.append("}");
        return sb.toString();
    }


    public static void main(String[] args) {
        Person pa = new Person();
        pa.setFirstName("juri");
        pa.setLastName("di rocco");
        pa.setAge("15");

        String s = serializza(pa);
        logger.info(s);
        
        Corso c1 = new Corso();
        c1.setCredit("6");
        c1.setName("LPO");
        String s2 = serializza(c1);
        logger.info(s2);
    }

}
