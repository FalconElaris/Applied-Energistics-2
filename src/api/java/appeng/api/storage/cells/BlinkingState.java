/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 AlgorithmX2
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package appeng.api.storage.cells;

/**
 * The blinking state of a cell including the speed and duty cycle
 * 
 * @author yueh
 */
public enum BlinkingState {
    OFF(false),

    SLOW(true, 800, 100),

    MEDIUM(true, 400, 100),

    FAST(true, 200, 100);

    private final boolean blinking;
    private final int interval;
    private final int dutyCycle;

    /**
     * @param blinking if it should blink at all
     */
    private BlinkingState(boolean blinking) {
        this(blinking, 0, 0);
    }

    /**
     * @param blinking  if it should blink at all
     * @param interval  the interval in msec
     * @param dutyCycle how long its stays on in an interval in msec
     */
    private BlinkingState(boolean blinking, int interval, int dutyCycle) {
        this.blinking = blinking;
        this.interval = interval;
        this.dutyCycle = dutyCycle;
    }

    public boolean isBlinking() {
        return blinking;
    }

    public int getInterval() {
        return interval;
    }

    public int getDutyCycle() {
        return dutyCycle;
    }

}
