package Directory;

import Phonebook.Main;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public static class SubscriberDatabase {

    Database user1 = new Database("Natsu", "Dragneel", "09654861396", "Cubao, Quezon City");
    Database user2 = new Database("Gray", "Fullbuster", "09176869527", "Fairview, Quezon City");
    Database user3 = new Database("Lucy", "Heartfilia", "09574072072", "Tondo, Manila");
    Database user4 = new Database("Erza", "Scarlet", "09201660905", "BGC, Taguig City");
    Database user5 = new Database("Levi", "Ackerman", "09942355193", "Poblacion, Makati City");
    Database user6 = new Database("Mikasa", "Ackerman", "09215274155", "San Mateo, Rizal");
    Database user7 = new Database("Naruto", "Uzumaki", "09626199258", "Bacoor, Cavite");
    Database user8 = new Database("Sasuke", "Uchiha", "09295078877", "Taal, Batangas");
    Database user9 = new Database("Gon", "Freecs", "09929902192", "El Nido, Palawan");
    Database user10 = new Database("Tito", "Boy", "09046095052", "Vigan, Ilocos Sur");

    public static ArrayList<Database> subscriberArray = new ArrayList<>();

    public static SubscriberDatabase() {
        subscriberArray.add(user1);
        subscriberArray.add(user2);
        subscriberArray.add(user3);

    }

}

