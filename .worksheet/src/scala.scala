object scala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(27); 
	val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(28); 
	val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(40); 
	val mapa =  Map(1 ->"Luis", 2->"Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(18); val res$0 = 
	
	lista.map{_+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(7); val res$1 = 
	lista;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(26); val res$2 = 
	
	lista.filter{x => x<3};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(46); 
	
	val names = List("Juan","Carlos","Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(23); val res$3 = 
	names.map{_.length()};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(62); 
	
	//Kata 1: Pares de una lista
	val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(24); val res$4 = 
	pares.filter{_%2 == 0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(160); 
	
	//Kata 2: Encontrar los datos de una persona dado el nombre
	
	val megaLista = List(List("Andres", "24 years", "male"),List("Angela", "31 years", "female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(37); val res$5 = 
	megaLista.filter( _(0) == "Andres");System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(50); val res$6 = 
	megaLista.filter(_(0) == "Andres")(0).slice(1,3);System.out.println("""res6: List[String] = """ + $show(res$6));$skip(84); 
 
	//Kata 3: Encontrar los numeros primos de una lista
	val list = List.range(1,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(88); val res$7 = 
	list.filter{x => list.filter{y => y < Math.sqrt(x)}.filter{z => x%z == 0}.length == 1};System.out.println("""res7: List[Int] = """ + $show(res$7))}
}
