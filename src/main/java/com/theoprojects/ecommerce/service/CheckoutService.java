package com.theoprojects.ecommerce.service;

import com.theoprojects.ecommerce.dto.Purchase;
import com.theoprojects.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
