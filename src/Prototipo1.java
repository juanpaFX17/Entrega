import java. util. Date;
public class Prototipo1 {

	public static void main(String[] args) {
		DoubleLinkedList<Estudiante> lista_estudiantes = new DoubleLinkedList<Estudiante>();
		Estudiante e1 = new Estudiante(1000274637,"Juan","Rodriguez",new Date(2001,07,26));
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushBack(e1);
		lista_estudiantes.PushFront(new Estudiante(1006290337,"Juan pablo","Pepin",new Date(2000,00,00)));
		lista_estudiantes.PopBack();
		lista_estudiantes.PopBack();
		lista_estudiantes.DisplayList();
	}
}
