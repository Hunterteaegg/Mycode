#ifndef __RECT_H__
#define __RECT_H__

#include "Shape.h"

typedef struct {
    Shape_t super;

    uint16_t width;
    uint16_t height;    
} Rectangle_t;

void Rectangle_constructor(Rectangle_t* const me, int16_t x, int16_t y, uint16_t width, uint16_t height);

#endif