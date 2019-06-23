package pack2;

public interface CustomerDAO {
	Customer[] getAll();

	Customer getByld(int code);

	boolean add(Customer customer);

	boolean update(Customer customer);

	boolean delete(Customer customer);
}
