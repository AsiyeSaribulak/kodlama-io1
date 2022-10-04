package BirinciHafta;

public class Main {
    public static void main(String[] args) {
      /*  Product product=new Product();
        product.setId(1);
        product.setName("laptop");
        product.setDescription("casper nirvana");
        product.setPrice(9.500);
        product.setStockAmount(3);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode()+"'lu ürünün fiyatı : " + product.getPrice()+"$");*/

        Customer customer=new Customer();
        Employee employee=new Employee();
        Person person=new Person();
        CustomerManager customerManager=new CustomerManager();
        PersonManager personManager=new PersonManager();
        EmployeeManager employeeManager=new EmployeeManager();
        customerManager.list();
        employeeManager.maasYatir();
        personManager.add();
    }
}