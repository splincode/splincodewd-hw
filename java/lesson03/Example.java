/* 

В среде Java все действия программы осуществля­ются внутри класса.
В этом состоит одна из причин того, что все программы Java
являются объектно-ориентированными.

*/

class Example {
  
  // Программа начинается с обращения к main()
  // Выполнение всех при­ ложений Java начинается с вызова метода main ()

  // public — модификатор доступа, который позволяет програм­мисту управлять 
  // видимостью членов класса. 
  // Когда члену класса предшествует клю­чевое слово public, 
  // этот член доступен коду, расположенному вне класса,
  // в котором определен данный член

  // Ключевое слово static позволяет вызывать метод main () 
  // без конкретизации экземпляра класса. Это необходимо потому, что метод
  // main () вызывается виртуальной машиной Java до создания каких-либо объектов.
  // Ключевое слово void просто сообщает компилятору, что метод main () 
  // не возвращает никаких значений

  // Часть String args [] объявляет параметр args, который представляет
  // собой массив экземпляров класса String.
  // (Массивы — это коллекции аналогичных объектов) 
  // Объекты типа String хранят символьные строки

  public static void main(String args[]) {
    
    // Строка начинается с идентификатора потока System.out
    // System — это предопределенный класс, который предоставляет доступ к системе,
    // а его переменная-член out — вы­ходной поток, связанный с консолью

    System.out.println("Простая программа Java");
  }
}