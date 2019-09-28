import java. util. Date;
public class Estudiante {
	int id_estudiante;
	String nombre_estudiante;
	String apellido_estudiante;
	Date fecha_nacimiento;
	Integer edad;
	DoubleLinkedList<Year> year_list;
	public Estudiante(int id_estudiante, String nombre_estudiante, String apellido_estudiante, Date fecha_nacimiento) {
		super();
		this.id_estudiante = id_estudiante;
		this.nombre_estudiante = nombre_estudiante;
		this.apellido_estudiante = apellido_estudiante;
		this.edad = 0;
	}

	@Override
	public String toString() {
		return "Estudiante [id_estudiante=" + id_estudiante + ", nombre_estudiante=" + nombre_estudiante
				+ ", apellido_estudiante=" + apellido_estudiante + ", fecha_nacimiento=" + fecha_nacimiento + ", edad="
				+ edad + "]";
	}

	
	
	
}
