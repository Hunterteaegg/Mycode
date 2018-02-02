#include <stdio.h>
#include <stdlib.h>

void br(void);
void ic(void);

int main()
{
    void br(void)
    {
        printf("Brazil,Russia");
    }
    void ic(void)
    {
        printf("India,China");
    }

    br();
    printf(",");
    ic();
    printf("\n");
    ic();
    printf(",\n");
    br();
    return 0;
}
