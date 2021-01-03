package modelo;

public class Producto {
	//atributos
	private int id_producto;
	private String descripcion;
	private float precio;
	private float peso;
	private float total=0;
	//constructor
	public Producto(int id,String descripcion,float precio,float peso) {
		this.id_producto = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.peso = peso;
		calcularTotal();
	}
	//metodos distintos
	private void calcularTotal() {
		this.total = this.precio * this.peso;
	}
	
	//metodos setter and getter
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTotal() {
		return this.total;
	}
}
