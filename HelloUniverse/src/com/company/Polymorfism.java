package com.company;

interface  camera1{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recoring in 4k");
    }
}
interface wifi1{
    String[] getNetworks();
    void connectingToNetwork(String network);

}
class MyCellPhone1{
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
class mySmartPhone1 extends MyCellPhone implements wifi1 , camera1{

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

public class Polymorfism {
    public static void main(String[] args) {
        camera1 cam1 = new mySmartPhone1();
    }
}
