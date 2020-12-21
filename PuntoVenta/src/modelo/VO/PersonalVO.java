package modelo.VO;

public class PersonalVO {
	//atributos
	private int id_personal;
	private String nombre;
	private String contraseña;
	private String ap_paterno;
	private String ap_materno;
	private String telefono;
	private boolean estado;
	private int id_rol;
	//constructor
	public PersonalVO() {
		this.id_personal=0;
		this.nombre="";
		this.contraseña="";
		this.ap_paterno="";
		this.ap_materno="";
		this.telefono="";
		this.estado=false;
		this.id_rol=0;
	}
	public PersonalVO(int id_personal,String nombre,String contraseña,String apPaterno,String apMaterno,String telefono,int idRol) {
		this.id_personal = id_personal;
		this.nombre = nombre;
		this.ap_paterno = apPaterno;
		this.ap_materno = apMaterno;
		this.telefono = telefono;
		this.estado=true;
		this.id_rol = idRol;
	}
	public PersonalVO(String nombre,String contraseña,String apPaterno,String apMaterno,String telefono,int idRol) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.ap_paterno = apPaterno;
		this.ap_materno = apMaterno;
		this.telefono = telefono;
		this.estado = true;
		this.id_rol = idRol;
	}
	//metodos
	public int getId_personal() {
		return id_personal;
	}
	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_paterno() {
		return ap_paterno;
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getContraseña() {
		return this.contraseña;
	}
	
}
