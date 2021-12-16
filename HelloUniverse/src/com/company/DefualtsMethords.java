package com.company;

interface  camera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recoring in 4k");
    }
}
interface wifi{
    String[] getNetworks();
    void connectingToNetwork(String network);

}
class MyCellPhone{
    void callNumber (int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting");
    }
    void takeSnap (){
        System.out.println("taking snap");
    }
}
class mySmartPhone extends MyCellPhone implements wifi , camera{

    public void takesnap(){
        System.out.println("taking snap");
    }



    public void recordvideo(){
        System.out.println("taking snap");
    }
    public String[] getNetworks(){
        System.out.println("getting the list of wifi name");
        String [] networkList = {"airtel","jio","VI"};
        return networkList;
    }
    public void connectingToNetwork(String network){
        System.out.println("connection to network"+ network);
    }


}

public class DefualtsMethords {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] ar = ms.getNetworks();
        for (String net :ar){
            System.out.println(net);
        }
        ms.record4kvideo();
    }
}
