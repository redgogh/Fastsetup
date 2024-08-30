package com.redgogh.examples;

/* -------------------------------------------------------------------------------- *\
|*                                                                                  *|
|*    Copyright (C) 2023 RedGogh                                                    *|
|*                                                                                  *|
|*    This program is free software: you can redistribute it and/or modify          *|
|*    it under the terms of the GNU General Public License as published by          *|
|*    the Free Software Foundation, either version 3 of the License, or             *|
|*    (at your option) any later version.                                           *|
|*                                                                                  *|
|*    This program is distributed in the hope that it will be useful,               *|
|*    but WITHOUT ANY WARRANTY; without even the implied warranty of                *|
|*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                 *|
|*    GNU General Public License for more details.                                  *|
|*                                                                                  *|
|*    You should have received a copy of the GNU General Public License             *|
|*    along with this program.  If not, see <https://www.gnu.org/licenses/>.        *|
|*                                                                                  *|
|*    This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.    *|
|*    This is free software, and you are welcome to redistribute it                 *|
|*    under certain conditions; type `show c' for details.                          *|
|*                                                                                  *|
\* -------------------------------------------------------------------------------- */

import com.redgogh.vortextools.time.TimeUnitOperator;
import com.redgogh.vortextools.time.UDate;
import org.junit.Test;

import static com.redgogh.vortextools.RedGogh.printf;

@SuppressWarnings("ALL")
public class TimeUnitOperatorExample {

    /**
     * TimeUnitOperator：时间加一天
     */
    @Test
    public void timeUnitAddOperateExample() {
        printf("TimeUnitOperator DAY add 1 example: %s\n", TimeUnitOperator.DAYS.add(1));
    }

    /**
     * TimeUnitOperator：时间减一天
     */
    @Test
    public void timeUnitMinusOperateExample() {
        printf("TimeUnitOperator DAY minus 1 example: %s\n", TimeUnitOperator.DAYS.minus(1));
    }

    /**
     * UDate：时间加一周
     */
    @Test
    public void udateAddOperateExample() {
        printf("UDate WEEKs add 1 week example: %s\n", new UDate().add(TimeUnitOperator.WEEKS, 1));
    }

    /**
     * UDate：时间减一周
     */
    @Test
    public void udateMinusOperateExample() {
        printf("UDate WEEKs minus 1 week example: %s\n", new UDate().minus(TimeUnitOperator.WEEKS, 1));
    }

}
