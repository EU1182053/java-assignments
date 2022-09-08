package assignment98;

public class cardetail {



	int modelNumber , count;
    String modelName;
    static String companyName="BMW";

    cardetail(int Number, String Name){
        modelName = Name;
        modelNumber = Number;
        count = count +1;
    }

    public void addCarDetail(int modelNumber, String modelName){
        this.modelName = modelName;
        this.modelNumber = modelNumber;
    }
   
    
    

    public void display(){
        System.out.print("The model number is ");
        System.out.println(modelNumber);
        System.out.print("The model name is ");
        System.out.println(modelName);
        System.out.print("The Company name is ");
        System.out.println(companyName);
    }


}
