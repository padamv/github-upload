package com.tutorialspoint;
import java.util.*;

public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	//a setter method to set the List
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	
	//print and return all the elements of the list.
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}
	
	//a setter method to set Set
	public void setAddressSet(Set addressSet) {
		this.addressSet=addressSet;
	}
	
	//prints and returns all the elements of the Set.
	public Set getAddressSet() {
		System.out.println("Set Elements: " + addressSet);
		return addressSet;
	}
	
	// a setter method to set the Map.
	public void setAddressMap(Map addressMap) {
		this.addressMap=addressMap;
	}
	
	//print and return all elements of the Map.
	public Map getAddressMap() {
		System.out.println("Map Elements : " + addressMap);
		return addressMap;
	}
	
	//a setter method to set Property.
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
	// prints and returns all the elements of the Property.
	public Properties getAddressProp() {
		System.out.println("Property Element : " + addressProp);
		return addressProp;
	}
}
