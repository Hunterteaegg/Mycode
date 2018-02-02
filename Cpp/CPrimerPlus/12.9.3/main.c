#include <stdio.h>
#include "pel2-2a.h"

int main()
{
    int mode=0;
    float distance=0,fuel=0;

    printf("Enter 0 for metric mode,1 for US mode: ");
    scanf("%d",&mode);
    while(mode>=0)
    {
        set_mode(&mode);
        get_info(&mode,&distance,&fuel);
        show_info(&mode,&distance,&fuel);
        printf("(-1 to quit):");
        scanf("%d",&mode);
    }
    printf("Done.\n");

    return 0;
}

