package solid;

import java.util.Date;

public class SingleResponsibility {

}

// bad code
// karena dalama satu interface ini dia punya 2 responsibility
// 1. handle inventory
// 2. handle income
interface Service {
	   public void saveInventory(String inventory);
	   public void updateInventory(String inventory);
	   public void deleteInventory(String inventory);
	   public Double checkIncome(Date date);
	   public Double checkOutcome(Date date);
}

// clean code (prinsip single responsibility)
interface Inventory{
	   public void saveInventory(String inventory);
	   public void updateInventory(String inventory);
	   public void deleteInventory(String inventory);
}

interface Income{
	   public Double checkIncome(Date date);
	   public Double checkOutcome(Date date);
}