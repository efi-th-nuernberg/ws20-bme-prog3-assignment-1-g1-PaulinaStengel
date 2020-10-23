class Main {
    public static void main(String[] args) {
    
    zahlenfilter();

    }

    public static void zahlenfilter() {
  for (int i = 1; i<=200; i++){
    if ((i%5)==0 && (i!=0)) {
      System.out.println(i + ":" + " ZAHL ist durch 5 teilbar");
    }

    if ((i%10)==9 && (i!=0)) {
      System.out.println(i + ":" + " ZAHL endet auf 9");
    }

    if(((i + (i-1))%3)==0 && (i!=0)) {
      System.out.println(i + ":" + " ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
    }
  }
 }
}
  