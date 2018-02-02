/*
 * helloworld.c
 *
 *  Created on: 2017Äê11ÔÂ29ÈÕ
 *      Author: Hunter
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void transform(char *name);

int main(void)
{
	char name[40];

	printf("Hello World!");
	printf("\nThis is my name.\n");
	scanf("%s",name);
	transform(name);

	return 0;
}

void transform(char *name)
{
	printf("%s",name);
}
