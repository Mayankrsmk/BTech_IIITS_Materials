class Doctor{
    // Succesfully writing Doctor class
    // and the below instace variables
    // gives them 3 marks
    String name;
    int id;
    int noPatients;

    // The question asks to create static variables to keep
    // track of instances. They should create the static variables
    // as part of 'Doctor' class.This part carries 2 marks.
    // Alternatively they might have created the static variable
    // in DoctorMain or inside the main-method. In that case
    // give them only 1 mark
    static Doctor instances[] = new Doctor[3];
    static int instCount=0;

    public Doctor(String name, int id, int noPatients) {
        this.name = name;
        this.id = id;
        this.noPatients = noPatients;
        instances[instCount++] = this;
    }

    // The static method for computing average carries 3 marks.
    // This should also be inside 'Doctor' class
    // If its outside of the class give only 2 marks.
    public static int averagePatients(){
        int sum =0;
        for(int i=0;i<instCount;i++){
            sum += instances[i].noPatients;
        }
        return sum/instCount;
    }


}
/**
 * DoctorMain
 */
public class DoctorMain {

    public static void main(String[] args) {

        // creation of three instances gets them 1 marks
        // instead of parameterized constructors, they might opt for
        // default constructor. In that case check whether they are
        // initializing the values in the lines soon after object creation
        Doctor d1 = new Doctor("jack",1,10);
        Doctor d2 = new Doctor("jill",2,20);
        Doctor d3 = new Doctor("tom",3,30);
        System.out.println(Doctor.averagePatients());
    }
}