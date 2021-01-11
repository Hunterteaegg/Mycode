#include "Rect.h"
#include "Shape.h"
#include <stdio.h>

static uint32_t Rectangle_area_(Shape_t const * const me);
static void Rectangle_draw_(Shape_t const * const me);

void Rectangle_constructor(Rectangle_t* const me, int16_t x, int16_t y, uint16_t width, uint16_t height)
{
    static struct ShapeVtbl const  vtbl = {
        Rectangle_area_,
        Rectangle_draw_,
    };    
    Shape_constructor(&(me->super), x, y);

    me->super.vptr = &vtbl;
    me->width = width;
    me->height = height;
}

static uint32_t Rectangle_area_(Shape_t const * const me)
{
    Rectangle_t const * const me_ = (Rectangle_t const *)me;
    
    return (uint32_t)me_->width * (uint32_t)me_->width;
}

static void Rectangle_draw_(Shape_t const * const me)
{
    Rectangle_t const * const me_ = (Rectangle_t const *)me;
    printf("Rectangle_draw_(x=%d, y=%d, width=%d, height=%d)\n", Shape_getX(me), Shape_getY(me), me_->width, me_->height);
}