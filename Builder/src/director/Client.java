package director;
import concretebuilder.FastFoodOrderBuilder;
import nested.BankAccount;
import order.Order;
import type.BreadType;
import type.OrderType;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderBread(BreadType.BEEF).orderType(OrderType.TAKE_AWAY).build();
		System.out.println(order.toString());
		
		BankAccount bankAccount = new BankAccount.BankAccountBuilder("Cong Danh", "101870368786").withEmail("abc@123").wantNewsletter(true).build();
		System.out.println(bankAccount.toString());
	}
}
