package com.anudip.crud.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.anudip.crud.entity.Customer;
import com.anudip.crud.repository.CustomerRepository;
import com.anudip.crud.service.CustomerService;

//testing all CRUD of service
@SpringBootTest
public class CustomerServiceTest {

	@Autowired
	private CustomerService cs;

	@MockBean
	private CustomerRepository crepo;

	@Test
	public void testSaveUser() {

		Customer c = new Customer();
		c.setUid(1);
		c.setFname("Arnab");
		c.setLname("Hoodati");
		c.setUphone(987654321);
		c.setUname("arnab@gmail.com");

		Mockito.when(crepo.save(c)).thenReturn(c);
		assertThat(cs.saveUser(c)).isEqualTo(c);

	}

	@Test
	public void testGetAllCustomer() {
		Customer c = new Customer();
		c.setUid(1);
		c.setFname("Arnab");
		c.setLname("Hoodati");
		c.setUphone(987654321);
		c.setUname("arnab@gmail.com");

		Customer c1 = new Customer();
		c1.setUid(2);
		c1.setFname("sam");
		c1.setLname("john");
		c1.setUphone(987054321);
		c1.setUname("sam@gmail.com");

		List<Customer> al = new ArrayList<>();
		al.add(c);
		al.add(c1);

		Mockito.when(crepo.findAll()).thenReturn(al);
		assertThat(cs.getAllUser()).isEqualTo(al);
	}

	@Test
	// testing updateUserById of service
	public void testUpdateCustomer() {
		Customer c2 = new Customer();
		c2.setUid(3);
		c2.setFname("Ram");
		c2.setLname("Kumar");
		c2.setUname("ram@gmail.com");
		c2.setUphone(767054321);

		Optional<Customer> ca = Optional.of(c2);
		Customer ua = ca.get();

		Mockito.when(crepo.findById(3)).thenReturn(ca);

		// update phone
		ua.setUphone(654432111);
		Mockito.when(crepo.save(ua)).thenReturn(ua);
		assertThat(cs.updateUserById(ua, 3)).isEqualTo(ua);
	}
}
