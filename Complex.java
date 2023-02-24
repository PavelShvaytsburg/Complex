class Complex{

  int real;
  int image;
  Complex()
  {
    this(0,0);
  }

  Complex(int real, int image)
  {
    this.real = real;
    this.image = image;
  }

  void modul(){
    System.out.println("Модуль числа: "+Math.sqrt(Math.pow(real,2)+ Math.pow(image,2)));
  }

  void argument(){
    try{
      System.out.println("Аргумент числа: "+ Math.toDegrees(Math.atan(image/real)));
    }
    catch(ArithmeticException e){
      System.out.println("Error: " + e.getMessage());
    }
  }

  void summa(int real2, int image2){
    this.real += real2;
    this.image += image2;
    System.out.println("Сумма: "+ this.real+"+ "+this.image+"i");
  }

  void differ(int real2, int image2){
    this.real -= real2;
    this.image -= image2;
    System.out.println("Разность: "+ this.real+"+ "+this.image+"i\n");
  }
}
