#include <stdio.h>
#include <stdlib.h>

void one_three(void);
void two(void);

int main()
{
    void two(void)
    {
        printf("two\n");
    }
    void one_three(void)
    {
        printf("one\n");
        two();
        printf("three\n");
    }

    printf("starting now:\n");
    one_three();
    printf("done!\n");

    return 0;
}
