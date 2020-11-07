package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234569");
        orderDetail.setOrderId("1281");
        orderDetail.setProductIcon("http://xx.jpg");
        orderDetail.setProductId("123");
        orderDetail.setProductName("烧饼");
        orderDetail.setProductQuantity(2);
        orderDetail.setProductPrice(new BigDecimal(5.9));
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrOrderId("1281");
        Assert.assertNotEquals(0, orderDetailList);
    }
}