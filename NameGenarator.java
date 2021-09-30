import java.sql.SQLOutput;
import java.util.Scanner;

public class NameGenarator {

    private String name;
    private String surname;
    private String starWarsName;
    private String mumsMaiden;
    private String placeOfBirth;

    Scanner kboard = new Scanner(System.in);


    public NameGenarator(String name, String surname, String MsMaiden, String POB){

        this.setName(name);
        this.setSurname(surname);
        this.setMothersMaidenName(MsMaiden);
        this.setPob(POB);
        this.generateStarWarsName();


    }


    public NameGenarator(){

     this.setName();
     this.setSurname();
     this.setMothersMaidenName();
        this.setPob();
     this.generateStarWarsName();


    }

    public void setName(){

        System.out.println("Please enter forname");
        this.name= kboard.next();

    }

    public void setName(String name){

        this.name=name;
    }

    public void setSurname(){

        System.out.println("Please enter surname");
        this.surname= kboard.next();
    }

    public void setSurname(String surname){

        this.surname=surname;
    }

    public void setMothersMaidenName(){

        System.out.println("Please enter your mothers maiden name");
        this.mumsMaiden=kboard.next();
    }

    public void setMothersMaidenName(String Mum){

        this.mumsMaiden=Mum;
    }

    public void setPob(){

        System.out.println("Please enter your place of birth");
        this.placeOfBirth=kboard.next();

    }

    public void setPob(String POB){

        this.placeOfBirth=POB;

    }




    public void generateStarWarsName(){

        String StwForename;
        String StwSurname;

        StwForename=this.name.substring(0, 3)+this.surname.substring(0,2);
        StwSurname=this.mumsMaiden.substring(0,2)+this.placeOfBirth.substring(0,3);

        this.starWarsName=StwForename+" "+StwSurname;


    }

    public void displayStartWarsName(){

        System.out.println("Your star wars name is: "+this.starWarsName);

    }



}
