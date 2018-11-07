package com.customerService.controller;

import com.customerService.model.Customer;
import com.customerService.model.Orders;
import com.customerService.payload.BillResponse;
import com.customerService.payload.CustomerRegRequest;
import com.customerService.payload.CustomerRequest;
import com.customerService.payload.CustomerResponse;
import com.customerService.payload.InvoiceResponse;
import com.customerService.payload.ReceiptResponse;
import com.customerService.repository.CustomerRepository;
import com.customerService.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    OrdersRepository ordersRepository;
    

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/getInfoInvoices")
    public ResponseEntity<?> registerUser(@Valid @RequestBody CustomerRequest customerRequest) {
        Optional<Customer> customerConsultados = customerRepository.findById(customerRequest.getIdCustomer());
        
    	if (!customerRequest.getEmail().equals(customerConsultados.get().getEmail())) {
    		if(customerRepository.existsByEmail(customerRequest.getEmail())) {
                return new ResponseEntity(new CustomerResponse(false, "Email Address already in use!", null),
                        HttpStatus.BAD_REQUEST);
            }
		}
    	
    	if(passwordEncoder.matches(customerRequest.getOldPassword(), customerConsultados.get().getPassword())) {
        	Customer customer = new Customer(customerRequest.getIdCustomer(), customerConsultados.get().getIdCategory(), customerConsultados.get().getUsername(), customerRequest.getPassword(), customerRequest.getEmail());
        	customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        	Customer customerUpdated = customerRepository.save(customer);
        	return ResponseEntity.ok(new CustomerResponse(true, "User updated successfully", String.valueOf(customerUpdated.getId())));
        }else {
        	return ResponseEntity.ok(new CustomerResponse(false, "", String.valueOf("0")));
        }
    }
    
    @GetMapping("/getInfoBills")
    public ResponseEntity<?> getInfoBills() {
       
    	List<BillResponse> billResponses = new ArrayList<BillResponse>();
    	
    	List<Object> objectsEntert = ordersRepository.consultarBillsEntertainment();
    	for (Object object : objectsEntert) {
    		Object[] fields = (Object[]) object;
    		BillResponse billResponse = new BillResponse((Long) fields[0], (Long) fields[1], (String) fields[3],(Double) fields[2]);
    		billResponses.add(billResponse);
		}
    	
    	List<Object> objectsHotel = ordersRepository.consultarBillsHotel();
    	for (Object object : objectsHotel) {
    		Object[] fields = (Object[]) object;
    		BillResponse billResponse = new BillResponse((Long) fields[0], (Long) fields[1], (String) fields[3],(Double) fields[2]);
    		billResponses.add(billResponse);
		}
    	
    	List<Object> objectsTransport = ordersRepository.consultarBillsTransport();
    	for (Object object : objectsTransport) {
    		Object[] fields = (Object[]) object;
    		BillResponse billResponse = new BillResponse((Long) fields[0], (Long) fields[1], (String) fields[3],(Double) fields[2]);
    		billResponses.add(billResponse);
    		
    		Orders order = (Orders) ordersRepository.findById(billResponse.getIdOrder()).get();
    		order.setAccountingProcess("INVOICE");
    		ordersRepository.save(order);
    		//ordersRepository.updateOrder(billResponse.getIdOrder(), );
		}
    	
        return ResponseEntity.ok(billResponses);
    }
    
    @GetMapping("/getInfoInvoices")
    public ResponseEntity<?> getInfoInvoices() {
    	List<InvoiceResponse> invoiceResponses = new ArrayList<InvoiceResponse>();
    	List<Object> objectsInvoices = ordersRepository.consultarInvoices();
    	for (Object object : objectsInvoices) {
    		Object[] fields = (Object[]) object;
    		InvoiceResponse invoiceResponse = new InvoiceResponse((Long) fields[0], (Long) fields[1], (Double) fields[2], (Long) fields[3], (Date) fields[4], (Long) fields[5]);
    		invoiceResponses.add(invoiceResponse);
    		
    		Orders order = (Orders) ordersRepository.findById(invoiceResponse.getIdOrder()).get();
    		order.setAccountingProcess("RECEIPT");
    		ordersRepository.save(order);
    		//ordersRepository.updateOrder(invoiceResponse.getIdOrder(), "RECEIPT");
		}
        return ResponseEntity.ok(invoiceResponses);
    }
    
    @GetMapping("/getInfoReceipts")
    public ResponseEntity<?> getInfoReceipts() {
    	List<ReceiptResponse> receiptResponses = new ArrayList<ReceiptResponse>();
    	List<Object> objectsReceipts = ordersRepository.consultarReceipts();
    	for (Object object : objectsReceipts) {
    		Object[] fields = (Object[]) object;
    		ReceiptResponse receiptResponse = new ReceiptResponse((Long) fields[0], (Long) fields[5], (Long) fields[1], (Double) fields[2], (Long) fields[3], (String) fields[6], (Date) fields[4]);
    		receiptResponses.add(receiptResponse);
    		
    		Orders order = (Orders) ordersRepository.findById(receiptResponse.getIdOrder()).get();
    		order.setAccountingProcess("FIN");
    		ordersRepository.save(order);
		}
        return ResponseEntity.ok(receiptResponses);
    }
    }
