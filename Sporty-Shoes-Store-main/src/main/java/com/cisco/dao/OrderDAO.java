package com.cisco.dao;

import java.util.List;

import com.cisco.entity.Order;
import com.cisco.entity.Product;
import com.cisco.entity.User;

public interface OrderDAO {
	
	public List<Order> getOrder();
	
	public Order getOrder(int orderId);
	
	public void saveOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	
	public List<Order> getUserOrders(int userId);

}
