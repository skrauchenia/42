#include <stdio.h>

int main() {
	int c, n1;
	
	c = 0;

	while((n1 = getchar()) != EOF) {
		if (n1 == '\n')
			++c;
	}
	printf("%d\n", c);
}
