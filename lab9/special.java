public class special {
	int bonus_num; //число бонусов
	int continuation; //длительность в днях
	public special() { //конструктор без параметров
		this.bonus_num = 5;
	}
	public special(int a) { //конструктор с параметром для создания массива
		this.bonus_num = a;
		this.continuation = 1;
	}
	public void output() { //вывод 
		System.out.printf("Number of bonuses: %d\nContinuation: %d\n", bonus_num, continuation);
	}
	public void reduce_bonus() { //сокращение числа бонусов
		System.out.println("\nDecreasing number of bonuses");
		this.bonus_num = bonus_num - 2;
		System.out.println("Number of bonuses decreased on 2");
	}
	public void set_default() { //установка значений по умолчанию
		this.bonus_num = 5;
	}
}