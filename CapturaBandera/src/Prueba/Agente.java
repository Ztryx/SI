package Prueba;
import jade.core.AID;
import jade.core.Agent;
import jade.domain.FIPANames.InteractionProtocol;
import jade.domain.FIPAException;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.lang.acl.ACLMessage;



/**
 * Created by Hankyx on 04/05/2015.
 */
public class Agente extends Agent{

    Mapa mapa;
    int x=0;
    int y=0;
    int mapaWidth=0;
    int mapaHeight=0;


    protected void setup() {
        DFAgentDescription template = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType("SERVIDOR_CTF");
        sd.setName("SERVIDOR_2015");
        template.addServices(sd);

        try {
            DFService.search(this, template);
            System.out.println("JUEGO");
        }
        catch (FIPAException f){}

        ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
        msg.setContent("7");
        msg.setProtocol(InteractionProtocol.FIPA_REQUEST);
        ConexionPr con  = new ConexionPr(this, msg);
        Cuenta cun = new Cuenta();

        this.addBehaviour(new ConexionPr(this,msg));
        this.addBehaviour(cun);
    }

    public void setMap(String mapa){
        this.mapa = new Mapa(mapa, mapaWidth, mapaHeight);
    }
}
