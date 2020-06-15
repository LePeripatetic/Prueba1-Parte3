class Main{
	public static void main(String[] args) {
		ListaDinamica L = new ListaDinamica();
		L.insertar(10,0);
		L.insertar(20,1);
		L.insertar(30,2);
		L.insertar(40,3);
		L.mostrar();
		float media = L.promedio();
		System.out.print("El promedio de la lista es: ");
		System.out.println(media);
	}
}