package com.customerService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.customerService.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

	@Query("SELECT o.idOrder, e.idEntertainment, e.price, e.name "
		   + "FROM Orders o, "
		        + "OrderProduct op, "
		        + "Product       p, "
		        + "Entertainment e "
		  + "WHERE o.idOrder         = op.idOrder "
			+ "AND op.idProduct      = p.idProduct "
			+ "AND p.idEntertainment = e.idEntertainment "
		    + "AND o.idStateOrder    = 3 "
		    + "AND o.accountingProcess = 'ACCOUNTING'")
    public List<Object> consultarBillsEntertainment();
	
	@Query("SELECT o.idOrder, h.idHotel, h.price, h.name "
			   + "FROM Orders o, "
			        + "OrderProduct op, "
			        + "Product       p, "
			        + "Hotel h "
			  + "WHERE o.idOrder         = op.idOrder "
				+ "AND op.idProduct      = p.idProduct "
				+ "AND p.idHotel = h.idHotel "
				+ "AND o.idStateOrder    = 3 "
			    + "AND o.accountingProcess = 'ACCOUNTING'")
	    public List<Object> consultarBillsHotel();
	
	@Query("SELECT o.idOrder, t.idTransport, t.price, t.name "
			   + "FROM Orders o, "
			        + "OrderProduct op, "
			        + "Product       p, "
			        + "Transport t "
			  + "WHERE o.idOrder         = op.idOrder "
				+ "AND op.idProduct      = p.idProduct "
				+ "AND p.idHotel = t.idTransport "
				+ "AND o.idStateOrder    = 3 "
			    + "AND o.accountingProcess = 'ACCOUNTING'")
	    public List<Object> consultarBillsTransport();
	

	@Query("SELECT o.idOrder, o.idCustomer, o.amount, cc.idCard , o.modificationDate, o.idStateOrder"
			   + " FROM Orders o, "
			        + "OrderProduct op, "
			        + "Product       p, "
			        + "CreditCard cc "
			  + " WHERE o.idOrder         = op.idOrder "
				+ "  AND op.idProduct      = p.idProduct "
			    + " AND o.numberCard = cc.numberCard "
			    + "AND o.idStateOrder    IN (3,5) "
			    + "AND o.accountingProcess = 'INVOICE'")
	    public List<Object> consultarInvoices();
	
	@Query("SELECT o.idOrder, o.idCustomer, o.amount, cc.idCard , o.modificationDate, o.idStateOrder, cc.cardType "
			   + " FROM Orders o, "
			        + "OrderProduct op, "
			        + "Product       p, "
			        + "CreditCard cc "
			  + " WHERE o.idOrder         = op.idOrder "
				+ " AND op.idProduct      = p.idProduct "
			    + " AND o.numberCard = cc.numberCard "
			    + " AND o.idStateOrder   IN (3,5) "
			    + "AND o.accountingProcess = 'RECEIPT'")
	    public List<Object> consultarReceipts();
	
	/*@Modifying(clearAutomatically = true)
	@Query("update Orders o set o.accountingProcess =:accproc where o.idOrder =:idOrder")
	void updateOrder(@Param("idOrder") Long idOrder, @Param("accproc") String accproc);*/
}
