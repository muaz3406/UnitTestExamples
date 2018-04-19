package com.muaz.unittest.customer;


public class CustomerService {
    private CustomerRepository customerRepository;
    private NotificationService notificationService;

    public void customerSave(Customer customer){
        customerRepository.save(customer);
        notificationService.newSaveSendMail(customer);
    }

    public void customerDelete(Integer customerID){
        customerRepository.delete(customerID);
    }


    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
