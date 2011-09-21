//
// Triple Play - utilities for use in PlayN-based games
// Copyright (c) 2011, Three Rings Design, Inc. - All rights reserved.
// http://github.com/threerings/tripleplay/blob/master/LICENSE

package tripleplay.ui;

import java.util.List;

import pythagoras.f.Dimension;

/**
 * Defines the interface to layouts, which implement a particular layout policy.
 */
public abstract class Layout
{
    /** An abstract base class for all layout constraints. */
    public static interface Constraint {}

    /**
     * Computes and returns the size needed to arrange children of the supplied elements according
     * to their preferred size, given the specified x and y size hints.
     */
    public abstract Dimension computeSize (Elements<?> elems, float hintX, float hintY);

    /**
     * Lays out the supplied elements into a region of the specified dimensions.
     */
    public abstract void layout (Elements<?> elems, float left, float top,
                                 float width, float height);
}
