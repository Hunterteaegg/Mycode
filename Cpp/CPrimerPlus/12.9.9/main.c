#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#define SIZE 40
char * * mal_ar(int n);
int main(void)
{
	int words, i;
	char * * st;

	printf("How many words do you wish to enter? ");
	scanf("%d", &words);
	getchar();					//�˵��س�
	printf("Enter %d words now:\n", words);
	st = mal_ar(words);
	printf("Here are your words:\n");
	for (i = 0; i < words; i++)
	{
		puts(st[i]);
		free(st[i]);	//�ͷ�ÿ��ָ��ָ����ڴ�
	}
	free(st);			//�ͷ�ָ������

	return 0;
}

char * * mal_ar(int n)
{
	char * * pt;
	int i;

	//��n��ָ����䶯̬�ڴ�ռ䣬����ָ���ָ��
	pt = (char * *)malloc(n * sizeof(char *));
	for (i = 0; i < n; i++)
	{
		//��ÿ��ָ��ָ��ĵ�ַ�����ڴ�ռ�
		pt[i] = (char *)malloc(SIZE * sizeof(char));
		scanf("%s", pt[i]);		//���뵥��
	}

	return pt;
}
