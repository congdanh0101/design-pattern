package order;

import type.BreadType;
import type.OrderType;
import type.SauceType;
import type.VegetableType;

public class Order {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;
	
	public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
		super();
		this.orderType = orderType;
		this.breadType = breadType;
		this.sauceType = sauceType;
		this.vegetableType = vegetableType;
	}
	
    public OrderType getOrderType() {
        return orderType;
    }
 
    public BreadType getBreadType() {
        return breadType;
    }
 
    public SauceType getSauceType() {
        return sauceType;
    }
 
    public VegetableType getVegetableType() {
        return vegetableType;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
                + ", vegetableType=" + vegetableType + "]";
    }

}
