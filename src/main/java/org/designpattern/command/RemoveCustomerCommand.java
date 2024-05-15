package org.designpattern.command;

public class RemoveCustomerCommand implements Command{
    private CustomerService customerService;
    public RemoveCustomerCommand(CustomerService customerService) {

        this.customerService = customerService;
    }
    @Override
    public void execute() {
        customerService.removeCustomer();
    }
}
