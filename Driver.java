import java.util.Vector;

public class Driver {

    public static void main(String[] args){

        Vector<NameGenarator> nameGenerated = new Vector<NameGenarator>();


        NameGenarator G1= new NameGenarator();
        NameGenarator G2= new NameGenarator("Mike", "Stephens","Polo","Glasgow");
        NameGenarator G3= new NameGenarator("Stephen", "Mike","jordie","Inverness");
        NameGenarator G4= new NameGenarator("Paul", "Walker","keay","Edinburgh");



        nameGenerated.add(G1);
        nameGenerated.add(G2);
        nameGenerated.add(G3);
        nameGenerated.add(G4);

        NameGenarator show;

        for (int x=0; x<nameGenerated.size(); x++){

            show=nameGenerated.get(x);
            show.displayStartWarsName();

        }


    }
}
