

import java.lang.reflect.Array;

/**
 * @author Abdoolrahaman Djawaad
 *
 */

//defining attributes
public class Item {
		private String itemId;
		private String itemName ;
		private String itemDescription ;
		private String category;
		private String supplierName;
		private int supplierContact;
		private double price;
		private int quantity;
		static int totalItems = 0 ;

	/**
	 * default constructor
	 */
	//default constructor
	public Item(){
	}
	
	/**
	 * @param itemId
	 * @param itemName
	 * @param itemDescription
	 * @param category
	 * @param supplierName
	 * @param supplierContact
	 * @param price
	 * @param quantity
	 */
	//Overloaded constructor
	public Item(String itemId, String itemName, String itemDescription, String category, String supplierName, int supplierContact, double price, int quantity ) {
		this.itemId = itemId;
		this.itemName = itemName ; 
		this.itemDescription = itemDescription;
		this.category = category;
		this.supplierName = supplierName;
		this.supplierContact = supplierContact;
		this.price = price;
		this.quantity = quantity;
		totalItems++;
		}
	
	//Generating getters and setters
	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return itemId;
	}
	
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}
	
	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	/**
	 * @return the supplierContact
	 */
	public int getSupplierContact() {
		return supplierContact;
	}
	
	/**
	 * @param supplierContact the supplierContact to set
	 */
	public void setSupplierContact(int supplierContact) {
		this.supplierContact = supplierContact;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return(this.itemId + "  " + this.itemName+ "  " + this.itemDescription + "  " + this.category + "  "+ this.supplierName + "  "+ this.supplierContact+ "  " + this.price+ "  " + this.quantity);
	}
	
	public boolean equals(Item a ) {
		if (this.itemId.equalsIgnoreCase(a.itemId)) {
			return true;
		}
		else {
			return false ; 
		}
	}
	public String findItemByCat() {
		 return(this.itemId + "  " + this.itemName+ "  " + this.itemDescription + "  " + this.supplierName + "  "+ this.supplierContact+ "  " + this.price+ "  " + this.quantity);
		}
		
	public static void totalitem() {
	System.out.println(totalItems);
	}
	public static int totalitems() {
		return totalItems;
	}

}