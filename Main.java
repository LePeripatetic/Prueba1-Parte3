class Main{
	public static void main(String[] args) {
		ListaDinamica L = new ListaDinamica();
		L.insertar(10,0);
		L.insertar(20,1);
		L.insertar(30,2);
		L.insertar(40,3);
		L.mostrar();
		int posicion =L.busqueda_binaria(30,L);
		if (posicion==-1){
			System.out.println("El elemento no se encuentra en la lista");			
		}else{
			System.out.println("El elemento se encuentra en la posicion: "+posicion);
		}
	}
}