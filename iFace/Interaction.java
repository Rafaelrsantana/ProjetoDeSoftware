import java.util.Scanner;
import java.util.ArrayList;

public class Interaction {
    private String[] friends = new String[100]; 
    private String[] message = new String[10000];
    private String[] community = new String[100];
    private String[] membros = new String[100];


    public void setFriend(String friends, int i) {
        this.friends[i] = friends;
    }

    public void setMessage(String message, int i) {
        this.message[i] = message;
    }

    public void setCommunity(String community, int i) {
        this.community[i] = community;
        
    }

    public void setMyCommunity(String community, int i, String membros) {
        this.community[i] = community;
        this.membros[i] = membros;
    }

    public void getFriend() {
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] != null) {
                System.out.println(friends[i]);
            }
        }
    }

    public void getMessage() {
        for (int i = 0; i < message.length; i++) {
            if(message[i] != null) {
                System.out.println(message[i]);
            }
        }
    }
    
    public void getCommunity() {
        for (int i = 0; i < community.length; i++) {
            if(community[i] != null) {
                System.out.println(community[i]);
            }
        }
    }

    public void getMembers() {
        for (int i = 0; i < membros.length; i++) {
            if(membros[i] != null) {
                System.out.println(membros[i]);
            }
        }
    }

    public void finish(){
        friends = null;
        message = null;
        community = null;
    }
}