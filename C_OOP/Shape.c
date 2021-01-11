#include "Shape.h"
#include <assert.h>

static uint32_t Shape_area_(Shape_t const * const me);
static void Shape_draw_(Shape_t const * const me);

void Shape_constructor(Shape_t* const me, int16_t x, int16_t y)
{
    static struct ShapeVtbl const vtbl = {
        Shape_area_,
        Shape_draw_,
    };
    me->vptr = &vtbl;

    me->x = x;
    me->y = y;
}

void Shape_moveBy(Shape_t* const me, int16_t dx, int16_t dy)
{
    me->x += dx;
    me->y += dy;
}

int16_t Shape_getX(Shape_t const * const me)
{
    return me->x;
}

int16_t Shape_getY(Shape_t const * const me)
{
    return me->y;
}

static uint32_t Shape_area_(Shape_t const * const me)
{
    assert(0);

    return 0;
}

static void Shape_draw_(Shape_t const * const me)
{
    assert(0);
}

Shape_t const *largestShape(Shape_t const *shapes[], uint32_t nShapes)
{
    Shape_t const *s = (Shape_t*)0;
    uint32_t max = 0U;
    
    for(uint32_t i = 0U; i < nShapes; ++i)
    {
        uint32_t area = Shape_area(shapes[i]);
        if(area > max)
        {
            max = area;
            s = shapes[i];
        }
    }

    return s;
}

void drawAllShapes(Shape_t const *shapes[], uint32_t nShapes)
{
    for(uint32_t i = 0U; i < nShapes; ++i)
    {
        Shape_draw(shapes[i]);
    }
}