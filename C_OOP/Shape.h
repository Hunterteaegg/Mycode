#ifndef __SHAPE_H__
#define __SHAPE_H__

#include <stdint.h>

typedef struct {
    struct ShapeVtbl const *vptr;
    int16_t x;
    int16_t y;
} Shape_t;

struct ShapeVtbl{
    uint32_t (*area)(Shape_t const * const me);
    void (*draw)(Shape_t const * const me);
};

void Shape_constructor(Shape_t* const me, int16_t x, int16_t y);
void Shape_moveBy(Shape_t* const me, int16_t dx, int16_t dy);
int16_t Shape_getX(Shape_t const * const me);
int16_t Shape_getY(Shape_t const * const me);

static inline uint32_t Shape_area(Shape_t const * const me)
{
    return (me->vptr->area)(me);
}

static inline void Shape_draw(Shape_t const * const me)
{
    (me->vptr->draw)(me);
}

Shape_t const *largestShape(Shape_t const *shapes[], uint32_t nShapes);
void drawAllShapes(Shape_t const *shapes[], uint32_t nShapes);

#endif