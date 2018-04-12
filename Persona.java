package Alpha.Ecommerce;

import java.math.BigDecimal;

public class Producto {

    private int id;
    private BigDecimal precio;
	private String nombre;
	private String DNI;
	private String Mascota;
	private String DuenioMascota;
	private double celular;

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
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre1){
		this.nombre = nombre1;
	}

}

