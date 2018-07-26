package org.intermine.objectstore.query;

/*
 * Copyright (C) 2002-2018 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

/**
 * An element that can appear in the ORDER BY clause of a query.
 *
 * @author Matthew Wakeling
 */
public interface QueryOrderable
{
    /**
     * Get Java type represented by this item.
     *
     * @return class describing the type
     */
    Class<?> getType();
}

