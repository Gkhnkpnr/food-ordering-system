package com.food.ordering.system.customer.domain;

import com.food.ordering.system.customer.domain.entity.Customer;
import com.food.ordering.system.customer.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);
}
