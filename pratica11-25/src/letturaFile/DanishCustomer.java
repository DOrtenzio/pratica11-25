package letturaFile;

import java.util.ArrayList;

public class DanishCustomer {
    private ArrayList<Customer> lista;

    public DanishCustomer() {
        this.lista = new ArrayList<Customer>();
    }

    public void add(Customer customer){ this.lista.add(customer); }
    public boolean remove(Customer customer){ return this.lista.remove(customer); }
    public Customer searchIndex(int index){ return this.lista.get(index); }
}
