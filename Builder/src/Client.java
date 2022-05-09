import concretebuilder.FastFoodOrderBuilder;
import nested.BankAccount;
import order.Order;
import type.BreadType;
import type.OrderType;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderBread(BreadType.BEEF).orderType(OrderType.TAKE_AWAY).build();
		System.out.println(order.toString());
		
		BankAccount bankAccount= new BankAccount.BankAccountBuilder("Cong Danh", "1234").withEmail("abc@1234").build();
		System.out.println(bankAccount.toString());
	}
}
