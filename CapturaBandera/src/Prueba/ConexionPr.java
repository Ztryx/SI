package Prueba;

import jade.lang.acl.ACLMessage;
import jade.proto.SimpleAchieveREInitiator;
import jade.core.Agent;

/**
 * Created by Hankyx on 04/05/2015.
 */
public class ConexionPr extends SimpleAchieveREInitiator{
    Agent a;
    ACLMessage msg;

    public ConexionPr(Agent a, ACLMessage msg){
        super(a,msg);
    }

    @Override
    protected void handleAgree(ACLMessage msg){
        System.out.println("agree: " + msg.getContent());
    }

    @Override
    protected void handleRefuse(ACLMessage msg){
        System.out.println("refuse: " + msg.getContent());
    }

    @Override
    protected void handleInform(ACLMessage msg){
        System.out.println("inform: " + msg.getContent());
    }

    @Override
    protected void handleNotUnderstood(ACLMessage msg){
        System.out.println("Not Understood: " + msg.getContent());
    }

    @Override
    protected void handleOutOfSequence(ACLMessage msg){
        System.out.println("Out of sequence: " + msg.getContent());
    }

}
