import com.xin.dao.CustomerDao;
import com.xin.dao.impl.CustomerDaoImpl;
import com.xin.entity.Customer;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author ly
 * @date 2019/4/17
 */
public class TestCRUD {
    CustomerDao dao = new CustomerDaoImpl();
    @Test
    public void testFindAll(){
        List<Customer> cs = dao.findAll();
        for (Customer css:cs) {
            System.out.println(css);
        }
    }
    @Test
    public void testFindById(){
       System.out.println(dao.findById(2));
    }
    @Test
    public void insert() {
        Customer c = new Customer("望望","女",new Date(), "18138245275","18273753@qqn.com","php");
        dao.insert(c);
    }
    @Test
    public void delete(){
        dao.delete(4);
    }
    @Test
    public void update(){
        Customer c1 = new Customer(9,"小ying","女",new Date(), "13312345617","12563@xin.com","123");
        dao.update(c1);
    }
}
