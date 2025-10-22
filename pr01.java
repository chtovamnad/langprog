class Gen<T> {
	//Объявление переменной обобщенного типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen(T o) {
		ob = o;
	}
	//Метод, возвращающий объект 
	T getOb() {
		return ob;
	}
	//Метод, получающий информацию об имени типа
	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}
class TwoGen<T,V> {
	//Объявление переменных обобщенных типов
	T ob1;
	V ob2;
	//Определение конструктора, в качестве параметров указываем объекты обобщенных типов
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	//Методы, возвращающие объекты 
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	//Метод, получающие информацию об имени типов
	void showTypes() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
}

class pr01 {
	public static void main(String[] args) {
		Gen<String> strOb = new Gen<String>("Один обобщенный тип");
		String str = strOb.getOb();
	       	System.out.println("Значение обобщенного типа с одним параметром: " + str);	
		//Создаем ссылочную переменную на объекты типа Integer и String
		TwoGen<Integer, String> tgOb;
		//Присваиваем ссылку на новые объекты
		tgOb = new TwoGen<Integer, String>(67, "Обобщения");
		//Выводим информацию о типе объектов67
		tgOb.showTypes();
		//Присваиваем целой переменной значение, хранящееся в первом объекте
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();
		//Присваиваем строковой переменной значение, хранящееся во втором объекте
		str = tgOb.getOb2();
		System.out.println("Значение в переменной str: " + str);
	}
}
