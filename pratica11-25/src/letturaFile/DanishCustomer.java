package letturaFile;

import java.util.ArrayList;

public class DanishCustomer {
    private ArrayList<Customer> lista;

    public DanishCustomer() {
        this.lista = new ArrayList<Customer>();
    }

    public void add(Customer customer){
        System.out.println("AGGUNTO");
        this.lista.add(customer);
    }
    public boolean remove(Customer customer){ return this.lista.remove(customer); }
    public Customer searchIndex(int index){ return this.lista.get(index); }

    @Override
    public String toString() {
        String s="Customer: \n";
        for (Customer customer: lista)
            s=s+customer.toString();
        return s;
    }
}
