package org.iesvdm.haversine;

import OnlineShopping.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class testWebUserCustomerAccount {
    @Test
    public void testWebUserCustomer() throws Exception{
        Supplier sup1=new Supplier();
        Supplier sup2=new Supplier();

        Address address1 = new Address("C/ Portugal,Nº 4,661010103",12,"Lisboa","Portugal");
        //Comentario
        Phone ph1 =new Phone("2222","22222");
        Phone ph2 =new Phone("3333","33333");

        Product p1=new Product("111","Manzana",sup1);
        Product p2=new Product("222","Peras",sup2);

        Customer customer =new Customer("1",address1,ph1,"jose@gmail.com");
        Customer customer2 =new Customer("2",address1,ph2,"pepe@gmail.com");

        WebUser webUser =new WebUser("jose","1234", UserState.Active);
        WebUser webUser2 =new WebUser("pepe","1234", UserState.Active);

        Price price1=new Price(new BigDecimal(8),new BigDecimal(4));
        Price price2=new Price(new BigDecimal(9),new BigDecimal(6));

        Lineltem l1=new Lineltem(2,price1);
        Lineltem l2=new Lineltem(5,price2);

        Date d1=new Date();
        Account account =new Account("1",address1,false,d1,null);
        Set<Lineltem> LinelItems=new LinkedHashSet<>();
        LinelItems.add(l1);
        LinelItems.add(l2);
        ShoppingCart sh1=new ShoppingCart(LinelItems,account);
        account.setShoppingCart(sh1);
        webUser.setShoppingCart(sh1);


        customer.setAccount(account);
        customer.setWebUser(webUser);

        Assertions.assertEquals("jose",webUser.getLogin_id());
        Assertions.assertEquals("pepe",webUser2.getLogin_id());

        Assertions.assertEquals("jose@gmail.com",customer.getEmail());
        Assertions.assertEquals("pepe@gmail.com",customer2.getEmail());

        Assertions.assertEquals("111",p1.getId());
        Assertions.assertEquals("222",p2.getId());

        Assertions.assertEquals(new BigDecimal(8),price1.getPrecio_incial());
        Assertions.assertEquals(new BigDecimal(4),price1.getPrecio_descuento());


    }
}
