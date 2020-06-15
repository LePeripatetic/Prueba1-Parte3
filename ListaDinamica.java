class ListaDinamica{
	NodoLista cabeza;

	ListaDinamica(){
		cabeza = new NodoLista();
		cabeza.sgte=null;
	}

	public void insertar(int x, int p){
		NodoLista aux=new NodoLista(x);
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else insertar(aux,temp);
		}
	}
	private void insertar(NodoLista x,NodoLista p){
			x.sgte=p.sgte;
			p.sgte=x;
	}
	void mostrar(){
		int i;
		NodoLista temp=cabeza;
		while(temp.sgte!=null){
			System.out.print(temp.sgte.dato+"-");
			temp=temp.sgte;
		}
		System.out.println("");
	}

	public void eliminar(int p){
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else eliminar(temp);
		}
	}
	private void eliminar(NodoLista p){
			p.sgte=p.sgte.sgte;
	}
	public int localizar (int x){
		NodoLista temp=cabeza;
		int i=0;
		while(temp.sgte!= null){
			if(temp.sgte.dato==x) return i;
			i++;
			temp=temp.sgte;
		}
		System.out.println("No se econtró el elemento");
		return -1;
	}
	public int recuperar(int p){
		NodoLista temp=cabeza;
		int i=0;
		if(p<0) System.out.println("Posicion invalida!");
		else{
			while((temp.sgte!= null)&&(i!=p)){
				i++;
				temp=temp.sgte;
			}
			if(i<p) System.out.println("La posición indicada no existe!");
			else {
				System.out.println("El elemento es: "+temp.sgte.dato);
				return temp.sgte.dato;
			}
		}
		return -1;
	}
	public int largoLista(){
		int i=0;
		NodoLista aux=cabeza;
		while(aux.sgte!=null){
			i=i+1;
			aux=aux.sgte;
		}
		return i;
	}

	public float promedio(){
		float suma=0;
		float prom;
		int num;
		int largo=largoLista();
		NodoLista aux=cabeza;
		while(aux!=null){
			num=aux.getDato();
			suma=suma+num;
			aux=aux.sgte;
		}
		prom=suma/largo;
		return prom;
	}

	public int busqueda_binaria(int dato,ListaDinamica l){
		int largo=largoLista();
		ordenar(largo);
		int inf,sup,med,num;
		inf=0;
		sup=largo-1;
		if (cabeza.getDato()==dato){
			return 0;
		}else if (dato==datoNodo(sup)){
			return sup;
		}
	}
	
	public int datoNodo(int posicion){
		NodoLista temp=cabeza;
		int datoObtenido;
		if (temp!=null){
			int z=0;
			while(z<=posicion){
				temp=temp.sgte;
				z++;
			}
			datoObtenido=temp.getDato();
			return datoObtenido;
		}
		return -1;
	}	
}