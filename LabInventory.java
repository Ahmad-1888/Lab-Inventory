import java.util.Scanner;

/**
 * @author Abdoolrahaman Djawaad
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Display welcome message
		System.out.println("****************************************************");
		System.out.println("**********************Welcome***********************");
		System.out.println("*************************to*************************");
		System.out.println("*****************Database**Inventory****************");
		System.out.println("****************************************************");
		
		//creating object
		Scanner myKeyboard = new Scanner(System.in);
		
		//creating constant to hold password
		String password = "DitProg123";
		
		//Declaring variables
		String itemId ;
		String itemName ;
		String itemDescription ;
		String category;
		String supplierName;
		int supplierContact ;
		double price ;
		int quantity ;
		boolean x = true;
		boolean y = true;
		
		System.out.println("the length of the list ? ");
		int size = myKeyboard.nextInt();
		
		//creating array named itemDatabase
		Item [] itemDatabase = new Item[size];
		
		//Using while loop
				while (x == true) {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("*****What do you want to do ?*******************************************");
					System.out.println("******1. Enter a new Item to the inventory (password required)**********");
					System.out.println("******2. Change information of an existing Item (password required)*****");
					System.out.println("******3. Display all the Items with the specified category**************");
					System.out.println("******4. Display all Items to be re-ordered*****************************");
					System.out.println("******5. Number of Items currently in store*****************************");
					System.out.println("******6. Quit***********************************************************");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

						System.out.print("Please enter your choice > ");
						int ans = myKeyboard.nextInt();
						System.out.println(" ");
						if (ans == 1) {
												
						    for (int count = 0 ;count <= 3 ;count += 1) {
								System.out.print(" Password : ");
								String pswd = myKeyboard.next();					
								
								if (pswd.equalsIgnoreCase(password)) {
									System.out.println("Please enter the number of object you want to add to the item data base : ");
									int n = myKeyboard.nextInt();
									Item [] itemDatabase1 = new Item[n];
									System.out.println("Please enter the name of the object in the list and its corresponding characteristics : "); 
									
									for (int i=0 ; i < n ; i ++)
									{ 	
										System.out.print(" Item id : ");
										itemId = myKeyboard.next();
										 
										System.out.print(" Item name : ");
										itemName = myKeyboard.next();
										
										System.out.print(" Item description : ");
										itemDescription = myKeyboard.next();
										
										System.out.print(" category : ");
										category = myKeyboard.next();
										
										System.out.print(" Supplier name : ");
										supplierName = myKeyboard.next();
										
										System.out.print(" Supplier contact : ");
										supplierContact = myKeyboard.nextInt();
										
										System.out.print(" price : ");
										price  = myKeyboard.nextDouble();
										
										System.out.print(" quandtity : ");
										quantity = myKeyboard.nextInt();
										
										itemDatabase1[i]= new Item(itemId, itemName, itemDescription, category, supplierName, supplierContact, price, quantity );
										itemDatabase1[i].setItemId(itemId);
										itemDatabase1[i].setItemName(itemName);
										itemDatabase1[i].setItemDescription(itemDescription);
										itemDatabase1[i].setCategory(category);
										itemDatabase1[i].setSupplierName(supplierName);
										itemDatabase1[i].setSupplierContact(supplierContact);
										itemDatabase1[i].setPrice(price);
										itemDatabase1[i].setQuantity(quantity);
										
										int b = Item.totalitems();
			                            itemDatabase[(b-1)]=itemDatabase1[i];
									}
									System.out.println(" ");
									System.out.println("Item ID "+ " Item Name " + " Item Description " + " Category " + " Supplier Name " + " Supplier Contact "+ " Price " + " Quantity ");
									int b = Item.totalitems();
									for (int j=0; j<b ; j++ ) {
									 System.out.println(itemDatabase[j]);
									}
									
									break;
												
								}
								else if (!pswd.equalsIgnoreCase(password)) {
									
									System.out.println("Incorrect password. You have " +(3 - (count)) + " chance left."); 
									if (count == 2) {
							    	continue;
							       }
									else if (count == 3) {
										System.out.println("Program detected suspicious activity and terminating!");
										x = false;
										break;					
								    }
								  }
							    }   
							   
						   
						}
						
						if (ans == 2) {
							int count = 0 ;
							y = true;	
						    	while (y == true) {
						    		
									System.out.print(" Password : ");
									String pass = myKeyboard.next();
								     if (!pass.equalsIgnoreCase(password) && count!=2) {
										
										System.out.println("Incorrect password. You have " +(3 - (count+1)) + " chance left.");
									     count++; }
								    
									  else if (count == 2 && !pass.equalsIgnoreCase(password)) {
								    	   y = false;
								    		}			
								
						    	
									  else if (pass.equalsIgnoreCase(password)) {
											System.out.print("enter the item id you want to update : ");
											String id_input = myKeyboard.next();
											
											int b = Item.totalitems();
											for (int i=0 ; i <b; i++ ) {
													String q = itemDatabase[i].getItemId();
											    if(id_input.equalsIgnoreCase(q)) {
				
										     	     System.out.println("Your desired item :");
											         System.out.println(itemDatabase[i]);
											
												System.out.println("Item ID : " + itemDatabase[i].getItemId());
												System.out.println("Name : " + itemDatabase[i].getItemName());
												System.out.println("Description : " + itemDatabase[i].getItemDescription());
												System.out.println("Category : " + itemDatabase[i].getCategory());
												System.out.println("Supplier Name : " + itemDatabase[i].getSupplierName());
												System.out.println("Contact : " + itemDatabase[i].getSupplierContact());
												System.out.println("Price : " + itemDatabase[i].getPrice());
												System.out.println("Quantity : " + itemDatabase[i].getQuantity());
												
												System.out.println(" ");
												
											while(true) {
													System.out.println("What do you want to change ");
													System.out.println("     1. Name "+ "\n" + "     2. Description " + "\n" + "     3. Category " +"\n " + "     4.Supplier Name " +
													"\n" + "     5.Supplier Contacts " + "\n" + "     6.Price " + "\n" + "     7.Available qty" + "\n" + "     8.Quit" + "\n" +"choice =>" );
													int choice = myKeyboard.nextInt();
													if (choice == 1) {
														System.out.print("Name : ");
														itemName = myKeyboard.next();
														
														itemDatabase[i].setItemName(itemName);
														System.out.println(itemDatabase[i]);
													
													}
													else if (choice == 2 ) {
														System.out.print("Description : ");
														itemDescription = myKeyboard.next();
														
														itemDatabase[i].setItemDescription(itemDescription);
														System.out.println(itemDatabase[i]);
														
													}
													else if (choice == 3) {
														System.out.print("Category : ");
														category = myKeyboard.next();
														
														itemDatabase[i].setCategory(category);
														System.out.println(itemDatabase[i]);
														
													}
													else if (choice == 4) {
														System.out.print("Supplier Name : ");
														supplierName = myKeyboard.next();
														
														itemDatabase[i].setSupplierName(supplierName);
														System.out.println(itemDatabase[i]);
													}
													else if(choice == 5) {
														System.out.print("Supplier Contact : ");
														supplierContact = myKeyboard.nextInt();
														
														itemDatabase[i].setSupplierContact(supplierContact);
														System.out.println(itemDatabase[i]);
														
													}
													else if(choice == 6){
														System.out.print("Price : ");
														price = myKeyboard.nextDouble();
														
														itemDatabase[i].setPrice(price);
														System.out.println(itemDatabase[i]);										
													}
													else if(choice == 7) {
														System.out.print("Available quantity : ");
														quantity = myKeyboard.nextInt();
														
														itemDatabase[i].setQuantity(quantity);
														System.out.println(itemDatabase[i]);
													}
			
													else if(choice == 8){
														y = false;
														break;
												}
												else {
													System.out.println("Choose between 1-8 only.");
												}
											}
												 }
											}
									}
			
						    }}
					
						if (ans == 3) {
							System.out.print("Please insert Category of items :" );
							String inputCat = myKeyboard.next();
							int b = Item.totalitems();
							for (int i=0; i <b; i++) {
								String z = itemDatabase[i].getCategory();
							 if(inputCat.equalsIgnoreCase(z)) {
								 System.out.println(itemDatabase[i].findItemByCat());						
							 	}
				
							}
						}
						
						if (ans == 4) {
							int b = Item.totalitems();
								System.out.println("");
								System.out.println("your re-ordered inventory is ");
							for (int i=0 ; i <b; i++) {
			
								if(itemDatabase[i].getQuantity()<5) {		
									//System.out.println("");

								}
								else {
									System.out.println(itemDatabase[i]);
								}
							}
							for (int j=0 ; j <b; j++) {
								
								if(itemDatabase[j].getQuantity()<5) {		
									System.out.println("");
							System.out.println("The item with the Id : "+ itemDatabase[j].getItemId() +" ran out of stock.");
							}
							}
							
						}
						if (ans == 5) {
							System.out.print("The total number of items which have been created so far : ");
							Item.totalitem();
						} 
						if(ans == 6) {
							System.out.println("***************************");
							System.out.println("*****Program*is*ending*****");
							System.out.println("****and*is*now*exiting*****");
							System.out.println("*****See*you*next*time*****");
							System.out.println("***************************");
							x = false;
							break;
						}
				}
				
	}
}
