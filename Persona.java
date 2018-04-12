package Alpha.Ecommerce;

import java.math.BigDecimal;

public class Producto {

    private int id;
    private BigDecimal precio;

    public Producto(int id) {
        this.id = id;
    }
    
    public Producto(int id, BigDecimal precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}

