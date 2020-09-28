#include <stdio.h>

int main()
{
  int fahr;

  printf("%5s\t%5s", "Fahr", "Celc\n");
  printf("------------------\n");

  for (fahr = 0; fahr <= 300; fahr += 20) {
    printf("%5d\t%5.1f\n", fahr, (5.0/9.0)*(fahr - 32));
  }

  printf("\n");

  int celc;

  printf("%5s\t%5s", "Celc", "Fahr\n");
  printf("------------------\n");

  for (celc = 0; celc <= 300; celc += 20) {
    printf("%5d\t%5.1f\n", celc, ((9.0 * celc)/5.0) + 32);
  }

  printf("Reverse\n");

  for (fahr = 300; fahr >= 0; fahr -= 20) {
    printf("%5d\t%5.1f\n", fahr, (5.0/9.0)*(fahr - 32));
  }
}
