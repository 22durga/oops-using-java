class Power {
  public static void main(String[] args) {

    int base = 3, power = 4;

    long result = 1;

    while (power != 0) {
      result *= base;
      --power;
    }

    System.out.println("Answer = " + result);
  }
}
