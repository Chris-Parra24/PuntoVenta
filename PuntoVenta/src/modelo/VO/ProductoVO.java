package modelo.VO;

public class ProductoVO {
	//atributos
	private int id_producto;
	private String descripcion;
	private float precio_menudeo;
	private float precio_mayoreo;
	private float cantidad;
	private String unidad;
	private float descuento;
	private boolean status;
	private int id_departamento;
	//constructor
	public ProductoVO(int id_producto, String descripcion, float prec_men, float prec_mayo, float cantidad, String unidad, float descuento, boolean status, int id_dep){
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.precio_menudeo = prec_men;
		this.precio_mayoreo = prec_mayo;
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.descuento = descuento;
		this.status = status;
		this.id_departamento = id_dep;
	}
	//metodos
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
	public float getPrecio_menudeo() {
		return precio_menudeo;
	}
	public void setPrecio_menudeo(float precio_menudeo) {
		this.precio_menudeo = precio_menudeo;
	}
	public float getPrecio_mayoreo() {
		return precio_mayoreo;
	}
	public void setPrecio_mayoreo(float precio_mayoreo) {
		this.precio_mayoreo = precio_mayoreo;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	
}
