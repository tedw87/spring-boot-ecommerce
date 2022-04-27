package com.theoprojects.ecommerce.dto;

import com.theoprojects.ecommerce.entity.Address;
import com.theoprojects.ecommerce.entity.Customer;
import com.theoprojects.ecommerce.entity.Order;
import com.theoprojects.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
