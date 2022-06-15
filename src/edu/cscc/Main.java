package edu.cscc;
/*
Jonah Young
Lab 6
10/1/2019
Prints out an array of different types of logged addresses
 */
public class Main {

    public static void main(String[] args) {
	    Address[] addressList = new Address[6];

	    // TODO Add 3 person addresses to list
        addressList[0] = new BusinessAddress("550 East Spring Street","Columbus","OH","43215","Columbus State" ,"Eibling 302B");
        addressList[1] = new BusinessAddress(null,"Columbus","OH","43201","AEP" ,"P.O. Box 2075");
        addressList[2] = new BusinessAddress("2079 N. Main St.","Columbus","OH","43227","Bill's Coffee" ,null);
        // TODO Add 3 business address to list
        addressList[3] = new PersonAddress("1200 N. Fourth St.","Worthington","OH","43217","Saul Goodman");
        addressList[4] = new PersonAddress("207 Main St.","Reynoldsburg","OH","43211","Mike Ehrmentraut");
        addressList[5] = new PersonAddress("2091 Elm St.","Pickerington","OH","43191","Gustavo Fring");
	    for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
