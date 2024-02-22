import src.Pedido;
import src.String;

class Pedido {
    private int codigo;
    private double subtotal;
    private double desconto;
    private double total;

    public Pedido(int codigo, double subtotal, double desconto, double total) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.desconto = desconto;
        this.total = total;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getTotal() {
        return this.subtotal - this.desconto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}

public class EXERCICIO22 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, 100.0, 10.0, 90.0);
        
        System.out.println("Código do Pedido: " + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("Total: " + pedido.getTotal());
    }
}
    