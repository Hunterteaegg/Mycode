#include <stdio.h>
#include "Shape.h"
#include "Rect.h"

int main()
{
    Shape_t s1,s2;

    Shape_constructor(&s1, 0, 1);
    Shape_constructor(&s2, -1, 2);

    printf("Shape s1(x=%d, y=%d)\n", Shape_getX(&s1), Shape_getY(&s1));
    printf("Shape s2(x=%d, y=%d)\n", Shape_getX(&s2), Shape_getY(&s2));

    Shape_moveBy(&s1 ,2 ,-4);
    Shape_moveBy(&s2, 1, -2);

    printf("Shape s1(x=%d, y=%d)\n", Shape_getX(&s1), Shape_getY(&s1));
    printf("Shape s2(x=%d, y=%d)\n", Shape_getX(&s2), Shape_getY(&s2));

    Rectangle_t r1,r2;

    Rectangle_constructor(&r1, 0, 2, 10, 15);
    Rectangle_constructor(&r2, -1, 3, 5, 8);
    Shape_t const *shapes[] = {
        &r1.super,
        &r2.super,
    };

    printf("Rect r1(x=%d, y=%d, width=%d, height=%d)\n", Shape_getX(&r1.super), Shape_getY(&r1.super));
    printf("Rect r2(x=%d, y=%d, width=%d, height=%d)\n", Shape_getX(&r2.super), Shape_getY(&r2.super));

    Shape_moveBy((Shape_t *)&r1, -2, 3);
    Shape_moveBy(&r2.super, 2, -1);

    printf("Rect r1(x=%d, y=%d, width=%d, height=%d)\n", Shape_getX(&r1.super), Shape_getY(&r1.super));
    printf("Rect r2(x=%d, y=%d, width=%d, height=%d)\n", Shape_getX(&r2.super), Shape_getY(&r2.super));

    Shape_t const *s = largestShape(shapes, sizeof(shapes) / sizeof(Shape_t));
    printf("largetsShape s(x=%d, y=%d)\n", Shape_getX(s), Shape_getY(s));

    drawAllShapes(shapes, sizeof(shapes) / sizeof(Shape_t));
    
    return 0;
}