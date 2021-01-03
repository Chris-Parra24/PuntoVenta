package modelo.VO;

import java.util.Date;

public class VentasVO {
	//atributos
	private int id_venta;
	private String metodo_pago;
	private Date fecha;
	private float total_pagar;
	private boolean status;
	private int id_personal;
	//constructor
	public VentasVO(int idVenta,String metodo_pago,Date fecha,float total,boolean status,int idPersonal) {
		this.id_venta = idVenta;
		this.metodo_pago = metodo_pago;
		this.fecha = fecha;
		this.total_pagar = total;
		this.status = status;
		this.id_personal = idPersonal;
	}
	
	
	//metodos getter and setter
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public String getMetodo_pago() {
		return metodo_pago;
	}
	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getTotal_pagar() {
		return total_pagar;
	}
	public void setTotal_pagar(float total_pagar) {
		this.total_pagar = total_pagar;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId_personal() {
		return id_personal;
	}
	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}
	
}
